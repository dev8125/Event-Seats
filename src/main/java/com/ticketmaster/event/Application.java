package com.ticketmaster.event;

import com.ticketmaster.event.model.JPAUtility;
import com.ticketmaster.event.model.Seat;
import com.ticketmaster.event.repositories.SeatRepository;
import com.ticketmaster.event.service.EventService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
@ComponentScan("com.ticketmaster.event")
@EntityScan("com.ticketmaster.domain")
@EnableJpaRepositories("com.ticketmaster.repositories.SeatRepositories")
public class Application extends SpringBootServletInitializer
{


    public static void main(String[] args) throws Exception {
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
            public List<Seat> findByAvailableAndSeatTypeAndAisle(Boolean available, Integer seatType, Boolean aisle) {
                return eventService.queryService(available,seatType,aisle);

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

    @Bean
    public DataSource dataSource() {
        System.out.println("**** USING H2 DATABASE ****");
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        return builder.setType(EmbeddedDatabaseType.H2).addScript("/loader.sql").build();
    }



}