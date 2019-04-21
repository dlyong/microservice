package com.dlyong.provider.service;

import com.dlyong.provider.domain.User;
import com.dlyong.provider.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserInfoById(String id) {
        return userRepository.getOne(id);
    }
}
