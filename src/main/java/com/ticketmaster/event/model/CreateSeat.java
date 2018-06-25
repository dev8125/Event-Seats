package com.ticketmaster.event.model;

        import javax.persistence.EntityManager;
        import javax.persistence.EntityManagerFactory;
        import javax.persistence.Persistence;

public class CreateSeat {

    public static void main( String[ ] args ) {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(
                "com.persistence");

        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

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
