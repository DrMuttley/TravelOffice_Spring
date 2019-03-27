package com.example.traveloffice.controler;

import com.example.traveloffice.model.AbroadTrip;
import com.example.traveloffice.model.Customer;
import com.example.traveloffice.model.Trip;
import com.example.traveloffice.service.TravelOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/showCustomers")
    public String showCustomer(){
        return travelOfficeService.showAllCustomers();
    }


    @PostMapping("/addCustomer")
    public Customer addCustomer(Customer customer){
        travelOfficeService.addCustomer(customer);
        return customer;
    }

    @PostMapping("/addTrip")
    public void addTrip(String description, Trip trip){
        travelOfficeService.addTrip(description, trip);
    }




    @PostMapping("/string")
    public String some(String customer){
        return customer;
    }


//    @PostMapping("/someUrl")
//    public ResponseEntity<Void> uploadFile(@RequestPart(name="foo", required = false) Foo foo, @RequestPart("file") MultipartFile file) {
//        return new ResponseEntity<>(OK);
//    }
//

    @GetMapping("/showTrips")
    public String showTrips(){ return travelOfficeService.showAllTrips(); }




}
