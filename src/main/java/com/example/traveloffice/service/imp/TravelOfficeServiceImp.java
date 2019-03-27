package com.example.traveloffice.service.imp;

import com.example.traveloffice.model.AbroadTrip;
import com.example.traveloffice.model.Customer;
import com.example.traveloffice.model.Trip;
import com.example.traveloffice.service.TravelOfficeService;
import org.springframework.stereotype.Service;

@Service
public class TravelOfficeServiceImp implements TravelOfficeService {

    ////////////////////////////////////////////// CUSTOMER METHODS ///////////////////////////////////////////////

    @Override
    public String showAllCustomers() {
        return travelOffice.showAllCustomers();
    }

    @Override
    public boolean addCustomer(Customer customer) {
        return travelOffice.addCustomer(customer);
    }

    @Override
    public boolean removeCustomer(String name) {
        return false;
    }

    ///////////////////////////////////////////////// TRIP METHODS //////////////////////////////////////////////////

    @Override
    public String showAllTrips() {
        return travelOffice.showAllTrips();
    }

    @Override
    public void addTrip(String description, Trip trip) {
         travelOffice.addTrip(description, trip);
    }

    @Override
    public boolean removeTrip(String description) {
        return false;
    }
}
