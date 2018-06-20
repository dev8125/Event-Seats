package com.ticketmaster.event.model;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

public class EventModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private ArrayList<Seat> seatList = new ArrayList<>();

    @OneToMany(mappedBy = "event")
    private Set<Seat> eventSet = new HashSet<>();

    public EventModel() { } // JPA


    public EventModel(final int id, ArrayList<Seat> seatList) {
        this.id= id;
        this.seatList = seatList;
    }


    /*
     * Returns EventModel's specific auto generated ID
     */
    public int getId() {
        return id;
    }

}
