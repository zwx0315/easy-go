package com.huihe.eg.authorization.service.impl;

import com.cy.framework.service.impl.BaseFrameworkServiceImpl;
import com.huihe.eg.authorization.model.LogEntity;
import com.huihe.eg.authorization.mybatis.dao.LogMapper;
import com.huihe.eg.authorization.service.dao.LogService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl extends BaseFrameworkServiceImpl<LogEntity, Long> implements LogService {

    @Resource
    private LogMapper mapper;
    public void init() {
        setMapper(mapper);
    }
}