package org.example.springcruddemo.service;

import org.example.springcruddemo.entity.Student;
import org.example.springcruddemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
private StudentRepository studentRepository;
public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
}

public Student createStudent(Student studentReq) {
    Student StudentRes = studentRepository.save(studentReq);
    return StudentRes;
}

}
