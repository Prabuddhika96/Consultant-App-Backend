package com.example.consultantapp.Controller;

import com.example.consultantapp.Service.LoginDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logindetails")
@CrossOrigin("http://localhost:3000")
public class LoginDetailsController {
    @Autowired
    private LoginDetailsService LoginDetails;
}
