package com.gpj.springcloud.formwork.controller;

import com.gpj.springcloud.formwork.service.FormworkService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class FormworkController {
    
    @Autowired
    private FormworkService service;
    
    @GetMapping("/{loginId}")
    public ResponseEntity User(@PathVariable("loginId") String Id){
        Map user = service.user(Id);
        return new ResponseEntity(user, HttpStatus.OK);
    }
}
