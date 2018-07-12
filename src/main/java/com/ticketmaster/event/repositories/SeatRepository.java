package com.ticketmaster.event.repositories;

import com.ticketmaster.event.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;
import java.util.ArrayList;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long>
         {

     @Query(value = "SELECT count(*) from SEATS where available =:available AND seatType =:seatType AND aisle=:aisle", nativeQuery = true)
     ArrayList<Seat> findByAvailableAndSeatTypeAndAisle(@Param("available")Boolean available,
                                                        @Param("seatType") Integer seatType,
                                                        @Param("aisle") Boolean aisle);
         }