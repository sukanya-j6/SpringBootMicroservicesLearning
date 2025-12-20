package com.example.learn.jpademo.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="Employee")
public class Employee {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "emp_seq_gen"
    )
    @SequenceGenerator(
            name = "emp_seq_gen",
            sequenceName = "EMP_SEQ",
            allocationSize = 1
    )
    private Long id;

    private String name;

    private BigDecimal salary;

    public Employee() {

    }

    public Employee(Long id, String firstName, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
