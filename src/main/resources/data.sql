-- Insert Students
INSERT INTO students (first_name, last_name, email, address, city, postal, phone) VALUES
                                                                                      ('John', 'Doe', 'john.doe@email.com', '123 Main St', 'City1', '12345', '555-1234'),
                                                                                      ('Jane', 'Smith', 'jane.smith@email.com', '456 Oak St', 'City2', '56789', '555-5678'),
                                                                                      ('Bob', 'Johnson', 'bob.johnson@email.com', '789 Pine St', 'City3', '67890', '555-7890'),
                                                                                      ('Alice', 'Williams', 'alice.williams@email.com', '987 Elm St', 'City4', '98765', '555-9876'),
                                                                                      ('Charlie', 'Brown', 'charlie.brown@email.com', '654 Birch St', 'City5', '87654', '555-6543');

-- Insert Courses
INSERT INTO courses (course_name, course_number, capacity) VALUES
                                                               ('Mathematics', 'MATH101', 30),


-- Enrolment for Student 1 (John Doe) in Course CP1355 with grade A
INSERT INTO enrolments (student_id, course_id, grade) VALUES
    (1, 1, 'A');

-- Enrolment for Student 2 (Jane Smith) in Course CP3300 with grade B
INSERT INTO enrolments (student_id, course_id, grade) VALUES
    (2, 2, 'B');

-- Enrolment for Student 3 (Bob Johnson) in Course CP1234 with grade B
INSERT INTO enrolments (student_id, course_id, grade) VALUES
    (3, 1, 'B');

-- Enrolment for Student 4 (Alice Williams) in Course CP7788 with grade A
INSERT INTO enrolments (student_id, course_id, grade) VALUES
    (4, 2, 'A');

-- Enrolment for Student 5 (Charlie Brown) in Course CP1980 with grade D
INSERT INTO enrolments (student_id, course_id, grade) VALUES
    (5, 1, 'D');
