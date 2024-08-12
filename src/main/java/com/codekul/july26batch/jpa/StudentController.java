//package com.codekul.july26batch.jpa;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@RestController
//@RequestMapping("api/")
//public class StudentController {
//
//    @Autowired
//    private StudRepository studRepository;
//
//    @PostMapping("save")
//    public String saveStudent(@RequestBody StudentRequestDto student) {
//        Student student1 = new Student();
//        student1.setAddress(student.getAddress());
//        student1.setName(student.getName());
//        student1.setDob(student.getDob());
//        student1.setMobileNumber(student.getMobileNumber());
//        studRepository.save(student1);
//        return "student saved..";
//    }
//
//    @GetMapping("getStudent")
//    public List<Student> getStudent() {
//        return studRepository.findAll();
//    }
//
//    @GetMapping("getStudentById/{id}")
//    public Student getStudentById(@PathVariable Long id) {
//        return studRepository.getReferenceById(id);
//    }
//
//    @PutMapping("update")
//    public String updateStudent(@RequestBody Student student) {
//        Student student1 = new Student();
//        student1.setId(student.getId());
//        student1.setAddress(student.getAddress());
//        student1.setName(student.getName());
//        student1.setDob(student.getDob());
//        student1.setMobileNumber(student.getMobileNumber());
//        studRepository.save(student1);
//        return "student updated..";
//    }
//
//    @DeleteMapping("delete/{id}")
//    public String deleteStudent(@PathVariable Long id) {
//        studRepository.deleteById(id);
//        return "deleted successfully";
//    }
//
//    @GetMapping("getByName/{name}")
//    public Student deleteStudent(@PathVariable String name) {
//        return studRepository.findByName(name);
//    }
//
//    @GetMapping("getByNameAndAddress/{name}/{address}")
//    public Student deleteStudent(@PathVariable String name, @PathVariable String address) {
//        return studRepository.findByNameAndAddress(name, address);
//    }
//
//    @GetMapping("getByDate/{date}")
//    public List<Student> getByDate(@PathVariable LocalDate date) {
//        return studRepository.findByDobAfter(date);
//    }
//
//    @GetMapping("getByName1/{name}")
//    public String getByName(@PathVariable String name) {
//        return studRepository.findByName1(name);
//    }
//
//
//}
