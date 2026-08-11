package org.example.springcruddemo.controller;

import org.example.springcruddemo.entity.Student;
import org.example.springcruddemo.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentController {
    private StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
   @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student createdStudent = studentService.createStudent(student);

        return ResponseEntity.status(HttpStatus.CREATED).body(createdStudent);
   }
   @GetMapping("/getstudent")
    public ResponseEntity<Student> getStudent(@RequestParam int id){
        Student recStudent = studentService.getStudent();
        return ResponseEntity.status(HttpStatus.OK).body(recStudent);
   }
}
