package com.example.school;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {
    @Autowired
    private final SchoolRepository schoolRepository;

    public void save(School school) {
        schoolRepository.save(school);
    }

    public List<School> retrieveAll() {
        return schoolRepository.findAll();
    }
}
