package com.ticketmaster.event.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "SEAT_TABLE")
public class Seat
{
    @Column(name = "ID")
    @Id
    @GeneratedValue
    private Long id;

//    @JsonIgnore
//    @OneToMany
//    @Column(name = "Event_ID")
//    private EventModel eventModel;

    @Column(name = "AVAILABLE")
    private  boolean seatAvail;
    @Column(name = "AISLE")
    private boolean isAisle;
    @Column(name = "SEAT_TYPE")
    private int seatType;

    @ElementCollection
    private List<Seat> seatList;

    @ManyToMany
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

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
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