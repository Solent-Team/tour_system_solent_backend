package com.tour.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;


@Entity
public class Guest {
    @Id
    @GeneratedValue
    private Long id;
    @Size(max = 50)
    private String name;
    @Size(max = 50)
    private String email;

    @Nullable
    @Size(max = 50)
    private String livingCountry;
    @Nullable
    @Size(max = 50)
    private String nationality;
    @Nullable
    @Size(max = 50)
    private String destination;
    @Nullable
    @Size(max = 50)
    private String arrivalDate;
    @Nullable
    @Size(max = 50)
    private String departureDate;
    @Nullable
    @Size(max = 10)
    private String noAdults;
    @Nullable
    @Size(max = 10)
    private String noKids;

    @Nullable
    public String getStatus() {
        return status;
    }

    public void setStatus(@Nullable String status) {
        this.status = status;
    }

    @Nullable
    @Size(max = 10)
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    @Nullable
    public String getLivingCountry() {
        return livingCountry;
    }

    public void setLivingCountry(@Nullable String livingCountry) {
        this.livingCountry = livingCountry;
    }

    @Nullable
    public String getNationality() {
        return nationality;
    }

    public void setNationality(@Nullable String nationality) {
        this.nationality = nationality;
    }

    @Nullable
    public String getDestination() {
        return destination;
    }

    public void setDestination(@Nullable String destination) {
        this.destination = destination;
    }

    @Nullable
    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(@Nullable String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    @Nullable
    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(@Nullable String departureDate) {
        this.departureDate = departureDate;
    }

    @Nullable
    public String getNoAdults() {
        return noAdults;
    }

    public void setNoAdults(@Nullable String noAdults) {
        this.noAdults = noAdults;
    }

    @Nullable
    public String getNoKids() {
        return noKids;
    }

    public void setNoKids(@Nullable String noKids) {
        this.noKids = noKids;
    }
}
