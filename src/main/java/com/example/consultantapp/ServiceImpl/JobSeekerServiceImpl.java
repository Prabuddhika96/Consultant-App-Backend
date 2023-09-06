package com.example.consultantapp.ServiceImpl;

import com.example.consultantapp.DTO.JobSeekerDTO;
import com.example.consultantapp.DTO.LoginDetailsDTO;
import com.example.consultantapp.DTO.UserDTO;
import com.example.consultantapp.Model.JobSeeker;
import com.example.consultantapp.Model.User;
import com.example.consultantapp.Repository.JobSeekerRepository;
import com.example.consultantapp.Repository.UserRepository;
import com.example.consultantapp.Service.JobSeekerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobSeekerServiceImpl implements JobSeekerService {
    @Autowired
    private JobSeekerRepository jobSeekerRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public JobSeekerDTO addJobSeeker(JobSeekerDTO data) {
        try{
            User user = userRepository.getReferenceById(data.getUserUserId());
            JobSeeker jobSeeker = new JobSeeker();
            jobSeeker.setUser(user);

            JobSeeker newJobSeeker = jobSeekerRepository.save(jobSeeker);
            if(newJobSeeker!=null){
                return modelMapper.map(newJobSeeker, new TypeToken<JobSeekerDTO>() {}.getType());
            }
            return null;
        }
        catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }

    public JobSeekerDTO registerJobSeeker(User userData) {
        try{
            JobSeeker jobSeeker = new JobSeeker();
            jobSeeker.setUser(userData);

            JobSeeker newJobSeeker = jobSeekerRepository.save(jobSeeker);
            if(newJobSeeker!=null){
                return modelMapper.map(newJobSeeker, new TypeToken<JobSeekerDTO>() {}.getType());
            }
            return null;
        }
        catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
}
