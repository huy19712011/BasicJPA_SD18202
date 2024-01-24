package com.example.basicjpa_sd18202.repository;

import com.example.basicjpa_sd18202.entity.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

    @PersistenceContext
    private final EntityManager entityManager;

    public CourseJpaRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void insert(Course course) {
        entityManager.merge(course);
    }

    public Course findById(long id) {
        return entityManager.find(Course.class, id);
    }
}
