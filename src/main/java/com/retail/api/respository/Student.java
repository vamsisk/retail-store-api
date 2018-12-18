package com.retail.api.respository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "student")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    private String passportNumber;

    public Student() {
        super();
    }

    public Student(Long id, String userName, String passportNumber) {
        super();
        this.id = id;
        this.userName = userName;
        this.passportNumber = passportNumber;
    }

    public Student(String userName, String passportNumber) {
        super();
        this.userName = userName;
        this.passportNumber = passportNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return String.format("Student [id=%s, userName=%s, passportNumber=%s]", id, userName, passportNumber);
    }
}