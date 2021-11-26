package com.hotel.hotelManagement.model;

import java.time.LocalDate;

public class Reservation {
    private long reservation_id;
    private String first_name;
    private String last_name;
    private LocalDate from_date;
    private LocalDate to_date;
    private String room_name;
    private boolean is_active;
    private LocalDate create_date;

    public Reservation() {
    }

    public Reservation(long reservation_id, String first_name, String last_name, LocalDate from_date, LocalDate to_date, String room_name, boolean is_active,LocalDate create_date) {
        this.reservation_id = reservation_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.from_date = from_date;
        this.to_date = to_date;
        this.room_name = room_name;
        this.is_active = is_active;
        this.create_date = create_date;
    }

    public long getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(long reservation_id) {
        this.reservation_id = reservation_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public LocalDate getFrom_date() {
        return from_date;
    }

    public void setFrom_date(LocalDate from_date) {
        this.from_date = from_date;
    }

    public LocalDate getTo_date() {
        return to_date;
    }

    public void setTo_date(LocalDate to_date) {
        this.to_date = to_date;
    }

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public LocalDate getCreate_date() {
        return create_date;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservation_id=" + reservation_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", from_date=" + from_date +
                ", to_date=" + to_date +
                ", room_name='" + room_name + '\'' +
                ", is_active=" + is_active +
                ", create_date=" + create_date +
                '}';
    }
}
