package com.blazemaple.trace;

import org.slf4j.MDC;

import java.util.UUID;

/**
 * @author 912
 * @description TraceId上下文
 * @date 2023/4/3 14:03
 */
public class TraceIdContext {

    public static final ThreadLocal<String> CURRENT_TRACE_ID = new InheritableThreadLocal<>();

    public static String generateTraceId() {
        return UUID.randomUUID().toString();
    }

    public static String getTraceId() {
        return MDC.get(TraceIdConstant.TRACE_ID);
    }

    public static void setTraceId(String traceId) {
        MDC.put(TraceIdConstant.TRACE_ID, traceId);
    }

    public static void clearTraceId() {
        CURRENT_TRACE_ID.set(null);
        CURRENT_TRACE_ID.remove();
    }

}
