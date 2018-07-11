package com.ticketmaster.event.service;
import com.ticketmaster.event.controller.EventController;
import com.ticketmaster.event.model.Seat;
import com.ticketmaster.event.repositories.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EventService {

    private ArrayList<Seat> seatList;

    @Autowired
    @Qualifier("database")
    private ArrayList<Seat> seatDB;

    @Autowired
    SeatRepository seatRepository;

    @Autowired
    EventController eventController;


   public ArrayList<Seat> queryService(Boolean available, int seatType, Boolean aisle){

       return seatRepository.findByAvailableAndSeatTypeAndAisle(available, seatType, aisle);


    }

    public Seat queryService2(Boolean available, int seatType, Boolean aisle){

        return seatRepository.findByAvailableAndSeatTypeAndAisle2(available, seatType, aisle);


    }
}