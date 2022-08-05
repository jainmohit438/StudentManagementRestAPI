package com.API.RelationAPI.service;

import com.API.RelationAPI.entity.Student;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentService {
    public List<Student> getStudents();

    public Student getstudent(Long sid);
    public Student addStudent(Student student);

    public Student updateStudent(Student student);

    public void deleteStudent(Long parseLong);
}
