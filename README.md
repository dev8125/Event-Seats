#DOCUMENTATION #

Restful Web Service with attached JPA Repository. 

Purpose of this project is to become familiar with the inner workings 
of Spring Boot. 

Demo Project uses JPA Repository and query methods to search for 
Seats specified by different filters. 


Events are identified by a unique id, and each event has Seats available for sale. Seats have the following properties.

available = true | false // Boolean

aisle = true | false // Boolean

type = adult | child // Integer 0=child, 1=adult

END POINT FOR ACCESS : localhost:8080/getNumSeats/event/service