package com.example.traveloffice.model;

public class Customer {

    private String name;
    private Address address;
    private Trip trip;

    ///////////////////////////////////////////////////// GETTERS /////////////////////////////////////////////////////

    /**
     * Method get the name of customer.
     * @return name of customer.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Method get the address of customer.
     * @return address of customer.
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Method get the trip of customer.
     * @return trip of customer.
     */
    public Trip getTrip() {
        return this.trip;
    }

    ///////////////////////////////////////////////////// SETTERS /////////////////////////////////////////////////////

    /**
     * Method set the name of customer.
     * @param name of customer.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method set the address of customer.
     * @param address of customer.
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Method set the trip of customer.
     * @param trip of customer.
     */
    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    /////////////////////////////////////////////////// CONSTRUCTOR ///////////////////////////////////////////////////

    /**
     * Method constructs object Customer.
     * @param name of customer.
     * @param address of customer.
     * @param trip of customer.
     */
    public Customer(String name, Address address, Trip trip) {
        this.name = name;
        this.address = address;
        this.trip = trip;
    }

    ///////////////////////////////////////////////////// METHODS /////////////////////////////////////////////////////

    /**
     * Method assign trio to customer.
     * @param trip to assign.
     */
    public void assignTrip(Trip trip) {
        this.trip = trip;
    }


    /**
     * Method prepare info about customer.
     * @return customer data.
     */
    @Override
    public String toString(){

        StringBuffer customerData = new StringBuffer();

        customerData.append(name + " " + address.toString());

        if(trip != null){
            customerData.append(" " + trip.toString());
        }
        return customerData.toString();
    }
}
