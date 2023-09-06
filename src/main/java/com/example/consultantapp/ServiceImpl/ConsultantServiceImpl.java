package com.example.consultantapp.ServiceImpl;

import com.example.consultantapp.Repository.ConsultantRepository;
import com.example.consultantapp.Service.ConsultantService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultantServiceImpl implements ConsultantService {

    @Autowired
    private ConsultantRepository consultantRepository;
    @Autowired
    private ModelMapper modelMapper;
}
