package com.example.traveloffice.model;

public abstract class Trip {

    protected LocalDate start;
    protected LocalDate end;
    protected String destination;
    protected int price;

    ///////////////////////////////////////////////////// GETTERS /////////////////////////////////////////////////////

    /**
     * Method get the start date of trip.
     * @return start date.
     */
    public LocalDate getStart() {
        return start;
    }

    /**
     * Method get the end date of trip.
     * @return end date.
     */
    public LocalDate getEnd() {
        return end;
    }

    /**
     * Method get the destination of trip.
     * @return destination of trip.
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Method get the price of trip.
     * @return price of trip.
     */
    public int getPrice() {
        return price;
    }

    ///////////////////////////////////////////////////// SETTERS /////////////////////////////////////////////////////

    /**
     * Method set the start date of trip.
     * @param start date of trip.
     */
    public void setStart(LocalDate start) {
        this.start = start;
    }

    /**
     * Method set the end date of trip.
     * @param end date of trip.
     */
    public void setEnd(LocalDate end) {
        this.end = end;
    }

    /**
     * Method set the destination of trip.
     * @param destination of trip.
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Method set the price of trip.
     * @param price of trip.
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /////////////////////////////////////////////////// CONSTRUCTOR ///////////////////////////////////////////////////

//    /**
//     * Method constructs object trip.
//     * @param start date of trip.
//     * @param end date of trip.
//     * @param destination of trip.
//     * @param price of trip.
//     */
//    public Trip(LocalDate start, LocalDate end, String destination, int price) {
//        this.start = start;
//        this.end = end;
//        this.destination = destination;
//        this.price = price;
//    }

    ///////////////////////////////////////////////////// METHODS /////////////////////////////////////////////////////

    /**
     * Method prepare info about Trip.
     * @return trip data.
     */
    @Override
    public String toString() {
        return "start: " + this.start.toString() + " " + "End: " + this.end.toString()
                + this.destination + " " + this.price;
    }
}
