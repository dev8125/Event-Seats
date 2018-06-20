package com.ticketmaster.event.repositories;

import com.ticketmaster.event.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;


@EnableJpaRepositories
@Repository
public interface SeatRepository extends JpaRepository<Seat, Long>
         {

     @Query("SELECT count(*) from SEAT_TABLE where available =: avail AND seatType =: seatType AND aisle=: aisle")
     List<Seat> findByAvailableAndSeatTypeAndAisle(@Param("available")Boolean available,
                      @Param("seatType") Integer seatType,
                      @Param("aisle") Boolean aisle);

    }