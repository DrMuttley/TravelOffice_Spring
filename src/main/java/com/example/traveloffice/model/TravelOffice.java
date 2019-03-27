package com.example.traveloffice.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class TravelOffice {

    private Set<Customer> customersSet;
    private Map<String, Trip> tripsMap;

    ///////////////////////////////////////////////////// GETTERS /////////////////////////////////////////////////////

    /**
     * Method get the Set object with customers.
     * @return Set object with customers.
     */
    public Set<Customer> getCustomersSet() {
        return customersSet;
    }

    /**
     * Method get the Map object with trips.
     * @return Map object with trips.
     */
    public Map<String, Trip> getTripsMap() {
        return tripsMap;
    }

    ///////////////////////////////////////////////////// SETTERS /////////////////////////////////////////////////////

    /**
     * Method set the Set of customers.
     * @param customersSet with customers.
     */
    public void setCustomersSet(Set<Customer> customersSet) {
        this.customersSet = customersSet;
    }

    /**
     * Method set the Map of trips.
     * @param tripsMap with trips.
     */
    public void setTripsMap(Map<String, Trip> tripsMap) {
        this.tripsMap = tripsMap;
    }

    /////////////////////////////////////////////////// CONSTRUCTORS ///////////////////////////////////////////////////

    /**
     * Method constructs object TravelOffice.
     */
    public TravelOffice() {
        this.customersSet =  new HashSet<>();
        this.tripsMap = new HashMap<>();
    }

    ///////////////////////////////////////////////// CUSTOMERS METHODS ////////////////////////////////////////////////

    /**
     * Method build string with data about all of customers in customersSet.
     * @return string with data of customers.
     */
    public String showAllCustomers(){

        StringBuilder allCustomers = new StringBuilder();

        if(!getCustomersSet().isEmpty()) {
            getCustomersSet().forEach(customer -> allCustomers.append(customer.toString() + "\n"));
        }else{
            allCustomers.append("There is no customers in the DB.");
        }
        return allCustomers.toString();
    }

    /**
     * Method add customer to customerSet
     * @param customer to add.
     * @return true if this set did not already contain the specified element.
     */
    public boolean addCustomer(Customer customer){
        return customersSet.add(customer);
    }

    /**
     * Method remove customer from customerSet.
     * @param customer to remove.
     * @throws NoSuchCustomerException when customer wasn't found.
     */
    public void removeCustomer(Customer customer) throws NoSuchCustomerException{

        getCustomersSet().remove(customer);

        boolean flag = false;

        for(Customer c : customersSet){
            if(c.equals(customer)){
                customersSet.remove(c);
                flag = true;
            }
        }
        if(!flag){
            throw new NoSuchCustomerException("The customer not found exception.");
        }
    }

    /**
     * Method find customer by name in customerSet.
     * @param name of customer.
     * @return found customer.
     * @throws NoSuchCustomerException when customer wasn't found.
     */
    public Customer findCustomerByName(String name) throws NoSuchCustomerException{

        for(Customer c : customersSet){
            if(c.getName().equals(name)){
                return c;
            }
        }
        throw new NoSuchCustomerException("The customer not found exception.");
    }

    /**
     * Method find customer by trip in customerSet.
     * @param trip assign to customer.
     * @return found customer or null.
     */
    public Customer findCustomerByTrip(Trip trip){

        for(Customer c : customersSet){
            if(c.getTrip().equals(trip)){
                return c;
            }
        }
        return null;
    }

    /////////////////////////////////////////////////// TRIPS METHODS //////////////////////////////////////////////////

    /**
     * Method build string with data about all of trips in tripsMap.
     * @return string with data of trips.
     */
    public String showAllTrips(){

        StringBuilder allTrips = new StringBuilder();

        if(!getTripsMap().isEmpty()) {
            getTripsMap().entrySet().forEach(trip -> allTrips.append(trip.getValue() + "\n"));
        }else{
            allTrips.append("There is no trip in the DB.");
        }
        return allTrips.toString();
    }

    /**
     * Method add trip to tripsMap.
     * @param description of trip.
     * @param trip
     */
    public void addTrip(String description, Trip trip){
        tripsMap.put(description, trip);
    }

    /**
     * Method remove trip from tripsMap based on description of trip.
     * @param description of trip
     * @throws NoSuchTripException when trip wasn't found.
     */
    public void removeTrip(String description) throws NoSuchTripException{

        if(tripsMap.containsKey(description)){
            tripsMap.remove(description);
        }else{
            throw new NoSuchTripException("The trip wasn't found");
        }
    }

    /**
     * Method find trip by description in tripsMap.
     * @param tripDescription
     * @return found trip or null.
     */
    public Trip findTripByDescription(String tripDescription){

        for (Map.Entry<String,Trip> entry : getTripsMap().entrySet()) {

            if(entry.getKey().equals(tripDescription)){
                return entry.getValue();
            }
        }
        return null;
    }

    /////////////////////////////////////////////////// OTHER METHODS //////////////////////////////////////////////////

    /**
     * Method assign trip to customer.
     * @param customer to assign.
     * @param tripDescription to assign.
     * @throws NoSuchCustomerException when customer wasn't found.
     */
    public boolean assignTrip(Customer customer, String tripDescription) throws NoSuchCustomerException{

       getCustomersSet().stream().forEach(c -> {
           if(c.equals(customer)){
               c.setTrip(getTripsMap().get(tripDescription));
           }
       });
       return false;
    }

}
