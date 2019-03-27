package com.example.traveloffice.model;

public abstract class Trip {

    private LocalDate start;
    private LocalDate end;
    private String destination;
    private int price;

    public int getPrice() {
        return price;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Trip(LocalDate start, LocalDate end, String destination, int price) {
        this.start = start;
        this.end = end;
        this.destination = destination;
        this.price = price;
    }

    @Override
    public String toString() {
        return "start: " + this.start.toString() + " " + "End: " + this.end.toString() + this.destination + " " + getPrice();
    }
}
