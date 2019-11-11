package com.gpj.micsrv.platform.blog.common.swagger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @className Swagger2
 * @description TODO
 * @author GPJ
 * @date 2019/8/23 16:20
 * @version 1.0
 **/
@Configuration
public class Swagger2 {
    @Value("${xy.gateway.url:http://localhost}")
    private String gatewayUrl;

    @Bean
    public DocketFactory docketFactory(){
        return new DocketFactory(gatewayUrl);
    }

    @Bean
    public Docket loginDocket(DocketFactory docketFactory) {
        return docketFactory.createSTDDocket("登录模块", "login", "LOGIN-PROXY");
    }
}
