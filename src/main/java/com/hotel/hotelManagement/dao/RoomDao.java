package com.hotel.hotelManagement.dao;

import com.hotel.hotelManagement.model.Room;

import java.util.List;

public interface RoomDao {
    Room getRoomByNameAndBedSize(String name, String bedSize);
    List<Room> getRoomByPriceRange(double lowPrice, double HighPrice);
    List<Room> getRoomByBedSize(String bedSize);
    List<Room> getRoomByBedNumber(int bedNumber);
}
