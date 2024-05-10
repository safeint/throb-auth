package com.throb.throbauth.service;

import com.throb.throbauth.entity.UserEntity;
import com.throb.throbauth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    private final UserRepository userRepository;

    public TestService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> queryAllUser() {
        return userRepository.findAll();
    }
}
