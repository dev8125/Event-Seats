package com.ticketmaster.event.controller;

import com.ticketmaster.event.repositories.SeatRepository;
import com.ticketmaster.event.model.Seat;
import com.ticketmaster.event.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@SpringBootApplication
@RequestMapping(value = "/getNumSeats", produces = "application/json") //make the rest resource naming better
public class EventController {

    @Autowired
    EventController(SeatRepository seatRepository){
        this.seatRepository = seatRepository;
    }

    @Autowired
    SeatRepository seatRepository;

    @Autowired
    private EventService eventService;

    @GetMapping(value = "/event/service")
    public ArrayList<Seat> serviceTest(@RequestParam(value = "available", defaultValue = "true", required = false) Boolean available,
                                  @RequestParam(value = "seatType", defaultValue = "0", required = false) int seatType,
                                  @RequestParam(value = "aisle", defaultValue = "true", required = false) Boolean aisle) {

        return eventService.queryService(available, seatType, aisle);

    }





//    @GetMapping(value = "/event")
//    public List<Seat> filteredList(@RequestParam(value = "avail", defaultValue = "true", required = false) Boolean avail,
//                                   @RequestParam(value = "seatType", defaultValue = "1", required = false) int seatType, // 1 = adult seat
//                                   @RequestParam(value = "aisle", defaultValue = "false", required = false) Boolean aisle){
//
//        List<Seat> availList = StreamSupport.stream(seatRepository.findAll().spliterator(), false)
//                .filter(x -> x.isSeatAvailable()==avail).collect(Collectors.toList());
//
//        List<Seat> aisleList = StreamSupport.stream(seatRepository.findAll().spliterator(), false)
//                .filter(x -> x.isAisle()==aisle).collect(Collectors.toList());
//
//        List<Seat> seatTypeList = StreamSupport.stream(seatRepository.findAll().spliterator(), false)
//                .filter(x -> x.getSeatType() == seatType).collect(Collectors.toList());
//
////        if((seatType == 0)) {
////           seatTypeList = StreamSupport.stream(seatRepository.findAll().spliterator(),false)
////                    .filter(x->x.getSeatType()==0).collect(Collectors.toList());
////        }
////
////        if((seatType == 1)) {
////             seatTypeList = StreamSupport.stream(seatRepository.findAll().spliterator(),false)
////                    .filter(x->x.getSeatType()==1).collect(Collectors.toList());
////        }
//
//        // deal with overlap of duplicate seats in lists
//        for (Seat s : aisleList)
//            if (!availList.contains(s))
//                availList.add(s);
//
//        List<Seat> filteredList = availList;
//        for (Seat s : seatTypeList)
//            if (!filteredList.contains(s))
//                filteredList.add(s);
//
//        return filteredList;
//    }
//
//    @GetMapping(value = "/avail/child")
//    public List<Seat> availChild(@RequestParam(value = "avail") Boolean avail,
//                                 @RequestParam(value = "child") int child) {
//        ArrayList<Seat> returnList = new ArrayList<>();
//
//        List<Seat> availList = StreamSupport.stream(seatRepository.findAll().spliterator(), false)
//                .filter(x -> x.isSeatAvailable()).collect(Collectors.toList());
//        for (Seat s : availList)
//            if (s.getSeatType() == 0)
//                returnList.add(s);
//        return returnList;
//    }

    // testing if call should be made on service rather than repository

}