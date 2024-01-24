package com.example.basicjpa_sd18202;

import com.example.basicjpa_sd18202.entity.Course;
import com.example.basicjpa_sd18202.repository.CourseJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    private final CourseJdbcRepository repository;

    public CourseCommandLineRunner(CourseJdbcRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.insert();

        repository.insert2(new Course(4, "React", "FPoly"));
    }
}
