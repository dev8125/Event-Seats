package com.ticketmaster.event.service;

import com.ticketmaster.event.model.Seat;
import com.ticketmaster.event.model.SeatInfoJson;
import com.ticketmaster.event.repositories.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EventService {

    @Autowired
    private SeatRepository seatRepository;


    public List<Seat> queryService(String eventId, Boolean available, int seatType, Boolean aisle, Optional<Long> id) {

        return seatRepository.findByAvailableAndSeatTypeAndAisleAndId("event", available, seatType,aisle,id);


    }

}