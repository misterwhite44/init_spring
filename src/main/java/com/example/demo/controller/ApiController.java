package com.example.demo.controller;

import com.example.demo.service.BavardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final BavardService bavardService;

    @Autowired
    public ApiController(BavardService bavardService) {
        this.bavardService = bavardService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World !";
    }

    @GetMapping("/blabla")
    public String blabla() {
        return bavardService.parler();
    }
}
