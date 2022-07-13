package com.TLC.HelpMeSpringBoot.controller;

import com.TLC.HelpMeSpringBoot.repository.TutorsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tutors")
public class TutorsController {

    private final TutorsRepository tutorsRepository;

    public TutorsController(TutorsRepository tutorsRepository) {
        this.tutorsRepository = tutorsRepository;
    }

    @CrossOrigin("http://localhost:4200/")
    @GetMapping
    public ResponseEntity getAllTutors(){
        return ResponseEntity.ok(this.tutorsRepository.findAll());
    }
}
