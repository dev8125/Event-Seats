package com.ticketmaster.event.repositories;

import com.ticketmaster.event.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long>
         {
<<<<<<< HEAD

     @Query(value = "SELECT count(s) FROM Seat s WHERE available =:available AND seatType =:seatType AND aisle=:aisle AND id =:id")
=======
     @Query(value = "SELECT s FROM Seat s WHERE available =:available AND seatType =:seatType AND aisle=:aisle OR id =:id")
>>>>>>> addid
     ArrayList<Seat> findByAvailableAndSeatTypeAndAisleAndId(@Param("available")Boolean available,
                                                        @Param("seatType") Integer seatType,
                                                        @Param("aisle") Boolean aisle,
                                                        @Param("id") Optional<Long> id);

         }