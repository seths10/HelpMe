package com.TLC.HelpMeSpringBoot.repository;

import com.TLC.HelpMeSpringBoot.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students,Long> {
}
