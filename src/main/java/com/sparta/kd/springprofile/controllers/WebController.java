package com.sparta.kd.springprofile.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WebController {
    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/profile")
    public String home() {
        return "profile";
    }

    @GetMapping("/projects")
    public String projects() {
        return "projects";
    }

}
