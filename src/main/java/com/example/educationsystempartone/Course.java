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
    private Integer capacity;
    private Integer year;
    private String semester;
    private Integer pid;




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

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
