CREATE DATABASE College;
USE College;
CREATE TABLE Student(Name VARCHAR(20), Roll_Number INT);
INSERT INTO Student
VALUES
("Vaibhav Raikwar",48),
("AC",6),
(NULL,1);
SELECT * FROM Student;
DROP DATABASE College;