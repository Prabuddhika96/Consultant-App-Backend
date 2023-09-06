package com.example.consultantapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consultant")
@CrossOrigin("http://localhost:3000")
public class ConsultantController {
    @Autowired
    private ConsultantController Consultant;
}
