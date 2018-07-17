package com.ticketmaster.event.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "Seats")
public class Seat {

    @Column(name = "seatId")
    @Id
    @GeneratedValue
    private Long seatId;

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
        ADULT,
        CHILD
    }


    public Long getSeatId() {
        return seatId;
    }

    public void setSeatId(Long seatId) {
        this.seatId = seatId;
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