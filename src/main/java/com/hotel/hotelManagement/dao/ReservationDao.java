package com.hotel.hotelManagement.dao;

import com.hotel.hotelManagement.model.Reservation;

import java.util.Date;
import java.util.List;

public interface ReservationDao {
    int createReservation(String firstName, String lastName, String roomName, Date fromDate, Date toDate);
    void cancelReservation(long reservationId);
    List<Reservation> getAllActiveReservation();
    List<Reservation>getAllReservationByPeriod(int numberDays);
    List<Reservation>getAllReservationForTheNextDays();

}
