package com.example.traveloffice.controler;

import com.example.traveloffice.model.AbroadTrip;
import com.example.traveloffice.model.Customer;
import com.example.traveloffice.model.DomesticTrip;
import com.example.traveloffice.model.Trip;
import com.example.traveloffice.service.TravelOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/*
    ToTest
    http://localhost:8080/swagger-ui.html
 */


@RestController
public class TravelOfficeControler {

    @Autowired
    TravelOfficeService travelOfficeService;

    ///////////////////////////////////////////////// CUSTOMER METHODS /////////////////////////////////////////////////

    @PostMapping("/addCustomer")
    public boolean addCustomer(Customer customer){
        return travelOfficeService.addCustomer(customer);
    }

    @GetMapping("/removeCustomer")
    public boolean removeCustomer(Customer customer){
        return travelOfficeService.removeCustomer(customer);
    }

    @GetMapping("/showCustomers")
    public String showCustomer(){
        return travelOfficeService.showAllCustomers();
    }

    /////////////////////////////////////////////////// TRIP METHODS ///////////////////////////////////////////////////

    @PostMapping("/addTrip/domestic")
    public void addDomesticTrip(String description, DomesticTrip domesticTrip){
        travelOfficeService.addTrip(description, domesticTrip);
    }

    @PostMapping("/addTrip/abroad")
    public void addDomesticTrip(String description, AbroadTrip abroadTrip){
        travelOfficeService.addTrip(description, abroadTrip);
    }

    @PostMapping("/removeTrip")
    public void removeTrip(String description){
        travelOfficeService.removeTrip(description);
    }

    @GetMapping("/showTrips")
    public String showTrips(){ return travelOfficeService.showAllTrips(); }

    ////////////////////////////////////////////////// OTHER METHODS //////////////////////////////////////////////////

    @GetMapping("/assignTrip")
    public void assignTrip(Customer customer, String tripDescription){
        travelOfficeService.assignTrip(customer, tripDescription);
    }

}
