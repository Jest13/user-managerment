package com.example.usermanagerment.services;

import com.example.usermanagerment.models.User;
import com.example.usermanagerment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public int registerNewUserServiceMethod(String fname, String lname, String email, String password){
        // Hacher le mot de passe avant de l'enregistrer
        String hashedPassword = passwordEncoder.encode(password);
        return userRepository.registerNewUser(fname, lname, email, hashedPassword);
    }

    public List<String> checkUserEmail(String email){
        return userRepository.checkUserEmail(email);
    }

    public String checkUserPasswordByEmail(String email){
        return userRepository.checkUserPasswordByEmail(email);
    }

    public User getUserDetailByEmail(String email){
        List<User> users = userRepository.GetUserDetailsByEmail(email);
        if (!users.isEmpty()) {
            return users.get(0);
        }
        return null;
    }
}
