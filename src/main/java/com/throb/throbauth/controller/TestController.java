package com.throb.throbauth.controller;

import com.throb.throbauth.entity.UserEntity;
import com.throb.throbauth.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/allUser")
    public List<UserEntity> getAllUser() {
        return testService.queryAllUser();
    }
}
