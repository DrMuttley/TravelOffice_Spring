package com.example.traveloffice.service.imp;

import com.example.traveloffice.model.*;
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
    public boolean removeCustomer(Customer customer) {
        try{
            travelOffice.removeCustomer(customer);
            return true;
        }catch (NoSuchCustomerException e){
            e.getMessage();
            return false;
        }
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
        try{
            travelOffice.removeTrip(description);
            return true;
        }catch (NoSuchTripException e){
            e.getMessage();
            return false;
        }
    }

    ////////////////////////////////////////////////// OTHER METHODS ///////////////////////////////////////////////////

    @Override
    public boolean assignTrip(Customer customer, String trip) {
        try{
            travelOffice.assignTrip(customer, trip);
            return true;
        }catch (NoSuchCustomerException e){
            e.getMessage();
            return false;
        }
    }
}
