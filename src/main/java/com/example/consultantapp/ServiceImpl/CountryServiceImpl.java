package com.example.consultantapp.ServiceImpl;

import com.example.consultantapp.Repository.CountryRepository;
import com.example.consultantapp.Service.CountryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private ModelMapper modelMapper;
}
