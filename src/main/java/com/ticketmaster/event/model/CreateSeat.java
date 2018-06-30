package com.ticketmaster.event.model;

        import com.ticketmaster.event.repositories.SeatRepository;
        import org.springframework.beans.factory.annotation.Autowired;

        import javax.persistence.EntityManager;
        import javax.persistence.EntityManagerFactory;
        import javax.persistence.Persistence;

public class CreateSeat {

    @Autowired
   static  SeatRepository seatRepository;

    public static void main( String[ ] args ) {



        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(
                "com.persistence");

        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        entitymanager.persist(seatRepository);

        Seat seat = new Seat();
        seat.setAvailability(true);
        seat.setAisle(false);
        seat.setSeatType(0);


        entitymanager.persist(seat);
        entitymanager.getTransaction().commit();

        entitymanager.close();
        emfactory.close();
    }

}
