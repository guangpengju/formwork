package com.gpj.learn.springcloud;

import java.net.URL;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringBootTestSuper {
    @LocalServerPort
    private int port;

    @Value("${server.servlet.context-path}")
    private String contextPath;

    private URL base;

    @Autowired
    private TestRestTemplate restTemplate;

    @Before
    public void init() throws Exception {
        String url = String.format("http://localhost:%d%s", port,contextPath);
        log.info("初始化请求IP与端口：{}", url);
        this.base = new URL(url);
    }

    public ResponseEntity<String> requestUrl(String path) {
        String url = this.base.toString() + path;
        log.info("请求路径：{}", url);
        ResponseEntity<String> result = this.restTemplate.getForEntity(
                url, String.class, "");
        log.info("请求结果为：{}", result);
        return result;
    }
}
