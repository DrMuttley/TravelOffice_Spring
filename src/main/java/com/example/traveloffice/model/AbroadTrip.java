package com.example.traveloffice.model;

public class AbroadTrip extends Trip {

    private int insurance;

    ///////////////////////////////////////////////////// GETTERS /////////////////////////////////////////////////////

    /**
     * Method calculated the price of trip with insurance.
     * @return price of trip with insurance.
     */
    @Override
    public int getPrice(){
        return super.getPrice() + this.insurance;
    }

    /**
     * Method get the insurance of trip.
     * @return insurance of trip.
     */
    public int getInsurance() {
        return insurance;
    }

    ///////////////////////////////////////////////////// SETTERS /////////////////////////////////////////////////////

    /**
     * Method set the insurance of trip.
     * @param insurance of trip.
     */
    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }

    /////////////////////////////////////////////////// CONSTRUCTORS ///////////////////////////////////////////////////

    /**
     * Method constructs object AbroadTrip.
     * @param start date of abroad trip.
     * @param end date of abroad trip.
     * @param destination of abroad trip.
     * @param price of abroad trip.
     */
    public AbroadTrip(LocalDate start, LocalDate end, String destination, int price) {
        super(start, end, destination, price);
    }
}
