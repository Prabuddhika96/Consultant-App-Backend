package com.example.consultantapp.Controller;

import com.example.consultantapp.Model.Appointment;
import com.example.consultantapp.Service.AvailableTimes;
import com.example.consultantapp.Service.Consultant;
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
