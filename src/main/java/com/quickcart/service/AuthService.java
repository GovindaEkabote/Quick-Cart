package com.quickcart.service;

import com.quickcart.model.User;
import com.quickcart.repository.UserRepository;
import com.quickcart.response.SignupRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(SignupRequest signupRequest) {
        User user = new User();
        user.setEmail(signupRequest.getEmail());
        user.setFullName(signupRequest.getFullName());
        // TODO: Handle OTP verification here

        return userRepository.save(user);
    }
}