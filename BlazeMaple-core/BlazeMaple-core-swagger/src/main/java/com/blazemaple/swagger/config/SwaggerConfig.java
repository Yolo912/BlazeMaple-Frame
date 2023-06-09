package com.blazemaple.swagger.config;

import com.blazemaple.swagger.bean.SwaggerInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;

/**
 * @author 912
 * @description
 * @date 2023/4/2 16:27
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Resource
    private SwaggerInfo swaggerInfo;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage(swaggerInfo.getBasePackage()))
            .paths(PathSelectors.any())
            .build();
    }

    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title(swaggerInfo.getTitle())
            .contact(new Contact(swaggerInfo.getContactName(),
                swaggerInfo.getContactUrl(),
                swaggerInfo.getEmail()))
            .version(swaggerInfo.getVersion())
            .description(swaggerInfo.getDescription())
            .build();
    }
}
