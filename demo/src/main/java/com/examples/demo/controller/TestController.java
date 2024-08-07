package com.examples.demo.controller;

import com.examples.demo.model.Org;
import com.examples.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api-v1")
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/get")
    public ResponseEntity<List<Org>> getOrgs() {

        return new ResponseEntity<>(testService.getOrg(), HttpStatus.OK);
    }

}
