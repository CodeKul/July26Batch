package com.codekul.july26batch.manytomany.controller;

import com.codekul.july26batch.manytomany.entity.Course;
import com.codekul.july26batch.manytomany.entity.Student;
import com.codekul.july26batch.manytomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("save")
    private String saveStudent(@RequestBody Student student){
        studentRepository.save(student);
        return "student saved";
    }
}
