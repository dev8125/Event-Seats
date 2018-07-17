package com.ticketmaster.event.model;

import java.util.List;

public class SeatInfoJson {
    private String eventId;
    private Integer count;
    private List<Seat> seats;

    public SeatInfoJson(String eventId, Integer count, List<Seat> seats) {
        this.eventId = eventId;
        this.count = count;
        this.seats = seats;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
