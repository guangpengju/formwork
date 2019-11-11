package com.gpj.micsrv.platform.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @className BlogApplication
 * @description TODO
 * @author GPJ
 * @date 2019/8/23 16:20
 * @version 1.0
 **/
@EnableSwagger2
@SpringBootApplication
public class BlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }
}
