package com.example.traveloffice.service;

import com.example.traveloffice.model.AbroadTrip;
import com.example.traveloffice.model.Customer;
import com.example.traveloffice.model.TravelOffice;
import com.example.traveloffice.model.Trip;

public interface TravelOfficeService {

    TravelOffice travelOffice = new TravelOffice();

    String showAllCustomers();

    boolean addCustomer(Customer customer);

    boolean removeCustomer(String name);

    String showAllTrips();

    void addTrip(String description, Trip trip);

    boolean removeTrip(String description);
}
