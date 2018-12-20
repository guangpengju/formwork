package com.gpj.springcloud.formwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.gpj.springcloud.formwork")
public class FormworkApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(FormworkApplication.class,args);
    }
}
