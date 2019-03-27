package com.example.traveloffice.model;

public class Customer {

    private String name;
    private Address address;
    private Trip trip;

    public String getName() {
        return this.name;
    }

    public Address getAddress() {
        return address;
    }

    public Trip getTrip() {
        return this.trip;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Customer(String name, Address address, Trip trip) {
        this.name = name;
        this.address = address;
        this.trip = trip;
    }

    public void assignTrip(Trip trip) {
        this.trip = trip;
    }

    @Override
    public String toString(){

        String customerData = name;

        if(address != null){
            customerData += " " + address.toString();
        }
        if(trip != null){
            customerData += " " + trip.toString();
        }
        return customerData;
    }
}
