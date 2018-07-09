package com.ticketmaster.event.repositories;

import com.ticketmaster.event.model.Seat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface SeatRepository extends CrudRepository<Seat, Long>
         {

     @Query("SELECT count(*) from seat_table where available =: avail AND seatType =: seatType AND aisle=: aisle")
     ArrayList<Seat> findByAvailableAndSeatTypeAndAisle(@Param("available")Boolean available,
                                                        @Param("seatType") Integer seatType,
                                                        @Param("aisle") Boolean aisle);

        ArrayList<Seat> seatDB = new ArrayList<>();

         }