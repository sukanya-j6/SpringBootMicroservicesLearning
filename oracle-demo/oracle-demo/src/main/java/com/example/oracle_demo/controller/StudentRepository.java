package com.example.oracle_demo.controller;

import com.example.oracle_demo.dto.StudentDTO;
import com.example.oracle_demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentRepository {

    private final StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<String> saveStudent(@RequestBody StudentDTO studentDTO) {
        studentService.saveStudent(studentDTO);
        return ResponseEntity.ok("Student data saved successfully");
    }

}
