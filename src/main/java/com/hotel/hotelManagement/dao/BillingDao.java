package com.hotel.hotelManagement.dao;

import com.hotel.hotelManagement.model.Billing;

import java.util.List;

public interface BillingDao {
    List<Billing> getAllActiveBilling();
    Billing getCustomerBillingStatement(String firstName, String lastName);
    int createCustomerBillingStatement(long reservationId);
    void deleteBillingStatement(long id);

}
