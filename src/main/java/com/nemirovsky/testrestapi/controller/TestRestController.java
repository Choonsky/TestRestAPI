package com.nemirovsky.testrestapi.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestRestController {

    @GetMapping("test")
    @Operation(summary = "Returns test message")
    public String getTestMessage() {

        return "This is a Test REST API service response test message!";
    }
}
