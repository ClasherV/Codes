CREATE DATABASE IF NOT EXISTS College;
USE College;

CREATE TABLE IF NOT EXISTS Student(ID int Primary Key, Name varchar(20));
INSERT INTO Student 
VALUES
(40,"Sahil Dale"),
(41,"Sanjana Rawal"),
(48,"Vaibhav Raikwar");

CREATE TABLE IF NOT EXISTS Course(Cid int Primary Key, Id int, FOREIGN KEY(Id) REFERENCES Student(ID) ON DELETE CASCADE);
INSERT INTO Course 
VALUES
(101,40),
(102,41),
(103,48);

SELECT * FROM Student;
DROP DATABASE IF EXISTS College;