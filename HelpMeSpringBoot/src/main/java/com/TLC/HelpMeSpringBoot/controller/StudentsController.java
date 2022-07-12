package com.TLC.HelpMeSpringBoot.controller;


import com.TLC.HelpMeSpringBoot.repository.StudentsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentsController {

    private final StudentsRepository studentsRepository;

    public StudentsController(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    @GetMapping
    public ResponseEntity getAllStudents(){
        return ResponseEntity.ok(this.studentsRepository.findAll());
    }
}
