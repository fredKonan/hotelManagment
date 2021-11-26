package com.hotel.hotelManagement.dao;

import com.hotel.hotelManagement.model.Billing;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JDBCBillingDao implements BillingDao{


    private final JdbcTemplate jdbcTemplate;

    public JDBCBillingDao(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public List<Billing> getAllActiveBilling() {
        List<Billing> billingList = new ArrayList<>();
        String sql ="SELECT * FROM billing";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
        while(result.next()){

            Billing billing = rowMap(result);
            billingList.add(billing);
        }
        return billingList;
    }



    @Override
    public Billing getCustomerBillingStatement(String firstName, String lastName) {
        Billing billing = new Billing();
        String sql = "SELECT * FROM billing WHERE first_name =? AND last_name =?";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, firstName,lastName);
        while(result.next()){
          billing = rowMap(result);
        }
        return billing;
    }

    @Override
    public int createCustomerBillingStatement(long reservationId) {
        String sql = "INSERT INTO billing (first_name, last_name, number_of_nights,unit_price, is_paid) "+
                "VALUES(?,?,?,?,?,?) RETURNING billing_id";
        String sql1 = "SELECT first_name FROM reservation WHERE reservation_id="+reservationId;
        String sql2 = "SELECT last_name FROM reservation WHERE reservation_id="+reservationId;
        String sql3 = "SELECT DATEDIFF(days, from_date, to_date) FROM reservation WHERE reservation_id= "+reservationId;
        String sql4 ="SELECT price FROM room JOIN reservation ON room.name = reservation.room_name WHERE reservation.reservation_id= "+reservationId;
        return jdbcTemplate.update(sql,Integer.class,sql1,sql2,sql3,sql4,true);
    }

    @Override
    public void deleteBillingStatement(long id) {
    String sql = "DELETE FROM billing WHERE billing_id =?";
    jdbcTemplate.update(sql,id);
    }


    private Billing rowMap(SqlRowSet result) {
        long id = result.getLong("billing_id");
        String firstName = result.getString("first_name");
        String lastName = result.getString("last_name");
        int numberOfNight = result.getInt("number_of_nights");
        long roomId = result.getLong("room_id");
        double unitPrice = result.getDouble("unit_price");
        double totalPrice = result.getDouble("total_price");
        boolean isPaid = result.getBoolean("is_paid");
        return new Billing(id,firstName,lastName,numberOfNight,roomId,unitPrice,totalPrice,isPaid);

    }
}
