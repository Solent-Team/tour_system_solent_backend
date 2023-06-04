package com.tour.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Hotel {

    @Id
    @GeneratedValue
    @Column(nullable = false, length = 10)
    private Integer hotelid;

    @Column(nullable = false, length = 100)
    private String hotelname;

    @Size(max = 100)
    private String hotelemail;

    @Size(max = 100)
    private String hotelmobile;

    @Column(nullable = false, length = 10)
    private Integer roomcount;

    @Column(nullable = false, length = 500)
    private String hoteladdress;




    public Integer getHotelid() {
        return hotelid;
    }

    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public String getHotelemail() {
        return hotelemail;
    }

    public void setHotelemail(String hotelemail) {
        this.hotelemail = hotelemail;
    }

    public String getHotelmobile() {
        return hotelmobile;
    }

    public void setHotelmobile(String hotelmobile) {
        this.hotelmobile = hotelmobile;
    }

    public Integer getRoomcount() {
        return roomcount;
    }

    public void setRoomcount(Integer roomcount) {
        this.roomcount = roomcount;
    }

    public String getHoteladdress() {
        return hoteladdress;
    }

    public void setHoteladdress(String hoteladdress) {
        this.hoteladdress = hoteladdress;
    }




}
