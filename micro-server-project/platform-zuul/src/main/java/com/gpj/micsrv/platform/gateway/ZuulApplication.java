package com.gpj.micsrv.platform.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @className ZuulApplication
 * @description TODO
 * @author GPJ
 * @date 2019/8/22 13:51
 * @version 1.0
 **/
@EnableZuulProxy
@SpringBootApplication
public class ZuulApplication{
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
