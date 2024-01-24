package com.example.basicjpa_sd18202.repository;

import com.example.basicjpa_sd18202.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    private final JdbcTemplate jdbcTemplate;
    private static String INSERT_QUERY =
            """
                INSERT INTO course (id, name, author)
                VALUES (3, 'Spring Data JPA', 'FU')
            """;

    private static String INSERT_QUERY2 =
            """
                INSERT INTO course (id, name, author)
                VALUES (?, ?, ?)
            """;

    public CourseJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert() {
        jdbcTemplate.update(INSERT_QUERY);
    }

    public void insert2(Course course) {
        jdbcTemplate.update(INSERT_QUERY2, course.getId(), course.getName(), course.getAuthor());
    }

}
