package com.blazemaple.swagger.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 912
 * @description
 * @date 2023/4/2 16:25
 */

@ConfigurationProperties(prefix = "swagger")
@Data
@Component
public class SwaggerInfo {
    private String basePackage;

    private String title;

    private String contactName;

    private String contactUrl;

    private String email;

    private String version;

    private String description;

}
