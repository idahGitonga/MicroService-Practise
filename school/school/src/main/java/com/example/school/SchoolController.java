package com.example.school;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Api/school")
@RequiredArgsConstructor
public class SchoolController {
    @Autowired
    private final SchoolService schoolService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody School school){
        schoolService.save(school);
    }
    @GetMapping
    public ResponseEntity<List<School>> retrieveAll(){
        return ResponseEntity.ok(schoolService.retrieveAll());

    }

}
