package com.example.traveloffice.service;

import com.example.traveloffice.model.AbroadTrip;
import com.example.traveloffice.model.Customer;
import com.example.traveloffice.model.TravelOffice;
import com.example.traveloffice.model.Trip;

public interface TravelOfficeService {

    TravelOffice travelOffice = new TravelOffice();

    ///////////////////////////////////////////////// CUSTOMER METHODS /////////////////////////////////////////////////

    boolean addCustomer(Customer customer);

    boolean removeCustomer(Customer customer);

    String showAllCustomers();

    ////////////////////////////////////////////////// TRIPS METHODS ///////////////////////////////////////////////////

    void addTrip(String description, Trip trip);

    boolean removeTrip(String description);

    String showAllTrips();

    ////////////////////////////////////////////////// OTHER METHODS ///////////////////////////////////////////////////

    boolean assignTrip(Customer customer, String trip);
}
