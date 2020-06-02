package com.dhiraj.Rating.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")

public class UserController {

    @GetMapping("")
    public String getUserTest(){

        return "WELCOME USER TO RATING PROJECT";

    }
}
