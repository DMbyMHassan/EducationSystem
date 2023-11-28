package com.example.educationsystempartone;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer studentId;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String city;
    private String postal;
    private String phone;

    public Student(Integer studentId) {
        this.studentId = studentId;
    }
    public Student (String firstName,String lastName,String email,String address,String city,String postal,String phone){
        this.firstName =firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.city = city;
        this.postal = postal;
        this.phone = phone;
    }

    public Student() {

    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studntId) {
        this.studentId = studntId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

