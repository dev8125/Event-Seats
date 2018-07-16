package com.ticketmaster.event.controller;

import com.ticketmaster.event.model.Seat;
import com.ticketmaster.event.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/getNumSeats", produces = "application/json")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping(value = "/event/service/{eventId}")
    public List<Seat> serviceTest(@PathVariable("eventId") String eventId,
                                  @RequestParam(value = "avail", defaultValue = "true", required = false) Boolean available,
                                  @RequestParam(value = "seatType", defaultValue = "0", required = false) int seatType,
                                  @RequestParam(value = "aisle", defaultValue = "true", required = false) Boolean aisle,
                                  @RequestParam(value = "id", required = false) Long id)



    {

        return eventService.queryService(eventId, available, seatType, aisle, java.util.Optional.ofNullable(id));

    }

}