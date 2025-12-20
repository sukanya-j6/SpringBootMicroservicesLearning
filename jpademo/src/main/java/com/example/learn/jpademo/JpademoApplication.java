package com.example.learn.jpademo;

import com.example.learn.jpademo.entity.Employee;
import com.example.learn.jpademo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class JpademoApplication {

	public static void main(String[] args) {

        SpringApplication.run(JpademoApplication.class, args);
	}

    @Bean
    CommandLineRunner runner(EmployeeRepository repo) {
        return args -> {
            Employee e = new Employee();
            //e.setId(1L);
            e.setName("Sukanya");
            e.setSalary(BigDecimal.valueOf(50000.0));
            repo.save(e);
        };
    }
}
