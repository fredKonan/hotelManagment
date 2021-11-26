package com.hotel.hotelManagement.dao;

import com.hotel.hotelManagement.model.Room;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class JDBCRoomDao implements RoomDao {
    private final JdbcTemplate jdbcTemplate;

    public JDBCRoomDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Room getRoomByNameAndBedSize(String name, String bedSize) {
        return null;
    }

    @Override
    public List<Room> getRoomByPriceRange(double lowPrice, double HighPrice) {
        return null;
    }

    @Override
    public List<Room> getRoomByBedSize(String bedSize) {
        return null;
    }

    @Override
    public List<Room> getRoomByBedNumber(int bedNumber) {
        return null;
    }
}
