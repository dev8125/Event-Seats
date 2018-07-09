package com.ticketmaster.event;

import com.ticketmaster.event.model.Seat;
import com.ticketmaster.event.repositories.SeatRepository;
import com.ticketmaster.event.service.EventService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.*;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ticketmaster.event"}, excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Repository.class)
})
@EntityScan("com.ticketmaster.domain")
@EnableJpaRepositories("com.ticketmaster.repositories.SeatRepositories")
public class Application extends SpringBootServletInitializer {


    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
//
//    private static final EntityManagerFactory INSTANCE =
//            Persistence.createEntityManagerFactory("com.persistence");


    @Autowired
    private SeatRepository seatRepository;

    @Autowired
    EventService eventService;


    @Bean
    InitializingBean sendDatabase() {
        return () -> {
            seatRepository.save(new Seat(false, false, 1));
            seatRepository.save(new Seat(true, false, 1));
            seatRepository.save(new Seat(true, true, 0));
            seatRepository.save(new Seat(true, false, 1));
            seatRepository.save(new Seat(false, true, 1));
            seatRepository.save(new Seat(false, false, 0));
            seatRepository.save(new Seat(true, true, 0));
            seatRepository.save(new Seat(false, false, 1));
            seatRepository.save(new Seat(true, false, 0));
            seatRepository.save(new Seat(true, true, 1));
            seatRepository.save(new Seat(false, false, 1));
            seatRepository.save(new Seat(true, false, 1));
            seatRepository.save(new Seat(true, false, 0));
            seatRepository.save(new Seat(true, false, 1));
            seatRepository.save(new Seat(false, true, 1));
            seatRepository.save(new Seat(false, false, 0));
            seatRepository.save(new Seat(true, true, 0));
            seatRepository.save(new Seat(false, false, 1));
            seatRepository.save(new Seat(true, true, 0));
            seatRepository.save(new Seat(false, true, 1));
        };
    }

   @Bean
   public SeatRepository seatRepository(){
      return new SeatRepository() {
          @Override
          public ArrayList<Seat> findByAvailableAndSeatTypeAndAisle(Boolean available, Integer seatType, Boolean aisle) {
              return eventService.queryService(available, seatType, aisle);
          }

          @Override
          public <S extends Seat> Iterable<S> saveAll(Iterable<S> iterable) {
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
          public Iterable<Seat> findAll() {
              return null;
          }

          @Override
          public Iterable<Seat> findAllById(Iterable<Long> iterable) {
              return null;
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
      };
   }


//    @Bean
//    public DataSource dataSource() {
//        System.out.println("**** USING H2 DATABASE ****");
//        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
//        return builder.setType(EmbeddedDatabaseType.H2).addScript("/loader.sql").build();
//    }


    @Bean(name = "database")
    public ArrayList<Seat> setDataBase() {
        ArrayList<Seat> seatDB = new ArrayList<>();

        seatDB.add(new Seat(true, false, 0));
        seatDB.add(new Seat(true, true, 0));
        seatDB.add(new Seat(false, false, 0));
        seatDB.add(new Seat(true, true, 1));
        seatDB.add(new Seat(false, true, 0));
        seatDB.add(new Seat(true, true, 0));
        seatDB.add(new Seat(true, false, 1));
        seatDB.add(new Seat(true, true, 0));
        seatDB.add(new Seat(false, true, 1));
        seatDB.add(new Seat(false, false, 1));

        return seatDB;
    }
}