package com.project.services;

import com.project.repositories.StudentInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentInfoService {
    @Autowired
    private StudentInfoRepository studentInfoRepository;
}
