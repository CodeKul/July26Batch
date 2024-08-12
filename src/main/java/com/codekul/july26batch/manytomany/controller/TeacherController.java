package com.codekul.july26batch.manytomany.controller;

import com.codekul.july26batch.manytomany.entity.Teachers;
import com.codekul.july26batch.manytomany.repository.TeacherRepo;
import com.codekul.july26batch.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    private TeacherRepo teacherRepo;

    @PostMapping("save")
    public ResponseEntity<?> saveTeacher(@RequestBody Teachers teachers){
        var response = new Response<>();
        response.setMessage("teacher saved");
        response.setStatusCode(HttpStatus.OK);
        teacherRepo.save(teachers);
        return ResponseEntity.ok(response);
    }
}
