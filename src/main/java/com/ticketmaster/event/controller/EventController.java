package com.ticketmaster.event.controller;

import com.ticketmaster.event.model.Seat;
import com.ticketmaster.event.model.SeatInfoJson;
import com.ticketmaster.event.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/event", produces = "application/json")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping(value = "/{eventId}/seats")
    public SeatInfoJson serviceTest(@PathVariable("eventId") String eventId,
                                    @RequestParam(value = "avail", defaultValue = "true", required = false) Boolean available,
                                    @RequestParam(value = "seatType", defaultValue = "adult", required = false) Seat.SeatType seatType,
                                    @RequestParam(value = "aisle", defaultValue = "true", required = false) Boolean aisle,
                                    @RequestParam(value = "id", required = false) Long id,
                                    @RequestParam(value = "showAll", defaultValue = "false", required = false) Boolean showAll)

    {
        List<Seat> seats;

        if (showAll) {
             seats = eventService.getAllSeats(eventId);
        } else {
            seats = eventService.getFilteredSeats(eventId, available, seatType, aisle, java.util.Optional.ofNullable(id));
        }

        return new SeatInfoJson(eventId, seats != null ? seats.size() : 0, seats);
    }

}