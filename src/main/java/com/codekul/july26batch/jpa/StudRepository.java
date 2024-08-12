//package com.codekul.july26batch.jpa;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import java.time.LocalDate;
//import java.util.List;
//
//public interface StudRepository extends JpaRepository<Student,Long> {
//
//    Student findByName(String name);
//
//    Student findByNameAndAddress(String name, String address);
//
//    List<Student> findByDobAfter(LocalDate date);
//
//    @Query(value = "SELECT address FROM public.student where name =?1",nativeQuery = true)
//    String findByName1(String name);
//}
