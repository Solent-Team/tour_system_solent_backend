package com.tour.controller;

import com.tour.exception.UserNotFoundException;
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

//to get / load the Specific Dataset using by Unique Attribute value from hotel_table
    @GetMapping("/hotelget/{hotelid}")
    Hotel getHotelByID(@PathVariable Integer hotelid){

//        return hotelRepository.findById(hotelid).get();
        return hotelRepository.findById(hotelid).orElseThrow(()->new UserNotFoundException(hotelid));
    }



// to update the required ID Set/ Specific Datasets by using Attribute value from hotel_table

@PutMapping("/hotelget/{hotelid}")
Hotel updateHotel(@RequestBody Hotel newHotel,@PathVariable Integer hotelid ){
    return hotelRepository.findById(hotelid)
            .map(hotel ->{

        hotel.setHotelname(newHotel.getHotelname());
        hotel.setHoteladdress(newHotel.getHoteladdress());
        hotel.setHotelemail(newHotel.getHotelemail());
        hotel.setHotelmobile(newHotel.getHotelmobile());
        hotel.setRoomcount(newHotel.getRoomcount());

        return hotelRepository.save(hotel);
            }).orElseThrow(()->new UserNotFoundException(hotelid));

}

//  to delete the required ID Set/ Specific Datasets by using Attribute value from hotel_table

@DeleteMapping("hotelget/{hotelid}")
String deleteHotel(@PathVariable Integer hotelid){
        if(!hotelRepository.existsById(hotelid)){

        throw new UserNotFoundException(hotelid);

        }
        hotelRepository.deleteById(hotelid);
        return "Hotel with hotelid "+hotelid+" has been deleted succesfully.";
}



}
