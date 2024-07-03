package com.app.demo_apps_jenkins.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class HalloController {

    @GetMapping(value = "/{hallo}")
    public ResponseEntity<String> hallo(@PathVariable("hallo")String hallo){
        return ResponseEntity.ok().body("Hi ! "+hallo);
    }
}
