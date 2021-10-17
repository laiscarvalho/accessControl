package com.dio.accesscontrol.swagger;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/**"))
                .build()
                .apiInfo(ApiInfo())
                .globalOperationParameters(
                        Collections.singletonList(
                                new ParameterBuilder()
                                        .name("Authorization")
                                        .description("Header para token JWT")
                                        .modelRef(new ModelRef("string"))
                                        .parameterType("header")
                                        .required(false)
                                        .build()));
    }



@Bean
public springfox.documentation.service.ApiInfo ApiInfo(){
    return new ApiInfoBuilder()
        .title("API-REST")
        .description("Api_for_access_control")
            .version("1.0.0")
            .license("Apache license Version 2.0")
            .licenseUrl("https://www.apache.org/license/LICENSE=2.0")
            .build();
}
}
