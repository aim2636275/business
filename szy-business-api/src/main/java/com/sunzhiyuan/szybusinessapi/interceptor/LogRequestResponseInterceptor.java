//package com.sunzhiyuan.szybusinessapi.interceptor;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.ThreadContext;
//import org.springframework.util.StringUtils;
//import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.text.SimpleDateFormat;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * Created by sunzhiyuan on 2019/6/5.
// */
//public class LogRequestResponseInterceptor extends HandlerInterceptorAdapter {
//    protected Logger logger = LogManager.getLogger(getClass());
//    private static final ObjectMapper objectMapper = new ObjectMapper();
//
//    static {
//        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
//    }
//
//    @Override public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
//        Object handler) throws Exception {
//        try {
//            ThreadContext.put("userInfo",SecurityContextHolder.getContext().getAuthentication().getName());
//        } catch (Exception e) {}
//        SecurityContextHolder.getContext().getAuthentication();
//        try {
//            String requestURI = request.getRequestURI();
//            if (!StringUtils.isEmpty(requestURI)) {
//                long beginTime = System.currentTimeMillis();
//                request.setAttribute("beginTime", beginTime);
//                Map<String, Object> paramMap = new HashMap<>();
//                String realIP = getIpAddr(request);
//                paramMap.put("ip",realIP);
//                paramMap.putAll(request.getParameterMap());
//                logger.info("requestParam:{}",JSON.toJSONString(paramMap));
//            }
//
//        } catch (Exception e) {
//            logger.error(e);
//        }
//        return true;
//    }
//
//    @Override public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
//        Object handler, Exception ex) throws Exception {
//        ThreadContext.remove("userInfo");
//    }
//
//    /**
//     * 将参数值中的“[]”进行转义
//     *
//     * @param value
//     * @return
//     */
//    public static String escape(String value) {
//        if (!StringUtils.isEmpty(value)) {
//            return value.replace("[", "\\[").replace("]", "\\]");
//        }
//        return "";
//
//    }
//    public static String getIpAddr(HttpServletRequest request) {
//        String ip = request.getHeader("X-Forwarded-For");
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("Proxy-Client-IP");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("WL-Proxy-Client-IP");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("HTTP_CLIENT_IP");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getRemoteAddr();
//        }
//        return ip;
//    }
//}
