package com.gpj.micsrv.platform.blog.api.login;

import com.gpj.micsrv.project.common.api.login.LoginApi;
import org.springframework.stereotype.Controller;

/**
 * @className LoginApiDocument
 * @description 登录接口文档
 * @author GPJ
 * @date 2019/8/26 17:12
 * @version 1.0
 **/
@Controller
public class LoginApiDocument implements LoginApi {
    @Override
    public String senderCode(String phone) {
        return null;
    }

    @Override
    public boolean checkCode(String phone, String code) {
        return false;
    }
}
