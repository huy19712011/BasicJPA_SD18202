package com.example.basicjpa_sd18202.repository;


import com.example.basicjpa_sd18202.entity.ShippingAddress;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ShippingAdressRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public ShippingAddress findById(long id) {
        return entityManager.find(ShippingAddress.class, id);
    }
}
