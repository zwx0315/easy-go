package com.huihe.eg.cloud.zuul;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.huihe.eg.cloud.zuul.authorization.AuthorizationService;
import com.huihe.eg.cloud.zuul.redis.RedisService;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;

import org.apache.commons.lang.StringUtils;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yangchengfu
 * @Description: zuul 的过滤器
 * @Date : 2017/7/27 14:35
 */
public class MyFilter extends ZuulFilter {

    private Logger log = LoggerFactory.getLogger(MyFilter.class);
    @Resource
    private AuthorizationService authorizationService;
    @Resource
    private RedisService redisService;


    /**
     * @Description: 过滤的类型
     * @author yangchengfu
     * @Date : 2017/7/27 14:37
     */
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * @Description: 是否过滤
     * @author yangchengfu
     * @Date : 2017/7/27 14:39
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * @Description: 过滤的逻辑
     * @author yangchengfu
     * @Date : 2017/7/27 14:39
     */
    @Override
    @CrossOrigin
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        HttpServletResponse response = ctx.getResponse();
        /*String body = null;
        try {
            InputStream in = ctx.getRequest().getInputStream();
            body = StreamUtils.copyToString(in, Charset.forName("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("body:" + body);*/
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object access_token = request.getParameter("token");
        if (access_token == null) {
            access_token = request.getHeader("token");
        }
        //此处判断是否要拦截**************
        //过滤登录方法
        if(request.getRequestURI().contains("/eg-api/user/user/login")){
            return null;
        }

        Object token=null;
        if(access_token!=null&&!access_token.equals("")){
            //获取redis存储的token
            if (redisService.exists(access_token.toString())){
                token=redisService.get(access_token.toString());
                if(token!=null){
                    redisService.set(access_token.toString(),token,15552000L);
                }
            }else{
                ctx.setSendZuulResponse(false);
                ctx.setResponseStatusCode(401);
                ctx.setResponseBody("{\"code\":401,\"message\":\"没有访问权限！\",\"data\":null}");
                ctx.getResponse().setContentType("text/html;charset=UTF-8");
            }
        }else{
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            ctx.setResponseBody("{\"code\":401,\"message\":\"没有访问权限！\",\"data\":null}");
            ctx.getResponse().setContentType("text/html;charset=UTF-8");
        }

        Map<String, Object> object = authorizationService.authorization(request.getRequestURI(), request.getMethod(), (String) access_token);
        System.out.println(JSONObject.toJSONString(object));
        if (object == null || !object.get("code").toString().equals("0")) {
            log.warn("author result is not success:" + JSONObject.toJSONString(object));
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(200);
            try {
                response.setCharacterEncoding("UTF-8");
                response.setContentType("application/json;UTF-8");
                object.put("url", request.getRequestURI());
                response.getWriter().write(JSONObject.toJSONString(object));
            } catch (Exception e) {
                log.error(e.getMessage(), e);
            }
        }
        return null;
    }

}
