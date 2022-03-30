package com.codegym.model;

import org.hibernate.annotations.Check;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Tự tăng
    private int id;
    @Column
    @Size(min=5,max = 45,message = "ky tu tu 5 den 45")
    private String firstname;
    @Column
    @Size(min=5,max = 45,message = "ky tu tu 5 den 45")
    private String lastname;
    @Column
    @Phone(message = "Phone Number is invalid")
    private String phoneNumber;
    @Column

    @Min(18)
    private int age;
    @Column
    @NotBlank
    @Email
    private String email;

    public User(int id, String firstname, String lastname, String phoneNumber, int age, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public User(String firstname, String lastname, String phoneNumber, int age, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
