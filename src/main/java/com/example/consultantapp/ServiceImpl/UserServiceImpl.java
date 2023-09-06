package com.example.consultantapp.ServiceImpl;

import com.example.consultantapp.Repository.UserRepository;
import com.example.consultantapp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
}
