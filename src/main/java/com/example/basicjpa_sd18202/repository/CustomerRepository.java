package com.example.basicjpa_sd18202.repository;

import com.example.basicjpa_sd18202.entity.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {

    @Autowired
    private EntityManager entityManager;

    public Customer findById(long id) {
        return entityManager.find(Customer.class, id);
    }
}
