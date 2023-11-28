package com.example.educationsystempartone;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Integer courseId;
    private String courseName;
    private String courseNumber;
    private int capacity;

    public Course(Integer courseId) {

        this.courseId = courseId;
    }

    public Course (String courseName, String courseNumber,int capacity) {
        this.courseName =courseName;
        this.courseNumber = courseNumber;
        this.capacity =capacity;
    }

    public Course() {

    }


    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
