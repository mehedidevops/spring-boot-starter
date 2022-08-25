package com.syntexpro.springbootstarter.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository
        extends JpaRepository<Student, Integer> {

    //SELECT * FROM student WHERE email = ?
    Optional<Student> findStudentByEmail(String email);
}
