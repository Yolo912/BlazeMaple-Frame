package com.blazemaple.config;

import com.blazemaple.trace.TraceIdFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author 912
 * @description Filter过滤器配置
 * @date 2023/4/3 14:02
 */
@Configuration
public class FilterConfig {
    @Resource
    private TraceIdFilter traceIdFilter;

    @Bean
    public FilterRegistrationBean registerTraceFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(traceIdFilter);
        registration.addUrlPatterns("/*");
        registration.setName("traceIdFilter");
        registration.setOrder(1);
        return registration;
    }
}
