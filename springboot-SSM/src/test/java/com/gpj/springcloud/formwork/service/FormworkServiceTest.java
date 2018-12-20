package com.gpj.springcloud.formwork.service;

import com.gpj.learn.springcloud.SpringBootTestSuper;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

@Slf4j
public class FormworkServiceTest extends SpringBootTestSuper { 
    @Autowired
    private FormworkService service;

    @Test
    public void userTest(){
        Map user = service.user("1");
        log.info("执行结果为：{}", user);
        Assert.isTrue(user != null && !user.isEmpty(),"单元测试通过");
    }
}