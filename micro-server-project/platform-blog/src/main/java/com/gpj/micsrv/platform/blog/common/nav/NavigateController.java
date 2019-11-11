package com.gpj.micsrv.platform.blog.common.nav;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @className NavigateController
 * @description 导航
 * @author GPJ
 * @date 2019/8/20 16:13
 * @version 1.0
 **/
@ApiIgnore
@Controller
public class NavigateController {

    @RequestMapping("/")
    public String swagger(){
        return "redirect:/swagger-ui.html";
    }

}
