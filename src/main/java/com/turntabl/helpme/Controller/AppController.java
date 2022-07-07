package com.turntabl.helpme.Controller;

import com.turntabl.helpme.Models.Student;
import com.turntabl.helpme.Repository.StudentRepository;
import com.turntabl.helpme.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class AppController {
    @Autowired
    StudentService studentService;
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
