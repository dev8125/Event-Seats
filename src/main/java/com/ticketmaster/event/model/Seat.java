package com.ticketmaster.event.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

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
    private SeatType seatType;

    @Column(name = "eventId")
    private String eventId;

    public Seat() {
        super();
    } // JPA

    public Seat(String eventId, Boolean isAvailable, Boolean isAisle, SeatType seatType) {
        this.seatType = seatType;
        this.isAvailable = isAvailable;
        this.isAisle = isAisle;
        this.eventId = eventId;
    }
    public enum SeatType {
        adult,
        child
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

}