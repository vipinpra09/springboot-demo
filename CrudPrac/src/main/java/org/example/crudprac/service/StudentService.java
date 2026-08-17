package org.example.crudprac.service;

import org.example.crudprac.dto.StuReqDto;
import org.example.crudprac.entity.Student;
import org.example.crudprac.repository.StudentRepository;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
//    public Student createStudent(Student student) {
//        return studentRepository.save(student);
//    }
//        public Student getStudent(int id) {
//        Optional<Student> optionalStudent = studentRepository.findById(id);
//        if (optionalStudent.isPresent()) {
//            return optionalStudent.get();
//        }
//        return null;
//    }
//    public boolean deleteStudent(int id) {
//        Optional<Student> optStu = studentRepository.findById(id);
//        if(optStu.isPresent()) {
//            studentRepository.deleteById(id);
//            return true;
//        }
//        return false;
//    }

    //With DTO
    public Student createStudent(StuReqDto stuReqDto) {
        Student s = new Student();
        s.setFirstName(stuReqDto.getFirstName());
        s.setLastName(stuReqDto.getLastName());
        return studentRepository.save(s);
    }
    public Student getStudent(int id) {
        Optional<Student> opt = studentRepository.findById(id);
        if(opt.isPresent()){
            return opt.get();
        }
        return null;
    }
    public boolean deleteStudent(int id) {
        Optional<Student> opt = studentRepository.findById(id);
        if(opt.isPresent()){
            studentRepository.deleteById(id);
        }
        return true;
    }
}
