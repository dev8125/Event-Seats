package com.ticketmaster.event.controller;

import com.ticketmaster.event.model.Seat;
import com.ticketmaster.event.model.SeatListWrapper;
import com.ticketmaster.event.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/event", produces = "application/json")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping(value = "/{eventId}/seats")
    public SeatListWrapper eventSearch(@PathVariable("eventId") String eventId,
                                       @RequestParam(value = "avail", defaultValue = "true", required = false) Boolean available,
                                       @RequestParam(value = "seatType", required = false) Optional<Seat.SeatType> seatType,
                                       @RequestParam(value = "aisle", required = false) Optional<Boolean> aisle,
                                       @RequestParam(value = "seatId", required = false) Long seatId,
                                       @RequestParam(value = "showAll", defaultValue = "false", required = false) Boolean showAll)

    {
        List<Seat> seats;


        if (showAll) {
            seats = eventService.getAllSeats(eventId);
        } else {
            seats = eventService.getFilteredSeats(eventId, available, seatType, aisle, java.util.Optional.ofNullable(seatId));
        }

        return new SeatListWrapper(eventId,seats.size(), seats);
    }

}