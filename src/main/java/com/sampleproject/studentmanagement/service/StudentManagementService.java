package com.sampleproject.studentmanagement.service;

import com.sampleproject.studentmanagement.model.Student;

import java.util.List;

public interface StudentManagementService {
    public String createStudent(Student student);
    public String updateStudent (Student student);
    public String deleteStudent(String studentNo);
    public Student getStudent (String studentNo);
    public List <Student> getAllStudent();

}
