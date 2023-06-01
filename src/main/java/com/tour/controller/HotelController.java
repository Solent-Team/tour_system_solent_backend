package com.tour.controller;

import com.tour.model.Hotel;
import com.tour.repository.HotelRepository;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelController {


    @Autowired
    private HotelRepository hotelRepository;




// to insert the Data Payload to the hotel_table
    @PostMapping("/hotelpost")
    Hotel newHotel(@RequestBody Hotel newHotel){

        return hotelRepository.save(newHotel);


    }


    // to get/ load the Data from hotel_table
@GetMapping("/hotelget")
    List<Hotel> getAllHotels(){

        return  hotelRepository.findAll();
}












}
