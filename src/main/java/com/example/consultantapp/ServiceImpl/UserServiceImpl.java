package com.example.consultantapp.ServiceImpl;

import com.example.consultantapp.DTO.LoginDetailsDTO;
import com.example.consultantapp.DTO.UserDTO;
import com.example.consultantapp.DTO.UserFullDTO;
import com.example.consultantapp.Model.LoginDetails;
import com.example.consultantapp.Model.User;
import com.example.consultantapp.Repository.UserRepository;
import com.example.consultantapp.Service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDTO addUser(UserFullDTO userData) {
        try{
         User user = modelMapper.map(userData, User.class);
        return modelMapper.map(user, new TypeToken<UserDTO>() {}.getType());

//            LoginDetails newLd = loginDetailsRepository.save(ld);
//            return modelMapper.map(ld, new TypeToken<LoginDetailsDTO>() {}.getType());
        }
        catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
}
