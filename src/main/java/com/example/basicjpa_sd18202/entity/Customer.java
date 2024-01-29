package com.example.basicjpa_sd18202.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.ToString;

//@Data
//@ToString
@Entity
public class Customer {

    @Id
    private long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "fk_shipping_address") // custom column name
    private ShippingAddress address;

    public Customer() {
    }

    public Customer(long id, String name, ShippingAddress address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShippingAddress getAddress() {
        return address;
    }

    public void setAddress(ShippingAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
//                ", address=" + getAddress() +
                '}';
    }
}
