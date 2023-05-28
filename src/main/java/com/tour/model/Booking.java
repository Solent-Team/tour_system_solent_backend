package com.tour.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Booking {

    @Id
    private long id;
    private String name;
    private String email;
    private String phone;
    private String arrivalDate;
    private String noofTravellers;
    private String createddate;
    @Column(nullable = false, columnDefinition = "VARCHAR(255) DEFAULT '1'")
    private String orderid;
    private String ammount;

    public String getTourpackages() {
        return tourpackages;
    }

    public void setTourpackages(String tourpackages) {
        this.tourpackages = tourpackages;
    }

    private String tourpackages;

    public String getAmmount() {
        return ammount;
    }

    public void setAmmount(String ammount) {
        this.ammount = ammount;
    }





    public String getPaymentstatus() {
        return paymentstatus;
    }

    public void setPaymentstatus(String paymentstatus) {
        this.paymentstatus = paymentstatus;
    }

    @Column(nullable = false, columnDefinition = "VARCHAR(255) DEFAULT '1'")
    private String paymentstatus;


    public String getOderstatus() {
        return oderstatus;
    }

    public void setOderstatus(String oderstatus) {
        this.oderstatus = oderstatus;
    }

    private String oderstatus;
    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getNoofTravellers() {
        return noofTravellers;
    }

    public void setNoofTravellers(String noofTravellers) {
        this.noofTravellers = noofTravellers;
    }

    public String getCreateddate() {
        return createddate;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }
}
