package com.ticketmaster.event.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "seat_table")
public class Seat
{
    @Column(name = "id")
    @Id
    @GeneratedValue
    private Long id;


    @Column(name = "available")
    private  boolean seatAvail;
    @Column(name = "aisle")
    private boolean isAisle;
    @Column(name = "seat_type")
    private int seatType;



    private Seat seat;


    public Seat(){
        super();
    } // JPA

    public Seat(boolean seatAvail, final boolean isAisle, final int seatType)
    {
        this.seatAvail = seatAvail;
        this.isAisle = isAisle;
        this.seatType = seatType;
    }

    public boolean isSeatAvailable() {
        return seatAvail;
    }

    /*
    Sets seat type adult/child
     */
    public int getSeatType() {
        return seatType;
    }

    /*
     * Sets seat type
     * @param seatType 0 for child 1 for adult
     */
    public void setSeatType(int seatType) {
        this.seatType = seatType;
    }

    public void setAisle(Boolean isAisle) {
        this.isAisle = isAisle;
    }

    public void setAvailability(Boolean seatAvail) {
        this.seatAvail = seatAvail;
    }

    public boolean isAisle(){
       return isAisle;
    }

}