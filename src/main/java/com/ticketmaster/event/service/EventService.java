package com.ticketmaster.event.service;

import com.ticketmaster.event.model.Seat;
import com.ticketmaster.event.repositories.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EventService {

    @Autowired
    private SeatRepository seatRepository;


    public List<Seat> getFilteredSeats(String eventId, Boolean available, Optional<Seat.SeatType> seatType, Optional<Boolean> aisle, Optional<Long> id) {

        return seatRepository.findByFilterOptions(eventId, available, seatType, aisle, id);

    }

    public List<Seat> getAllSeats(String eventId) {
        return seatRepository.findAllByEventId(eventId);
    }


}