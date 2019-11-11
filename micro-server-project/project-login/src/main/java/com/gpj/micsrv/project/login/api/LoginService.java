package com.gpj.micsrv.project.login.api;

import com.gpj.micsrv.project.common.api.login.LoginApi;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @className LoginService
 * @description TODO
 * @author GPJ
 * @date 2019/8/20 14:24
 * @version 1.0
 **/
@FeignClient(value = "LOGIN-PROXY", fallbackFactory = LoginService.Fallback.class, path = "login-proxy")
public interface LoginService extends LoginApi {

    @Slf4j
    @Component
    class Fallback implements FallbackFactory<LoginService> {
        @Override
        public LoginService create(Throwable throwable) {
            log.error("接口调用错误:{}", throwable.getMessage());

            return new LoginService() {
                @Override
                public String senderCode(String phone) {
                    return "000000";
                }

                @Override
                public boolean checkCode(String phone, String code) {
                    return false;
                }
            };
        }
    }
}
