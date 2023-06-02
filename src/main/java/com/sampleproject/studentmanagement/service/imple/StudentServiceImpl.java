package com.sampleproject.studentmanagement.service.imple;

import com.sampleproject.studentmanagement.model.Student;
import com.sampleproject.studentmanagement.repository.StudentRepository;
import com.sampleproject.studentmanagement.service.StudentManagementService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentManagementService {

    StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }



    @Override
    public String createStudent(Student student) {
        studentRepository.save(student);
        return "Success";
    }

    @Override
    public String updateStudent(Student student) {
        studentRepository.save(student);
        return "Success";
    }

    @Override
    public String deleteStudent(String studentNo) {
        studentRepository.deleteById(studentNo);
        return null;
    }

    @Override
    public Student getStudent(String studentNo) {
        return studentRepository.findById(studentNo).get();

    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}
