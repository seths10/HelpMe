package com.turntabl.helpme.Models;

import javax.persistence.*;

@Entity
@Table(name = "tutor")
public class Tutor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tutor_id;
    private String first_name;
    private String last_name;
    private String email;
    private String tutor_password;
    private String skill;
    private String day_available;

    public Integer getTutor_id() {
        return tutor_id;
    }

    public void setTutor_id(Integer tutor_id) {
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

    public String getTutor_password() {
        return tutor_password;
    }

    public void setTutor_password(String tutor_password) {
        this.tutor_password = tutor_password;
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