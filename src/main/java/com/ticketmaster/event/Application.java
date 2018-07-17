package com.ticketmaster.event;

import com.ticketmaster.event.model.Seat;
import com.ticketmaster.event.repositories.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    @Autowired
    SeatRepository seatRepository;


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);


    }

    @Bean
    CommandLineRunner init(SeatRepository seatRepository) {
        return args ->
        {
            seatRepository.save(new Seat("001", false, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", true, false, Seat.SeatType.child));
            seatRepository.save(new Seat("001", true, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", true, false, Seat.SeatType.child));
            seatRepository.save(new Seat("001", false, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", false, false, Seat.SeatType.child));
            seatRepository.save(new Seat("001", true, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", false, false, Seat.SeatType.child));
            seatRepository.save(new Seat("001", true, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", true, true, Seat.SeatType.child));
            seatRepository.save(new Seat("001", false, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", false, false, Seat.SeatType.child));
            seatRepository.save(new Seat("001", true, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", false, false, Seat.SeatType.child));
            seatRepository.save(new Seat("001", true, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", true, true, Seat.SeatType.child));
            seatRepository.save(new Seat("001", false, false, Seat.SeatType.child));
            seatRepository.save(new Seat("001", false, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", true, false, Seat.SeatType.child));
            seatRepository.save(new Seat("001", false, false, Seat.SeatType.child));
            seatRepository.save(new Seat("001", false, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", false, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", true, false, Seat.SeatType.child));
            seatRepository.save(new Seat("001", false, false, Seat.SeatType.child));
            seatRepository.save(new Seat("001", false, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", false, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", true, false, Seat.SeatType.child));
            seatRepository.save(new Seat("001", true, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", true, false, Seat.SeatType.child));
            seatRepository.save(new Seat("001", false, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", false, false, Seat.SeatType.child));
            seatRepository.save(new Seat("001", true, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", false, false, Seat.SeatType.child));
            seatRepository.save(new Seat("001", true, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", true, true, Seat.SeatType.child));
            seatRepository.save(new Seat("001", false, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", false, false, Seat.SeatType.child));
            seatRepository.save(new Seat("001", true, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", false, false, Seat.SeatType.child));
            seatRepository.save(new Seat("001", true, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", true, true, Seat.SeatType.child));
            seatRepository.save(new Seat("001", false, false, Seat.SeatType.child));
            seatRepository.save(new Seat("001", false, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", true, false, Seat.SeatType.child));
            seatRepository.save(new Seat("001", false, false, Seat.SeatType.child));
            seatRepository.save(new Seat("001", false, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", false, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("001", true, false, Seat.SeatType.child));
            seatRepository.save(new Seat("001", false, false, Seat.SeatType.child));
            seatRepository.save(new Seat("001", false, true, Seat.SeatType.adult));


            seatRepository.save(new Seat("002", false, false, Seat.SeatType.child));
            seatRepository.save(new Seat("002", false, false, Seat.SeatType.child));
            seatRepository.save(new Seat("002", true, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", false, false, Seat.SeatType.child));
            seatRepository.save(new Seat("002", false, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", false, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", false, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", true, false, Seat.SeatType.child));
            seatRepository.save(new Seat("002", true, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", true, false, Seat.SeatType.child));
            seatRepository.save(new Seat("002", false, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", false, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", false, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", true, false, Seat.SeatType.child));
            seatRepository.save(new Seat("002", true, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", true, false, Seat.SeatType.child));
            seatRepository.save(new Seat("002", false, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", false, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", true, true, Seat.SeatType.child));
            seatRepository.save(new Seat("002", true, true, Seat.SeatType.child));
            seatRepository.save(new Seat("002", false, false, Seat.SeatType.child));
            seatRepository.save(new Seat("002", true, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", true, false, Seat.SeatType.child));
            seatRepository.save(new Seat("002", false, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", true, false, Seat.SeatType.child));
            seatRepository.save(new Seat("002", false, false, Seat.SeatType.child));
            seatRepository.save(new Seat("002", false, false, Seat.SeatType.child));
            seatRepository.save(new Seat("002", true, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", false, false, Seat.SeatType.child));
            seatRepository.save(new Seat("002", false, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", false, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", false, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", true, false, Seat.SeatType.child));
            seatRepository.save(new Seat("002", true, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", true, false, Seat.SeatType.child));
            seatRepository.save(new Seat("002", false, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", false, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", false, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", true, false, Seat.SeatType.child));
            seatRepository.save(new Seat("002", true, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", true, false, Seat.SeatType.child));
            seatRepository.save(new Seat("002", false, true, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", false, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", true, true, Seat.SeatType.child));
            seatRepository.save(new Seat("002", true, true, Seat.SeatType.child));
            seatRepository.save(new Seat("002", false, false, Seat.SeatType.child));
            seatRepository.save(new Seat("002", true, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", true, false, Seat.SeatType.child));
            seatRepository.save(new Seat("002", false, false, Seat.SeatType.adult));
            seatRepository.save(new Seat("002", true, false, Seat.SeatType.child));

        };
    }

}