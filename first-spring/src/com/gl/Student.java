package com.gl;

public class Student {
    private String name;
    private String fatherName;
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

    public void setFavBook(Book favBook) {
        this.favBook = favBook;
    }
}
