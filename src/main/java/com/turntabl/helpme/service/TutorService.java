package com.turntabl.helpme.service;

import com.turntabl.helpme.Models.Tutor;
import com.turntabl.helpme.Repository.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorService {
    @Autowired
    TutorRepository tutorRepository;

    public List<Tutor> getAllTutors(){
        List<Tutor> tutorsData = tutorRepository.findAll();
        return  tutorsData;
    }
}
