package com.gpj.springcloud.formwork.controller;

import com.gpj.learn.springcloud.SpringBootTestSuper;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

public class FormworkControllerTest extends SpringBootTestSuper {
    
    @Test
    public void user() throws Exception {
        ResponseEntity<String> result = this.requestUrl("/api/v1/user/1");
        Assert.isTrue(!StringUtils.isEmpty(result),"测试通过");
    }

}