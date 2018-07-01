--CREATE TABLE seat_table;
--
--
--insert into seat_table
----values(1001, "true" , "false", 0);
----values(1002, "true" , "true", 1);
----values(1003 , "true" , "true", 1);
----values(1004, "true" , "false", 0);
----values(1005, "true" , "true", 1);
--
--values(1001, true , false, 0);


CREATE TABLE seat_table(
  seat_id INT NOT NULL,
  seat_available VARCHAR(5) NOT NULL,
  seat_aisle VARCHAR(5) NOT NULL,
  seat_type INT NOT NULL,
  PRIMARY KEY (seat_id),
);

INSERT INTO seat_table
    (seat_id, seat_available, seat_aisle, seat_type)
VALUES
    (1,"true", "true", 0),
    (2,"true" "false",0),
    (3,"true","true", 0);
    (4, "true","true", 1);

