package com.example.traveloffice.controler;

import com.example.traveloffice.model.Address;
import com.example.traveloffice.model.Customer;
import com.example.traveloffice.model.TravelOffice;
import com.example.traveloffice.service.TravelOfficeService;

import com.example.traveloffice.service.imp.TravelOfficeServiceImp;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import javax.annotation.Resource;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TravelOfficeControlerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    TravelOfficeService travelOfficeService;

    private final String CITY = "KATOWICE";
    private final String STREET = "OPOLSKA";
    private final String ZIP = "40-700";

    private final String NAME = "JOHN";

    ////////////////////////////////////////////////// CUSTOMER TESTS //////////////////////////////////////////////////

    @Test
    public void addCustomer() throws Exception {

        this.mockMvc.perform(post("/addCustomer")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonObjectCustomer().toString()))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("true")));
    }

    @Test
    public void removeCustomer() throws Exception {

        this.mockMvc.perform(post("/removeCustomer")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonObjectCustomer().toString()))
                .andExpect(status().isOk())
                .andExpect(content().string("false"));
    }

//    @Test
//    public void showCustomer() throws Exception {
//
//        this.mockMvc.perform(get("/showCustomers"))
//                .andExpect(status().isOk())
//                //.andReturn().getResponse().getContentAsString();
//                .andExpect(content().string("There is no customers in the DB."));
//    }

    //////////////////////////////////////////////////// TRIPS TESTS ///////////////////////////////////////////////////

    @Test
    public void addDomesticTrip() {
    }

    @Test
    public void addDomesticTrip1() {
    }

    @Test
    public void removeTrip() {
    }

    @Test
    public void showTrips() {
    }

    //////////////////////////////////////////////////// OTHER TESTS ///////////////////////////////////////////////////


    @Test
    public void assignTrip() {
    }

    ///////////////////////////////////////////////// PREPARING JSONS //////////////////////////////////////////////////

    private JSONObject jsonObjectAddress(){

        JSONObject addressJSON = new JSONObject();

        try {
            addressJSON.put("street", STREET)
                .put("zip", ZIP)
                .put("city", CITY);
        }catch (JSONException e){
            e.printStackTrace();
        }
        return addressJSON;
    }

    private JSONObject jsonObjectCustomer(){

        JSONObject customerJSON = new JSONObject();
        JSONObject addressJSON = jsonObjectAddress();

        try {
            customerJSON.put("name", NAME)
                    .put("address", addressJSON)
                    .put("trip", null);
        }catch (JSONException e){
                e.printStackTrace();
        }
        return customerJSON;
    }

    private Address createTestAddress(){

        Address address = new Address();
        address.setCity(CITY);
        address.setStreet(STREET);
        address.setZip(ZIP);

        return address;
    }

    private Customer createTestCustomer(){

        Customer customer = new Customer();
        customer.setName(NAME);
        customer.setAddress(createTestAddress());
        customer.setTrip(null);
        return customer;
    }

}