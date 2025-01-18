package com.company.userservice_dk.controllers;

import com.company.userservice_dk.dtos.SignUpRequestDto;
import com.company.userservice_dk.dtos.UserDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")

public class UserController {

    public UserDto signUp(SignUpRequestDto requestDto) {
        return null;
       // return UserDto;
    }
}
