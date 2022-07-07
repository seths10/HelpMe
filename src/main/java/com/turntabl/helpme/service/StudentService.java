package com.turntabl.helpme.service;

import com.turntabl.helpme.Models.Student;
import com.turntabl.helpme.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepo;

    public List<Student>getAllStudents(){
        List<Student> studentData = studentRepo.findAll();
        return  studentData;
    }
}
