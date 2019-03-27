package com.example.traveloffice.model;

public class LocalDate {

    private int year;
    private int mounth;
    private int day;

    public LocalDate(int year, int mounth, int day){

        this.year = year;
        this.mounth = mounth;
        this.day = day;
    }

    @Override
    public String toString(){

        String returnDate = this.year + ", " + this.mounth + ", " + this.day + " ";

        return returnDate;
    }

    public static LocalDate of(String stringDate){

        if(stringDate.length() == 10) {

            int year = Integer.parseInt(stringDate.substring(0, 4));
            int month = Integer.parseInt(stringDate.substring(5, 7));
            int day = Integer.parseInt(stringDate.substring(8, 10));

            return new LocalDate(year, month, day);
        }else{
            return null;
        }
    }
}
