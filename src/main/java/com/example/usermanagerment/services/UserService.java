package com.example.usermanagerment.services;

import com.example.usermanagerment.models.User;
import com.example.usermanagerment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public int registerNewUserServiceMethod(String fname, String lname, String email, String password){
        return userRepository.registerNewUser(fname,lname,email,password);
    }

    public List<String> checkUserEmail(String email){
        return userRepository.checkUserEmail(email);
    }

    public List<String> checkUserPasswordByEmail(String email){
        return userRepository.checkUserPasswordByEmail(email);
    }

    public User getUserDetailByEmail(String email){
        return (User) userRepository.GetUserDetailsByEmail(email);
    }




}
