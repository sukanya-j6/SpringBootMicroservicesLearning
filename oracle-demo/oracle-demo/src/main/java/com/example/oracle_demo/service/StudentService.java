package com.example.oracle_demo.service;

import com.example.oracle_demo.dto.StudentDTO;
import com.example.oracle_demo.model.StudentAutoIdExample;
import com.example.oracle_demo.repository.StudentAutoIdExampleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentAutoIdExampleRepo studentAutoIdExampleRepo;

    public void saveStudent(StudentDTO studentDTO) {

        // 1. student auto generated id example
        StudentAutoIdExample studentAutoIdExample = new StudentAutoIdExample();
        studentAutoIdExample.setFirstName(studentDTO.getFirstName());
        studentAutoIdExample.setLastName(studentDTO.getLastName());
        studentAutoIdExample.setEmailId(studentDTO.getEmailId());
        studentAutoIdExample.setDepartmentId(studentAutoIdExample.getDepartmentId());
        studentAutoIdExampleRepo.save(studentAutoIdExample);
    }
}
