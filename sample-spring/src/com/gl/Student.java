package com.gl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class Student {
    @Value("Rama")
    private String name;
    @Value("Dashratha")
    private String fatherName;
    @Autowired
    private Address address;
    private Book favBook;

    public Student() {
    }


    public Student(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Book getFavBook() {
        return favBook;
    }

    @Autowired
    public void setFavBook(Book favBook) {
        this.favBook = favBook;
    }
}
