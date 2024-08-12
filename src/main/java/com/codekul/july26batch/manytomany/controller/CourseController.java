package com.codekul.july26batch.manytomany.controller;

import com.codekul.july26batch.manytomany.entity.Course;
import com.codekul.july26batch.manytomany.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("course")
public class CourseController {

    @Autowired
    private CourseRepo courseRepo;

    @PostMapping("save")
    private String saveCourse(@RequestBody Course course){
        courseRepo.save(course);
        return "course saved";
    }
}
