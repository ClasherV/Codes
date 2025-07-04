CREATE DATABASE College;
USE College;
CREATE TABLE Student(Name VARCHAR(20), Roll_Number INT);
INSERT INTO Student(Roll_Number)
VALUES
(48),
(6);
SELECT * FROM Student;
DROP DATABASE College;