package com.huihe.eg.authorization.service.impl;

import com.cy.framework.service.impl.BaseFrameworkServiceImpl;
import com.huihe.eg.authorization.model.ButtonEntity;
import com.huihe.eg.authorization.mybatis.dao.ButtonMapper;
import com.huihe.eg.authorization.service.dao.ButtonService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ButtonServiceImpl extends BaseFrameworkServiceImpl<ButtonEntity, Long> implements ButtonService {

    @Resource
    private ButtonMapper mapper;
    public void init() {
        setMapper(mapper);
    }
}