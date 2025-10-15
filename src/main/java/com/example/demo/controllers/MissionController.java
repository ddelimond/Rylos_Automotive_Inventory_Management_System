package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 *
 *
 *
 */

@Controller
public class MissionController {

    public MissionController(){

    }
    @GetMapping("/mission")
    public String pullUpPage(){

        return "mission";
    }
}
