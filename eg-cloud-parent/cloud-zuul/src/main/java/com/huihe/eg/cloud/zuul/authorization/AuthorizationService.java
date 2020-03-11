package com.huihe.eg.cloud.zuul.authorization;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name = "eg-authorization")
public interface AuthorizationService {
    /**
     * 检测授权认证
     *
     * @param url
     * @param method
     * @param token
     * @return
     */
    @RequestMapping(value = "/apiUrl/authorization", method = RequestMethod.GET)
    Map<String, Object> authorization(@RequestParam(value = "url") String url, @RequestParam("method") String method, @RequestParam("token") String token);
}
