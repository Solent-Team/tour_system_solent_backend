package com.tour.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id) {
        super("user not found" + id);
    }

    public UserNotFoundException(Integer hotelid){
        super("Could not find the Hotel by the id "+ hotelid);
    }




}
