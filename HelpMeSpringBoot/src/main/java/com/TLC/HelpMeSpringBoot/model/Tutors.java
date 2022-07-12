package com.TLC.HelpMeSpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tutors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long tutor_id;

    private String first_name;

    private String last_name;

    private String email;

    private String password;

    private String skill;

    private String day_available;

    public Tutors() {
    }

    public Tutors(long tutor_id, String first_name, String last_name, String email, String password, String skill, String day_available) {
        this.tutor_id = tutor_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.skill = skill;
        this.day_available = day_available;
    }

    public long getTutor_id() {
        return tutor_id;
    }

    public void setTutor_id(long tutor_id) {
        this.tutor_id = tutor_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getDay_available() {
        return day_available;
    }

    public void setDay_available(String day_available) {
        this.day_available = day_available;
    }
}
