package com.ticketmaster.event.service;
import com.ticketmaster.event.model.Seat;
import com.ticketmaster.event.repositories.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EventService {

    private List<Seat> seatList;
    @Autowired
    private  final SeatRepository seatRepository;


    public EventService(SeatRepository seatRepository){
        this.seatRepository = seatRepository;
    }


   public List<Seat> queryService(Boolean available, int seatType, Boolean aisle){
        seatList=  seatRepository.findByAvailableAndSeatTypeAndAisle(available, seatType, aisle);
        return seatList;
    }

    public List<Seat> getSeatList(){
        seatList = seatRepository.findAll();
        return seatList;
    }
}