package com.turntabl.helpme.Repository;

import com.turntabl.helpme.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
