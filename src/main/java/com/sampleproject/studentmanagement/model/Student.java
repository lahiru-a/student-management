package com.sampleproject.studentmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_details")
public class Student
{
    @Id
    private String studentNo;
    private String studentName;
    private String studentAddress;
    private String contactNo;
    private String emailAddress;

    public Student() {

    }


    public Student(String studentNo, String studentName, String studentAddress, String contactNo, String emailAddress) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.contactNo = contactNo;
        this.emailAddress = emailAddress;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}
