package com.activiti.practice.bpm.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practice")
public class PracticeController {

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {

        return "Hello, " + name;
    }
}
