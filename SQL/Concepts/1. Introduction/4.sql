CREATE DATABASE College;
USE College;
CREATE TABLE Student(Name varchar(20), Roll_No int, Age int);
INSERT INTO Student VALUES("Sanjana Rawal",41,19);
INSERT INTO Student VALUES("Vaibhav Raikwar",48,19);
SELECT Name FROM Student;
SELECT Name, Age FROM Student;
DROP DATABASE College;