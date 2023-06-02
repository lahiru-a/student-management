package com.sampleproject.studentmanagement.repository;

import com.sampleproject.studentmanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, String>{

}
