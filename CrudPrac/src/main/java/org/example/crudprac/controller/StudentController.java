package org.example.crudprac.controller;

import jakarta.validation.Valid;
import org.example.crudprac.dto.StuReqDto;
import org.example.crudprac.entity.Student;
import org.example.crudprac.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentController {
    private StudentService studentService;

    StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
//        @PostMapping("/create")
//    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
//        Student stuRes = studentService.createStudent(student);
//        return ResponseEntity.status(HttpStatus.CREATED).body(stuRes);
//        }
//        @GetMapping("/get")
//    public ResponseEntity<Student> getStudent(@RequestParam int id) {
//        Student stuRes = studentService.getStudent(id);
//        if(stuRes != null) {
//            return ResponseEntity.ok(stuRes);
//        }
//        return ResponseEntity.notFound().build();
//        }
//        @DeleteMapping("/delete")
//    public ResponseEntity<String> deleteStudent(@RequestParam int id) {
//        boolean result = studentService.deleteStudent(id);
//        if(result) {
//            return ResponseEntity.ok("Student deleted");
//        }
//        return ResponseEntity.notFound().build();
//        }

    // With Dto
@PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody @Valid StuReqDto stuReqDto) {
        Student stuReq = studentService.createStudent(stuReqDto);
        return ResponseEntity.ok(stuReq);
}

    @GetMapping("/get")
    public ResponseEntity<Student> getstudent(@RequestParam int id){
        Student getStu = studentService.getStudent(id);
        if(getStu != null){
            return ResponseEntity.ok().body(getStu);
        }
        return ResponseEntity.notFound().build();
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Student> deleteStudent(@RequestParam int id){
        Student delStu =  studentService.getStudent(id);
        if(delStu != null){
            return ResponseEntity.ok().body(delStu);
        }
        return ResponseEntity.notFound().build();
    }
}
