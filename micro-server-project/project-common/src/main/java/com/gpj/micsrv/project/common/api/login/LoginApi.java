package com.gpj.micsrv.project.common.api.login;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "登录接口", tags = "登录接口", authorizations = @Authorization("gpj"), consumes = "123")
@RequestMapping("/api/login")
public interface LoginApi {
    /**
     * 发送验证码
     * @param phone 手机号
     * @return
     */
    @ApiOperation(value="发送验证码", notes="发送验证码到入参手机号中")
    @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "String", paramType = "path")
    @RequestMapping(value = "/sndercode/{phone}", method = RequestMethod.POST)
    public String senderCode(@PathVariable("phone") String phone);

    /**
     * 校验验证码
     * @param phone 手机号
     * @param code 验证码
     */
    @ApiOperation(value="验证码校验", notes="根据传入的手机号与验证码,验证传入的验证码是否正确")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "String", paramType = "path"),
            @ApiImplicitParam(name = "code", value = "验证码", required = true, dataType = "String", paramType = "path")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = boolean.class),
            @ApiResponse(code = 500, message = "校验失败")
    })
    @RequestMapping(value = "/checkcode/{phone}/{code}", method = RequestMethod.POST)
    public boolean checkCode(@PathVariable("phone") String phone, @PathVariable("code") String code);
}