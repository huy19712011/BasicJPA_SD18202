package com.example.basicjpa_sd18202;

import com.example.basicjpa_sd18202.entity.Course;
import com.example.basicjpa_sd18202.repository.CourseJdbcRepository;
import com.example.basicjpa_sd18202.repository.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    private final CourseJdbcRepository repository;
    private final CourseJpaRepository jpaRepository;

    public CourseCommandLineRunner(CourseJdbcRepository repository, CourseJpaRepository jpaRepository) {
        this.repository = repository;
        this.jpaRepository = jpaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        repository.insert();
//
//        repository.insert2(new Course(4, "React", "FPoly"));

        // jpa
        jpaRepository.insert(new Course(1, "React", "FPoly"));
        jpaRepository.insert(new Course(2, "Java", "FPoly"));
        jpaRepository.insert(new Course(3, "Spring", "FPoly"));

        System.out.println(jpaRepository.findById(1L));
    }
}
