package com.hotel.hotelManagement.model;

public class Billing {
    private long billing_id;
    private String first_name;
    private String last_name;
    private int number_of_nights;
    private long room_id;
    private double unit_price;
    private double total_price;
    boolean is_paid;

    public Billing() {
    }

    public Billing(long billing_id, String first_name, String last_name, int number_of_nights, long room_id, double unit_price, double total_price, boolean is_paid) {
        this.billing_id = billing_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.number_of_nights = number_of_nights;
        this.room_id = room_id;
        this.unit_price = unit_price;
        this.total_price = total_price;
        this.is_paid = is_paid;
    }

    public long getBilling_id() {
        return billing_id;
    }

    public void setBilling_id(long billing_id) {
        this.billing_id = billing_id;
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

    public int getNumber_of_night() {
        return number_of_nights;
    }

    public void setNumber_of_night(int number_of_night) {
        this.number_of_nights = number_of_night;
    }

    public long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(long room_id) {
        this.room_id = room_id;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price() {
        double TAX_RATE = 7.5;
        this.total_price = (number_of_nights* unit_price)*(TAX_RATE +1);
    }

    public boolean isIs_paid() {
        return is_paid;
    }

    public void setIs_paid(boolean is_paid) {
        this.is_paid = is_paid;
    }

    @Override
    public String toString() {
        return "Billing{" +
                "billing_id=" + billing_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", number_of_night=" + number_of_nights +
                ", room_id=" + room_id +
                ", unit_price=" + unit_price +
                ", total_price=" + total_price +
                ", is_paid=" + is_paid +
                '}';
    }
}
