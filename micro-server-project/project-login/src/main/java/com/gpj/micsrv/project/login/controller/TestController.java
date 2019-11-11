package com.gpj.micsrv.project.login.controller;

import com.gpj.micsrv.project.login.api.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * @className TestController
 * @description TODO
 * @author GPJ
 * @date 2019/8/20 16:13
 * @version 1.0
 **/
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    LoginService service;


    @RequestMapping("/send/{phone}")
    public String sendPhone(@PathVariable("phone") String phone){
        return service.senderCode(phone);
    }

    @RequestMapping("/login")
    public void login(HttpServletResponse response){

    }
}
