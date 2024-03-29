package com.example.basicjpa_sd18202;

import com.example.basicjpa_sd18202.entity.Course;
import com.example.basicjpa_sd18202.entity.Customer;
import com.example.basicjpa_sd18202.entity.ShippingAddress;
import com.example.basicjpa_sd18202.repository.CourseJdbcRepository;
import com.example.basicjpa_sd18202.repository.CourseJpaRepository;
import com.example.basicjpa_sd18202.repository.CustomerRepository;
import com.example.basicjpa_sd18202.repository.ShippingAdressRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    private final CourseJdbcRepository repository;
    private final CourseJpaRepository jpaRepository;
    private CustomerRepository customerRepository;
    private ShippingAdressRepository shippingAdressRepository;

    public CourseCommandLineRunner(CourseJdbcRepository repository, CourseJpaRepository jpaRepository, CustomerRepository customerRepository, ShippingAdressRepository shippingAdressRepository) {
        this.repository = repository;
        this.jpaRepository = jpaRepository;
        this.customerRepository = customerRepository;
        this.shippingAdressRepository = shippingAdressRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        repository.insert();
//
//        repository.insert2(new Course(4, "React", "FPoly"));

        // jpa
//        jpaRepository.insert(new Course(1, "React", "FPoly"));
//        jpaRepository.insert(new Course(2, "Java", "FPoly"));
//        jpaRepository.insert(new Course(3, "Spring", "FPoly"));
//
//        System.out.println(jpaRepository.findById(1L));

        // unidirectional
        Customer customer = customerRepository.findById(1L);
        System.out.println(customer.getAddress().getCity());
        System.out.println(customer.getAddress());

        // bidirectional
        ShippingAddress shippingAddress = shippingAdressRepository.findById(1001L);
        System.out.println(shippingAddress.getCustomer().getId());
        System.out.println(shippingAddress.getCustomer());

    }
}
