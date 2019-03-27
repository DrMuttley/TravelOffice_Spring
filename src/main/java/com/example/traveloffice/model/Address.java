package com.example.traveloffice.model;

public class Address {

    private String street;
    private String zip;
    private String city;

    ///////////////////////////////////////////////////// GETTERS /////////////////////////////////////////////////////

    /**
     * Method get the street of address.
     * @return street of address.
     */
    public String getStreet() {
        return street;
    }

    /**
     * Method get the zip of address.
     * @return zip of address.
     */
    public String getZip() {
        return zip;
    }

    /**
     * Method get the city of address.
     * @return city of address.
     */
    public String getCity() {
        return city;
    }

    ///////////////////////////////////////////////////// SETTERS /////////////////////////////////////////////////////

    /**
     * Method set the street of address.
     * @param street of customer.
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Method set the zip of address.
     * @param zip of customer.
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * Method set the city of address.
     * @param city of customer.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /////////////////////////////////////////////////// CONSTRUCTORS ///////////////////////////////////////////////////

//    /**
//     * Method constructs object Address.
//     * @param street of address.
//     * @param zip of address.
//     * @param city of address.
//     */
//    public Address(String street, String zip, String city) {
//        this.street = street;
//        this.zip = zip;
//        this.city = city;
//    }

    ///////////////////////////////////////////////////// METHODS /////////////////////////////////////////////////////

    /**
     * Method prepare info about address.
     * @return address data.
     */
    @Override
    public String toString(){
        return street + " " + zip + " " + city;
    }
}
