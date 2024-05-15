package com.cloud.dbconnector.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("testcase")
public class TestCaseController {

    @GetMapping("/home")
    public String Home() {
        return "You have reached home of test case controller";
    }
}
