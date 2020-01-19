package com.imooc.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {

    // http://localhost:8088/swagger-ui.html 原路径
    // http://localhost:8088/doc.html 优化路径
    // 配置swagger2 核心配置 docket
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2) // 指定api 类型为 swagger2
        .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.imooc.controller"))
                .paths(PathSelectors.any())
                .build();

    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("天天吃货电商平台接口 api")
                .contact(new Contact("com/imooc","https://www.imooc.com","sdfwevw@153.com"))
                .description("api 文档")
                .version("1.0.1")
                .termsOfServiceUrl("www.immoc.com")
                .build();
    }
}
