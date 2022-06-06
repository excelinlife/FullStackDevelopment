package com.gl;

public class Address {
    private Integer houseNo;
    private String street;
    private Integer pincode;

    public Address() {
    }

    public Address(Integer houseNo, String street, String locality, String city, String state, String country, Integer pincode) {
        this.houseNo = houseNo;
        this.street = street;
        this.pincode = pincode;
    }

    public Integer getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(Integer houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }
}
