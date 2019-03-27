package com.example.traveloffice.model;

public class LocalDate {

    private int year;
    private int month;
    private int day;

    ///////////////////////////////////////////////////// GETTERS /////////////////////////////////////////////////////

    /**
     * Method get the year of date.
     * @return year of date.
     */
    public int getYear() {
        return year;
    }

    /**
     * Method get the month of date.
     * @return month of date.
     */
    public int getMonth() {
        return month;
    }

    /**
     * Method get the day of date.
     * @return day of date.
     */
    public int getDay() {
        return day;
    }

    ///////////////////////////////////////////////////// SETTERS /////////////////////////////////////////////////////

    /**
     * Method set the year of date.
     * @param year of date.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Method set the month of date.
     * @param month of date.
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Method set the day of date.
     * @param day of date.
     */
    public void setDay(int day) {
        this.day = day;
    }

    /////////////////////////////////////////////////// CONSTRUCTOR ///////////////////////////////////////////////////

    /**
     * Method constructs object LocalDate.
     * @param year of date.
     * @param month of date.
     * @param day of date
     */
    public LocalDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }


    ///////////////////////////////////////////////////// METHODS /////////////////////////////////////////////////////

    /**
     * Method prepare info about LocalDate.
     * @return date.
     */
    @Override
    public String toString(){

        String returnDate = this.year + ", " + this.month + ", " + this.day + " ";

        return returnDate;
    }

    /**
     * Method build LocalDate object from string.
     * @param stringDate of date.
     * @return object LocalDate.
     */
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
