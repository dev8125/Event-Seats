package com.ticketmaster.event;

import com.ticketmaster.event.model.Seat;
import com.ticketmaster.event.repositories.SeatRepository;
import com.ticketmaster.event.service.EventService;

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
@ComponentScan(basePackages = {"com.ticketmaster.event"})
@EntityScan("com.ticketmaster.domain")
@EnableJpaRepositories("com.ticketmaster.repositories.SeatRepositories")
public class Application extends SpringBootServletInitializer {

    @Autowired
    SeatRepository seatRepository;

    @Autowired
    EventService eventService;



    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

       // ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");


    }



    @Bean
    public SeatRepository seatRepository() {
       return new SeatRepository() {
           @Override
           public ArrayList<Seat> findByAvailableAndSeatTypeAndAisle(Boolean available, Integer seatType, Boolean aisle) {
               return eventService.queryService(available, seatType, aisle);
           }

           @Override
           public List<Seat> findAll() {
               return null;
           }

           @Override
           public List<Seat> findAll(Sort sort) {
               return null;
           }

           @Override
           public List<Seat> findAllById(Iterable<Long> iterable) {
               return null;
           }

           @Override
           public <S extends Seat> List<S> saveAll(Iterable<S> iterable) {
               return null;
           }

           @Override
           public void flush() {

           }

           @Override
           public <S extends Seat> S saveAndFlush(S s) {
               return null;
           }

           @Override
           public void deleteInBatch(Iterable<Seat> iterable) {

           }

           @Override
           public void deleteAllInBatch() {

           }

           @Override
           public Seat getOne(Long aLong) {
               return null;
           }

           @Override
           public <S extends Seat> List<S> findAll(Example<S> example) {
               return null;
           }

           @Override
           public <S extends Seat> List<S> findAll(Example<S> example, Sort sort) {
               return null;
           }

           @Override
           public Page<Seat> findAll(Pageable pageable) {
               return null;
           }

           @Override
           public <S extends Seat> S save(S s) {
               return null;
           }

           @Override
           public Optional<Seat> findById(Long aLong) {
               return Optional.empty();
           }

           @Override
           public boolean existsById(Long aLong) {
               return false;
           }

           @Override
           public long count() {
               return 0;
           }

           @Override
           public void deleteById(Long aLong) {

           }

           @Override
           public void delete(Seat seat) {

           }

           @Override
           public void deleteAll(Iterable<? extends Seat> iterable) {

           }

           @Override
           public void deleteAll() {

           }

           @Override
           public <S extends Seat> Optional<S> findOne(Example<S> example) {
               return Optional.empty();
           }

           @Override
           public <S extends Seat> Page<S> findAll(Example<S> example, Pageable pageable) {
               return null;
           }

           @Override
           public <S extends Seat> long count(Example<S> example) {
               return 0;
           }

           @Override
           public <S extends Seat> boolean exists(Example<S> example) {
               return false;
           }
       };
    }


//    @Bean
//    InitializingBean sendDatabase() {
//        return () -> {
//            seatRepository.save(new Seat(false, false, 1));
//            seatRepository.save(new Seat(true, false, 1));
//            seatRepository.save(new Seat(true, true, 0));
//            seatRepository.save(new Seat(true, false, 1));
//            seatRepository.save(new Seat(false, true, 1));
//            seatRepository.save(new Seat(false, false, 0));
//            seatRepository.save(new Seat(true, true, 0));
//            seatRepository.save(new Seat(false, false, 1));
//            seatRepository.save(new Seat(true, false, 0));
//            seatRepository.save(new Seat(true, true, 1));
//            seatRepository.save(new Seat(false, false, 1));
//            seatRepository.save(new Seat(true, false, 1));
//            seatRepository.save(new Seat(true, false, 0));
//            seatRepository.save(new Seat(true, false, 1));
//            seatRepository.save(new Seat(false, true, 1));
//            seatRepository.save(new Seat(false, false, 0));
//            seatRepository.save(new Seat(true, true, 0));
//            seatRepository.save(new Seat(false, false, 1));
//            seatRepository.save(new Seat(true, true, 0));
//            seatRepository.save(new Seat(false, true, 1));
//        };
//    }




    @Bean(name = "database")
    public ArrayList<Seat> setDataBase() {
        ArrayList<Seat> seatDB = new ArrayList<>();

        seatDB.add(new Seat(true, false, 0));
        seatDB.add(new Seat(true, true, 0));
        seatDB.add(new Seat(false, false, 0));
        seatDB.add(new Seat(true, true, 1));
        seatDB.add(new Seat(true, false, 0));
        seatDB.add(new Seat(true, true, 0));
        seatDB.add(new Seat(false, false, 0));
        seatDB.add(new Seat(false, false, 1));
        seatDB.add(new Seat(true, false, 0));
        seatDB.add(new Seat(true, true, 0));
        seatDB.add(new Seat(false, false, 0));
        seatDB.add(new Seat(true, true, 1));


        return seatDB;
    }

//    @Bean
//    CommandLineRunner init(SeatRepository seatRepository) {
//        return args ->
//               {
//                            seatRepository.save(new Seat(true, true, 0));
//                            seatRepository.save(new Seat(true, false, 0));
//                            seatRepository.save(new Seat(true, true, 1));
//
//               };
//    }
}