package com.ticketmaster.event.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.jboss.logging.Field;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Indexed;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.List;
import java.util.stream.StreamSupport;

@Entity
@Indexed
@Table(name ="SEATS")
public class Seat
{
    @Column(name = "id")
    @Id
    @GeneratedValue
    private Long id;

//    @Column(name = "available")
//    private Boolean seatAvail;
//    @Column(name = "aisle")
//    private Boolean isAisle;
//    @Column(name = "seatType")
//    private int seatType;

    private Boolean seatAvail;
    private Boolean isAisle;
    private int seatType;



    public Seat(){
        super();
    } // JPA

    public Seat(Boolean seatAvail, Boolean isAisle, int seatType)
    {
        this.seatAvail = seatAvail;
        this.isAisle = isAisle;
        this.seatType = seatType;
    }

    public Boolean isSeatAvailable() {
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

    public Boolean isAisle(){
       return isAisle;
    }

    public long getId(){
        return id;
    }
}