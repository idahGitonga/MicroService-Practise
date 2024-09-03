package com.example.student;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudents(@RequestBody Student student){
        studentService.saveStudents(student);
    }
    @GetMapping("/retrieve")
    public ResponseEntity<List<Student>>retrieveStudents(){
        return ResponseEntity.ok(studentService.retrieveStudents());
    }
}
