package com.example.oracle_demo.repository;

import com.example.oracle_demo.model.StudentAutoIdExample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentAutoIdExampleRepo extends JpaRepository<StudentAutoIdExample,Long> {

}
