package com.tour.controller;


import com.tour.model.Booking;
import com.tour.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;

    @PostMapping(value = "/booking", consumes = "application/json")
    Booking newBooking(@RequestBody Booking newBooking){
        return bookingRepository.save(newBooking);
    }

    @GetMapping("/bookingdetails")
    List<Booking> getAllBooking() {
        return bookingRepository.findAll();
    }

}
