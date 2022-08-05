package com.API.RelationAPI.controller;

import com.API.RelationAPI.entity.Student;
import com.API.RelationAPI.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/AllStudents")
    public List<Student> getStudents(){
        return this.studentService.getStudents();
    }

    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable String studentId){
        return this.studentService.getstudent(Long.parseLong(studentId));
    }

    @PostMapping("/AddStudent")
    public Student addStudent(@RequestBody Student student){
        return this.studentService.addStudent(student);
    }

    @PutMapping("/UpdateStudent")
    public Student updateStudent(@RequestBody Student student){
        return this.studentService.updateStudent(student);
    }

    @DeleteMapping("/DeleteStudent/{studentId}")
    public ResponseEntity<HttpStatus> deleteStudent(@PathVariable String studentId){
        try {
            this.studentService.deleteStudent(Long.parseLong(studentId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
