package com.huihe.eg.authorization.service.web;

import com.cy.framework.service.web.BaseFrameworkController;
import com.huihe.eg.authorization.model.LogEntity;
import com.huihe.eg.authorization.service.dao.LogService;
import io.swagger.annotations.Api;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value="操作的日志可用接口说明",description="操作的日志可用接口说明",tags = {"操作的日志"})
@RestController
@RequestMapping("log")
public class LogController extends BaseFrameworkController<LogEntity, Long> {

    @Resource
    private LogService service;
    @Override
    public void init() {
        setBaseService(service);
    }
}