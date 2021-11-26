package com.hotel.hotelManagement.dao;

import com.hotel.hotelManagement.model.Reservation;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JDBCReservationDao implements ReservationDao{

    private final JdbcTemplate jdbcTemplate;

    public JDBCReservationDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int createReservation(String firstName, String lastName, String roomName, Date fromDate, Date toDate) {
        String sql ="INSERT INTO reservation(first_name, last_name,room_name,from_date,to_date,is_active) VALUES(?,?,?,?,?,?) RETURNING reservation_id";
       return jdbcTemplate.update(sql,Integer.class,firstName,lastName,roomName,fromDate,toDate,true);
    }

    @Override
    public void cancelReservation(long reservationId) {
    String sql ="UPDATE reservation SET is_active = false WHERE reservation_id=?";
    jdbcTemplate.update(sql,reservationId);
    }

    @Override
    public List<Reservation> getAllActiveReservation() {
      List<Reservation> reservationList = new ArrayList<>();
      String sql ="SELECT * FROM reservation WHERE is_active= true";
      SqlRowSet rs = jdbcTemplate.queryForRowSet(sql);
      while(rs.next()){
          Reservation reservation= rowMap(rs);
          reservationList.add(reservation);
      }
      return reservationList;
    }

    private Reservation rowMap(SqlRowSet rs) {
        long id = rs.getLong("reservation_id");
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        String roomName = rs.getString("room_name");
        LocalDate fromDate = rs.getDate("from_date").toLocalDate();
        LocalDate toDate = rs.getDate("to_date").toLocalDate();
        LocalDate createDate = rs.getDate("create_date").toLocalDate();
        boolean isActive = rs.getBoolean("is_active");
        return new Reservation(id,firstName,lastName,fromDate,toDate,roomName,isActive,createDate);
    }

    @Override
    public List<Reservation> getAllReservationByPeriod(int numberDays) {
        List<Reservation> reservationList = new ArrayList<>();
        String sql ="SELECT * FROM reservation WHERE from_date> CURRENT_DATE AND to_date<=CURRENT_DATE +?";
        SqlRowSet rs = jdbcTemplate.queryForRowSet(sql,numberDays);
        while(rs.next()){
            Reservation reservation = rowMap(rs);
            reservationList.add(reservation);
        }
        return reservationList;
    }

    @Override
    public List<Reservation> getAllReservationForTheNextDays() {
        List<Reservation> reservationList = new ArrayList<>();
        String sql ="SELECT * FROM reservation WHERE from_date = CURRENT_DATE + '1'";
        SqlRowSet rs = jdbcTemplate.queryForRowSet(sql);
        while(rs.next()){
            Reservation reservation = rowMap(rs);
            reservationList.add(reservation);
        }
        return reservationList;
    }
}
