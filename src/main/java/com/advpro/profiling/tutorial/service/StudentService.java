package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author muhammad.khadafi
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    @Transactional(readOnly = true)
    public List<StudentCourse> getAllStudentsWithCourses() {
        return studentCourseRepository.findAll(Sort.by("student.id"));
    }

    public Optional<Student> findStudentWithHighestGpa() {
        Student highestGpaStudent = studentRepository.findHighestGpa();
        return Optional.ofNullable(highestGpaStudent);
    }

    public String joinStudentNames() {
        List<Student> students = studentRepository.findAll();
        List<String> studentNames = students.stream().map(Student::getName).toList();
        return String.join(", ", studentNames);
    }
}

