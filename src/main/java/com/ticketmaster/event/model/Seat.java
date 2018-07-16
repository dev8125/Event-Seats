package com.ticketmaster.event.model;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.Optional;

@JsonPropertyOrder({"id", "isAvailable", "seatType", "isAisle"})
@Entity
@Table(name = "Seats")
public class Seat {

    @Column(name = "id")
    @Id
    @GeneratedValue
    private Optional<Long> id;

    @Column(name = "available")
    private Boolean isAvailable;

    @Column(name = "aisle")
    private Boolean isAisle;

    @Column(name = "seattype")
    private int seatType;

    @Column(name = "eventId")
    private String eventId;

    public Seat() {
        super();
    } // JPA

    public Seat(String event, Boolean isAvailable, Boolean isAisle, Integer seatType, Optional<Long> id) {

        this.id = id;
        this.isAvailable = isAvailable;
        this.isAisle = isAisle;
        this.seatType = seatType;
        this.eventId = eventId;
    }

    public Optional<Long> getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = Optional.ofNullable(id);
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public Boolean getAisle() {
        return isAisle;
    }

    public void setAisle(Boolean aisle) {
        isAisle = aisle;
    }

    public int getSeatType() {
        return seatType;
    }

    public void setSeatType(int seatType) {
        this.seatType = seatType;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }


}