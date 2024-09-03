package com.example.student;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void saveStudents(Student student){
        studentRepository.save(student);
    }
    public List<Student> retrieveStudents(){
        return studentRepository.findAll();
    }

}
