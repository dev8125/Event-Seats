package com.ticketmaster.event.repositories;

import com.ticketmaster.event.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {

    @Query(value = "SELECT s FROM Seat s WHERE eventId =:eventId AND available =:available AND seatType =:seatType AND aisle=:aisle OR id =:id")
    List<Seat> findByFilterOptions(@Param("eventId") String eventId,
                                   @Param("available") Boolean available,
                                   @Param("seatType") Seat.SeatType seatType,
                                   @Param("aisle") Boolean aisle,
                                   @Param("id") Optional<Long> id);


    @Query(value = "SELECT s FROM Seat s WHERE eventId =:eventId")
    List<Seat> findAllByEventId(@Param("eventId") String eventId);
}
