package com.modelmapperproject.controller;

import com.modelmapperproject.service.impl.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    //for displaying JSON of userDto
    @GetMapping("/userDto")
    public ResponseEntity<Object> getAllUserDto() {
        return ResponseEntity.ok(userService.getUserDtoFromUser());
    }


    //for displaying JSON of userModel
    @GetMapping("/userModel")
    public ResponseEntity<Object> getAllUser() {
        return ResponseEntity.ok(userService.getUserFromUserDto());
    }
}
