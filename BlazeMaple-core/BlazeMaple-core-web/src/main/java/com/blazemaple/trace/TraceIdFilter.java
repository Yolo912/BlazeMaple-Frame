package com.blazemaple.trace;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author 912
 * @description 链路追踪过滤器
 * @date 2023/4/3 14:04
 */
@Component
@Slf4j
public class TraceIdFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain)
        throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        String traceId = request.getHeader(TraceIdConstant.TRACE_ID);
        if (StringUtils.isBlank(traceId)) {
            traceId = TraceIdContext.generateTraceId();
        }
        TraceIdContext.setTraceId(traceId);
        filterChain.doFilter(request, resp);
        TraceIdContext.clearTraceId();
    }
}
