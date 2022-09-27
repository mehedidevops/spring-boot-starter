package com.syntexpro.springbootstarter.student.service;

import com.syntexpro.springbootstarter.student.entity.Student;
import com.syntexpro.springbootstarter.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> getStudents() {
        return repository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentOptional = repository.findStudentByEmail(student.getEmail());
        if (studentOptional.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        repository.save(student);

    }

    public void deleteStudent(Integer studentId) {
        boolean exists = repository.existsById(studentId);
        if (!exists) {
            throw new IllegalStateException("student with id " + studentId + " does not exists");
        }
        repository.deleteById(studentId);
    }

    @Transactional
    public void updateStudent(Integer studentId, String name, String email) {
        Student student = repository.findById(studentId).orElseThrow(() -> new IllegalStateException(
                "student with id " + studentId + " does not exists"));

        if (name != null &&
                name.length() > 0 && !Objects.equals(student.getName(), name)) {
            student.setName(name);
        }

        if (email != null &&
                email.length() > 0 &&
                !Objects.equals(student.getEmail(), email)) {
            Optional<Student> studentOptional = repository.findStudentByEmail(email);
            if (studentOptional.isPresent()) {
                throw new IllegalStateException("email taken");
            }
            student.setEmail(email);
        }
        ;
    }
}

