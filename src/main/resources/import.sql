--#import.sql file
--delete from SEAT_TABLE
--insert into SEAT_TABLE(SEAT_ID, AVAILABLE, AISLE, AGE_TYPE)
--    values ('1', true, true, 0)
--
--insert into SEAT_TABLE(SEAT_ID, AVAILABLE, AISLE, AGE_TYPE)
--    values ('2', false, true, 1)
--
--insert into SEAT_TABLE(SEAT_ID, AVAILABLE, AISLE, AGE_TYPE)
--    values ('1', true, true, 0)
--
--
--
--CREATE TABLE seats(
--  id INT NOT NULL,
--  available VARCHAR(5) NOT NULL,
--  seatType INT NOT NULL,
--  aisle VARCHAR(5) NOT NULL,
--  PRIMARY KEY (seat_id),
--);
--
--INSERT INTO seat_table
--    (seat_id, seat_available, seat_aisle, seat_type)
--VALUES
--    (1,"true", "true", 0),
--    (2,"true" "false",0),
--    (3,"true","true", 0);
--    (4, "true","true", 1);


INSERT INTO SEATS(id, available, seatType, aisle) VALUES (1, "true", 0, "true");
INSERT INTO SEATS(id, available, seatType, aisle) VALUES (2, "false", 1, "true");
INSERT INTO SEATS(id, available, seatType, aisle) VALUES (3, "true", 0, "true");
INSERT INTO SEATS(id, available, seatType, aisle) VALUES (4, "false", 0, "false");
INSERT INTO SEATS(id, available, seatType, aisle) VALUES (5, "true", 0, "true");
INSERT INTO SEATS(id, available, seatType, aisle) VALUES (6, "true", 1, "false");
INSERT INTO SEATS(id, available, seatType, aisle) VALUES (7, "false", 1, "true");
INSERT INTO SEATS(id, available, seatType, aisle) VALUES (8, "true", 0, "true");
