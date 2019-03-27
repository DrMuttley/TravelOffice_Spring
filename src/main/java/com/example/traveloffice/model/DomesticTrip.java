package com.example.traveloffice.model;

public class DomesticTrip extends Trip {

    private int ownArrivalDiscount;

    ///////////////////////////////////////////////////// GETTERS /////////////////////////////////////////////////////

    /**
     * Method calculated the price of trip with discount.
     * @return price of trip after discount.
     */
    @Override
    public int getPrice(){
        return super.getPrice() - this.ownArrivalDiscount;
    }

    /**
     * Method get the discount of trip.
     * @return discount of trip.
     */
    public int getOwnArrivalDiscount() {
        return ownArrivalDiscount;
    }

    ///////////////////////////////////////////////////// SETTERS /////////////////////////////////////////////////////

    /**
     * Method set the discount of trip.
     * @param discount of trip.
     */
    public void setOwnArrivalDiscount(int discount) {
        this.ownArrivalDiscount = discount;
    }

    /////////////////////////////////////////////////// CONSTRUCTORS ///////////////////////////////////////////////////

    /**
     * Method constructs object DomesticTrip.
     * @param start date of abroad trip.
     * @param end date of abroad trip.
     * @param destination of abroad trip.
     * @param price of abroad trip.
     */
    public DomesticTrip(LocalDate start, LocalDate end, String destination, int price) {
        super(start, end, destination, price);
    }
}
