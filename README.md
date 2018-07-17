# DOCUMENTATION #

Restful Web Service with attached JPA Repository. 

Purpose of this project is to become familiar with the inner workings 
of Spring Boot. 

Demo Project uses JPA Repository and query methods to search for 
Seats specified by different filters. 


Events are identified by a unique id, and each event has Seats available for sale. Seats have the following properties.

available = true | false // Boolean

aisle = true | false // Boolean

type = adult | child // Integer, Enum

END POINT FOR ACCESS : localhost:8080/event/{eventId}/seats


EXAMPLE: http://http://localhost:8080/event/001/seats?avail=true&aisle=false&seatType=ADULT

RESPONSE: {"eventId":"001","count":4,"seats":[{"seatId":9,"seatType":"ADULT","eventId":"001","available":true,"aisle":false},{"seatId":15,"seatType":"ADULT","eventId":"001","available":true,"aisle":false},{"seatId":34,"seatType":"ADULT","eventId":"001","available":true,"aisle":false},{"seatId":40,"seatType":"ADULT","eventId":"001","available":true,"aisle":false}]}