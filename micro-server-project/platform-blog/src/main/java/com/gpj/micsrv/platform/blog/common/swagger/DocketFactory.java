package com.gpj.micsrv.platform.blog.common.swagger;

import lombok.AllArgsConstructor;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @className DocketUtil
 * @description TODO
 * @author GPJ
 * @date 2019/8/26 18:00
 * @version 1.0
 **/
@AllArgsConstructor
public class DocketFactory {
    private String gatewayUrl;

    public Docket createSTDDocket(String showName, String groupName, String registerName, String packageName, String path){
        return createDocket(showName, groupName, registerName, packageName, path, true);
    }

    public Docket createSTDDocket(String showName, String groupName, String registerName){
        return createSTDDocket(showName, groupName, registerName, "*." + groupName, "/**/" + groupName + "/**");
    }

    public Docket createINDVDocket(String showName, String groupName, String registerName, String packageName, String path){
        return createDocket(showName, groupName, registerName, packageName, path, false);
    }

    public Docket createIndividualDocket(String showName, String groupName, String registerName){
        return createSTDDocket(showName, groupName, registerName, "*." + groupName, "/**/" + groupName + "/**");
    }

    private Docket createDocket(String showName, String groupName, String registerName, String packageName, String path, boolean std) {
        return new Docket(DocumentationType.SWAGGER_2)
                .host(gatewayUrl + "/" + registerName)
                .groupName("std-" + groupName)
                .apiInfo(apiInfoBuild(showName, std))
                .select()
                .apis(RequestHandlerSelectors.basePackage(packageName.replace("*", "com.founder.xy.blog.api")))
                .paths(PathSelectors.ant(path))
                .build();
    }

    private ApiInfo apiInfoBuild(String showName, boolean std){
        return new ApiInfoBuilder()
            .title("翔宇API接口文档--" + showName + (std?"[STD]":"[INDV]"))
            .description("翔宇" + (std?"标准版":"个性化版") + showName + "的API接口文档")
            .version("v6.0")
            .build();
    }
}