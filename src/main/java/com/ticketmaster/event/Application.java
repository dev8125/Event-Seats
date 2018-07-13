package com.ticketmaster.event;

import com.ticketmaster.event.model.Seat;
import com.ticketmaster.event.repositories.SeatRepository;
import com.ticketmaster.event.service.EventService;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.*;

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
            seatRepository.save(new Seat(false, false, 0));
            seatRepository.save(new Seat(true, false, 1));
            seatRepository.save(new Seat(true, true, 0));
            seatRepository.save(new Seat(true, false, 1));
            seatRepository.save(new Seat(false, true, 1));
            seatRepository.save(new Seat(false, false, 0));
            seatRepository.save(new Seat(true, true, 0));
            seatRepository.save(new Seat(false, false, 1));
            seatRepository.save(new Seat(true, false, 0));
            seatRepository.save(new Seat(true, true, 1));
            seatRepository.save(new Seat(false, false, 0));
            seatRepository.save(new Seat(false, false, 0));
            seatRepository.save(new Seat(true, false, 0));
            seatRepository.save(new Seat(false, false, 1));
            seatRepository.save(new Seat(false, true, 1));
            seatRepository.save(new Seat(false, false, 0));
            seatRepository.save(new Seat(true, false, 0));
            seatRepository.save(new Seat(false, false, 0));
            seatRepository.save(new Seat(false, true, 0));
            seatRepository.save(new Seat(false, true, 1));
            seatRepository.save(new Seat(false, false, 1));
            seatRepository.save(new Seat(true, false, 1));
            seatRepository.save(new Seat(true, true, 0));
            seatRepository.save(new Seat(true, false, 1));
            seatRepository.save(new Seat(false, true, 0));
            seatRepository.save(new Seat(false, false, 0));
            seatRepository.save(new Seat(true, true, 0));
            seatRepository.save(new Seat(false, false, 1));
            seatRepository.save(new Seat(true, false, 0));
            seatRepository.save(new Seat(true, false, 1));
            seatRepository.save(new Seat(false, false, 1));
            seatRepository.save(new Seat(true, false, 1));
            seatRepository.save(new Seat(true, false, 0));
            seatRepository.save(new Seat(false, false, 0));
            seatRepository.save(new Seat(false, true, 1));
            seatRepository.save(new Seat(false, false, 0));
            seatRepository.save(new Seat(true, true, 0));
            seatRepository.save(new Seat(false, false, 1));
            seatRepository.save(new Seat(false, true, 0));
            seatRepository.save(new Seat(false, true, 1));
            seatRepository.save(new Seat(false, false, 1));
            seatRepository.save(new Seat(true, false, 1));
            seatRepository.save(new Seat(true, false, 0));
            seatRepository.save(new Seat(true, false, 1));
            seatRepository.save(new Seat(false, true, 0));

        };
    }




}