package com.sampleproject.studentmanagement.controller;

import com.sampleproject.studentmanagement.model.Student;
import com.sampleproject.studentmanagement.service.StudentManagementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student-management")
public class StudentManagementAPI {

    public StudentManagementAPI(StudentManagementService studentManagementService) {
        this.studentManagementService = studentManagementService;
    }

    StudentManagementService studentManagementService;

    //get specific student
    @GetMapping("{studentNo}")
    public Student getStudentDetails(@PathVariable("studentNo") String studentNo){
        return studentManagementService.getStudent(studentNo);
    }

    //get all students
    @GetMapping
    public List<Student> getAllStudentDetails(){
        return studentManagementService.getAllStudent();
    }

    @PostMapping
    public String createStudent(@RequestBody Student student){
        studentManagementService.createStudent(student);
        return "Student Registration is Successfully Completed.";
    }

    @PutMapping
    public String updateStudent(@RequestBody Student student){
        studentManagementService.updateStudent(student);
        return "Student Details Successfully Updated.";
    }

    @DeleteMapping("{studentNo}")
    public String deleteStudent(@PathVariable("studentNo") String studentNo){
        studentManagementService.deleteStudent(studentNo);
        return "Student Profile Successfully Removed.";
    }


}
