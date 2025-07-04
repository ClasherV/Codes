CREATE DATABASE IF NOT EXISTS College;
USE College;

CREATE TABLE IF NOT EXISTS Student(Name varchar(20), Roll_No int PRIMARY KEY, Age int);
INSERT INTO Student
VALUES
("Sahil Dale",40,19),
("Sanjana Rawal",41,19),
("Vaibhav Raikwar",48,19);

SELECT * FROM Student;

UPDATE Student
SET Age=20
where Name = "Sahil Dale";

SELECT * FROM Student;

DROP DATABASE IF EXISTS College;