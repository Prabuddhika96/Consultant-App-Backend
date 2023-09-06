package com.example.consultantapp.ServiceImpl;

import com.example.consultantapp.Repository.AvailableTimesRepository;
import com.example.consultantapp.Service.AvailableTimesService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvailableTimesServiceImpl implements AvailableTimesService {

    @Autowired
    private AvailableTimesRepository availableTimesServiceRepository;
    @Autowired
    private ModelMapper modelMapper;
}
