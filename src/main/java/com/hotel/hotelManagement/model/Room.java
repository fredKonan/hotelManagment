package com.hotel.hotelManagement.model;

public class Room {
    private long room_id;
    private String name;
    private String bed_size;
    private int bed_number;
    private  double price;

    public Room() {
    }

    public Room(long room_id, String name, String bed_size, int bed_number, double price) {
        this.room_id = room_id;
        this.name = name;
        this.bed_size = bed_size;
        this.bed_number = bed_number;
        this.price = price;
    }

    public long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(long room_id) {
        this.room_id = room_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBed_size() {
        return bed_size;
    }

    public void setBed_size(String bed_size) {
        this.bed_size = bed_size;
    }

    public int getBed_number() {
        return bed_number;
    }

    public void setBed_number(int bed_number) {
        this.bed_number = bed_number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "room_id=" + room_id +
                ", name='" + name + '\'' +
                ", bed_size='" + bed_size + '\'' +
                ", bed_number=" + bed_number +
                ", price=" + price +
                '}';
    }
}
