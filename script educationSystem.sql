
CREATE DATABASE IF NOT EXISTS educationsystem;

-- Use educationsystem
USE educationsystem;

-- Create Students table
CREATE TABLE Student (
    student_id INTEGER PRIMARY KEY AUTO_INCREMENT,
    firstName VARCHAR(255),
    lastName VARCHAR(255),
    email VARCHAR(255),
    address VARCHAR(255),
    city VARCHAR(255),
    postal VARCHAR(10),
    phone VARCHAR(15)
);

-- Create Courses table
CREATE TABLE Course (
    course_id INTEGER PRIMARY KEY AUTO_INCREMENT,
    course_name VARCHAR(255),
    course_number VARCHAR(255),
    capacity INTEGER,
    year YEAR,
    semester VARCHAR(255),
    pid INTEGER(255)
);

-- Create Programs table
CREATE TABLE Programs (
   pid INTEGER PRIMARY KEY AUTO_INCREMENT,
   program_name VARCHAR(255),
   campus  VARCHAR(255)
);

-- Create Enrolments table
CREATE TABLE Enrollment (
    eid INTEGER PRIMARY KEY AUTO_INCREMENT,
    course_id INTEGER,
    student_id INTEGER

);


USE educationsystem;
-- Create Grades table
CREATE TABLE Grades (
    gid INTEGER PRIMARY KEY AUTO_INCREMENT,
    student_id INTEGER,
    course_id INTEGER,
    grade VARCHAR(2)
  
);

-- Show tables in educationsystem
SHOW TABLES;



-- Insert students
INSERT INTO student (firstName,lastName,email, address, city, postal, phone)
VALUES
('Mahmooud','kamal','mh@yahoo.com', '10 Higgines line', 'St.Johns', 'A124M4', 7097641111),
('Ahmed', 'kamal', 'Ak@yahoo.com', '20 Higgines line', 'St.Johns', 'A124A4', 7097642222),
('Hamed', 'Bosha', 'HB@yahoo.com', '30 Higgines line', 'St.Johns', 'A124H4', 7097643333),
('Miral', 'Mahmoud', 'MM@yahoo.com', '40 Higgines line', 'St.Johns', 'A124B4', 709764444),
('Lana', 'Hamza', 'lh@yahoo.com', '50 Higgines line', 'St.Johns', 'A124D4', 709765555);

-- Insert programs
INSERT INTO programs (program_name, campus)
VALUES
('ASD', 'IT'),
('cyberSecurity', 'IT');

-- Insert courses
INSERT INTO course (course_name, course_number, capacity, year, semester, pid)
VALUES
('Applied java', 'CP3566', 20, 2023, 'S3', 1),
('AWS', 'CP2030', 20, 2023, 'S3', 1);
-- Insert enrolments
INSERT INTO enrollment (course_id, student_id) VALUES
(1,1),
(1,2),
(1,3),
(2,4),
(2,5);

-- Insert grades
INSERT INTO grades (student_id, course_id ,grade) VALUES
(1, 1, 'A'),
(2, 1, 'B'),
(3, 1, 'C'),
(4, 2, 'A'),
(5, 2, 'B');

SELECT * FROM student;
SELECT * FROM programs;
SELECT * FROM course;
SELECT * FROM enrollment;
SELECT * FROM grades;


