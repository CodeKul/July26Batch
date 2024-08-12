//package com.codekul.july26batch.jpa;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//import java.time.LocalDate;
//
//@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//public class Student {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//
//    private String address;
//
//    private LocalDate dob;
//
//    private String mobileNumber;
//
//    private Integer age;
//
//
//    public String getMobileNumber() {
//        return mobileNumber;
//    }
//
//    public void setMobileNumber(String mobileNumber) {
//        this.mobileNumber = mobileNumber;
//    }
//
//    public LocalDate getDob() {
//        return dob;
//    }
//
//    public void setDob(LocalDate dob) {
//        this.dob = dob;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//}
