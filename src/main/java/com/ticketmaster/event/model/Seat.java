package com.ticketmaster.event.model;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

@JsonPropertyOrder({"id", "isAvailable", "seatType", "isAisle"})
@Entity
@Table(name = "Seats")
public class Seat {

    @Column(name = "id")
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "available")
    private Boolean isAvailable;

    @Column(name = "aisle")
    private Boolean isAisle;

    @Column(name = "seattype")
    private int seatType;


    public Seat() {
        super();
    } // JPA

    public Seat(Boolean isAvailable, Boolean isAisle, int seatType) {

        this.isAvailable = isAvailable;
        this.isAisle = isAisle;

        this.seatType = seatType;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


    public Boolean getIsAisle() {
        return isAisle;
    }

    public void setIsAisle(Boolean aisle) {
        isAisle = aisle;
    }

    public int getSeatType() {
        return seatType;
    }

    public void setSeatType(int seatType) {
        this.seatType = seatType;
    }
}