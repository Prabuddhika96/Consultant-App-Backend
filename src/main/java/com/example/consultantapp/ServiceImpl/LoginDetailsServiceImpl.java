package com.example.consultantapp.ServiceImpl;

import com.example.consultantapp.DTO.LoginDetailsDTO;
import com.example.consultantapp.DTO.UserFullDTO;
import com.example.consultantapp.Model.LoginDetails;
import com.example.consultantapp.Model.User;
import com.example.consultantapp.Repository.LoginDetailsRepository;
import com.example.consultantapp.Service.LoginDetailsService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginDetailsServiceImpl implements LoginDetailsService {
    @Autowired
    private LoginDetailsRepository loginDetailsRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public boolean validateEmail(String email){
        boolean valid=false;
        try{
            LoginDetails logindetails = loginDetailsRepository.validateEmail(email);
            if(logindetails==null){
                valid=true;
            }
            return valid;
        }
        catch(Exception e){
            System.out.println(e.toString());
            return valid;
        }
    }

    public LoginDetailsDTO addLoginDetails(UserFullDTO userdata, User user){
        try{
//            String hashedPW= passwordEncoder.encode(userdata.getPassword());
            String hashedPW= userdata.getPassword();
            LoginDetails ld=new LoginDetails();
            ld.setEmail(userdata.getEmail());
            ld.setPassword(hashedPW);
            ld.setUser(user);

            LoginDetails newLd = loginDetailsRepository.save(ld);
            return modelMapper.map(ld, new TypeToken<LoginDetailsDTO>() {}.getType());
        }
        catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
}
