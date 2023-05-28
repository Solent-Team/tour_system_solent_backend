package com.tour.controller;


import com.tour.exception.UserNotFoundException;
import com.tour.model.Booking;
import com.tour.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/bookingdetails/{id}")
    Booking getBookingById(@PathVariable Long id) {
        return bookingRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }


    @PutMapping("/bookingdetailsupdate/{id}")
    Booking updateBooking(@RequestBody Booking newBooking, @PathVariable Long id) {
        return bookingRepository.findById(id)
                .map(booking -> {
                    booking.setName(newBooking.getName());
                    booking.setEmail(newBooking.getEmail());
                    booking.setPhone(newBooking.getPhone());
                    booking.setNoofTravellers(newBooking.getNoofTravellers());
                    booking.setTourpackages(newBooking.getTourpackages());

                    return bookingRepository.save(booking);

                }).orElseThrow(() -> new UserNotFoundException(id));
    }


}
