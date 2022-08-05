package com.API.RelationAPI.service;

import com.API.RelationAPI.entity.Student;
import com.API.RelationAPI.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getstudent(Long sid) {
        return studentRepository.getOne(sid);
    }

    @Override
    public Student addStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

    @Override
    public Student updateStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

    @Override
    public void deleteStudent(Long parseLong) {
        Student student=studentRepository.getOne(parseLong);
        studentRepository.delete(student);
    }





    /*
    List<Student>list;

    public StudentServiceImpl() {
        list=new ArrayList<>();
        list.add(new Student(1001,1,10001,"Mohit Jain"));
        list.add(new Student(1002,1,10002,"Harshit Singhal"));
        list.add(new Student(1003,2,10003,"Anurag Gupta"));
    }

    @Override
    public List<Student> getStudents() {
        return list;
    }

    @Override
    public Student getstudent(long sid) {
        Student s=null;
        for(Student student:list){
            if(student.getSid()==sid){
                s=student;
                break;
            }
        }
        return s;
    }

    @Override
    public Student addStudent(Student student) {
        list.add(student);
        return student;
    }

    @Override
    public Student updateStudent(Student student) {
        list.forEach(e->{
            if(e.getSid()==student.getSid()){
                e.setStudentName(student.getStudentName());
            }
        });
        return student;
    }

    @Override
    public void deleteStudent(long parseLong) {
        list=this.list.stream().filter(e->e.getSid()!=parseLong).collect(Collectors.toList());
    }
    */

}
