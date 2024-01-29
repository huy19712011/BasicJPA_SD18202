package com.example.basicjpa_sd18202.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.ToString;

//@Data
//@ToString
@Entity
public class ShippingAddress {

    @Id
    private long id;

    private String city;

    @OneToOne(mappedBy = "address")
    private Customer customer;

    public ShippingAddress() {
    }

    public ShippingAddress(long id, String city, Customer customer) {
        this.id = id;
        this.city = city;
        this.customer = customer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "ShippingAddress{" +
                "id=" + id +
                ", city='" + city + '\'' +
//                ", customer=" + getCustomer() +
                '}';
    }
}
