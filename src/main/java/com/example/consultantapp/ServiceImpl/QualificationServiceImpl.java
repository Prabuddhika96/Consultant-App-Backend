package com.example.consultantapp.ServiceImpl;

import com.example.consultantapp.Repository.LoginDetailsRepository;
import com.example.consultantapp.Repository.QualificationRepository;
import com.example.consultantapp.Service.QualificationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QualificationServiceImpl implements QualificationService {

    @Autowired
    private QualificationRepository qualificationRepository;
    @Autowired
    private ModelMapper modelMapper;
}
