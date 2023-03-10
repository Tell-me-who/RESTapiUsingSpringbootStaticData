package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    // url - http://localhost:8080/student
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Shreya", "Sardeshmukh");
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Shreya","Sardeshmukh"));
        students.add(new Student("Vrushali","Patil"));
        students.add(new Student("Maithili","Mali"));
        students.add(new Student("Karan","Karale"));

        return students;
    }

}
