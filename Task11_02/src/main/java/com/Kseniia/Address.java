package com.Kseniia;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlType(propOrder = { "city", "street", "house" })
public class Address {
    private Attribute city;
    private String street;
    private int house;

    public Address() {
    }

    public Address(Attribute city, String street, int house) {
        this.city = city;
        this.street = street;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                '}';
    }

    public Attribute getCity() {
        return city;
    }

    public void setCity(Attribute city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

}
