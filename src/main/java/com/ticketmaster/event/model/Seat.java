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
@Table(name ="SEATS")
public class Seat
{

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "available")
    private Boolean seatAvail;
    @Column(name = "aisle")
    private Boolean isAisle;
    @Column(name = "seattype")
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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getSeatAvail() {
        return seatAvail;
    }

    public void setSeatAvail(Boolean seatAvail) {
        this.seatAvail = seatAvail;
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




}