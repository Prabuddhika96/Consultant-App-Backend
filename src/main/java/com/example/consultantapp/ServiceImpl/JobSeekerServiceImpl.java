package com.example.consultantapp.ServiceImpl;

import com.example.consultantapp.DTO.JobSeekerDTO;
import com.example.consultantapp.Repository.JobSeekerRepository;
import com.example.consultantapp.Service.JobSeekerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobSeekerServiceImpl implements JobSeekerService {
    @Autowired
    private JobSeekerRepository jobSeekerRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public JobSeekerDTO addJobSeeker(String email) {
        return null;
    }
}
