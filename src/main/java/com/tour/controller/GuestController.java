package com.tour.controller;

import com.tour.model.Guest;
import com.tour.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GuestController {
@Autowired
    private GuestRepository guestRepository;

    @PostMapping("/submitdata")
    Guest newGuest(@RequestBody Guest newGuest) {
        return guestRepository.save(newGuest);
    }

    @GetMapping("/guestdetails")
    List<Guest> getAllGuest(){
        return  guestRepository.findAll();
    }

}
