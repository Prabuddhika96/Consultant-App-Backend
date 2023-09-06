package com.example.consultantapp.Controller;

import com.example.consultantapp.Service.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobseeker")
@CrossOrigin("http://localhost:3000")
public class JobSeekerController {
    @Autowired
    private JobSeekerService LoginDetails;
}
