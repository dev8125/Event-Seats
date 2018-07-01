package com.ticketmaster.event;

import com.ticketmaster.event.model.JPAUtility;
import com.ticketmaster.event.model.Seat;
import com.ticketmaster.event.repositories.SeatRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
@ComponentScan("com.ticketmaster.event")
@EntityScan("com.ticketmaster.domain")
@EnableJpaRepositories("com.ticketmaster.repositories.SeatRepositories")
public class Application extends SpringBootServletInitializer
{


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

//    private static final EntityManagerFactory INSTANCE =
//            Persistence.createEntityManagerFactory("com.persistence");


//    @Autowired
//    private SeatRepository seatRepository;
//
//
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
//      }





//    Connection conn = DriverManager.getConnection(default);
//
//    String originalURL = conn.getMetaData().getURL();
//    Driver drv = DriverManager.getDriver(originalURL);
//    String driverClass = drv.getClass().getName();


}