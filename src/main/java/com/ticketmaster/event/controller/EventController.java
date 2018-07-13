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
@RequestMapping(value = "/getNumSeats", produces = "application/json") //make the rest resource naming better
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping(value = "/event/service")
    public ArrayList<Seat> serviceTest(@RequestParam(value = "available", defaultValue = "true", required = false) Boolean available,
                                       @RequestParam(value = "seatType", defaultValue = "0", required = false) int seatType,
                                       @RequestParam(value = "aisle", defaultValue = "true", required = false) Boolean aisle,
                                       @RequestParam(value = "id", required = false) Long id){

        return eventService.queryService(available, seatType, aisle, java.util.Optional.ofNullable(id));

    }
}