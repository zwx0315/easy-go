package com.huihe.eg.authorization.service.impl;

import com.cy.framework.service.impl.BaseFrameworkServiceImpl;
import com.huihe.eg.authorization.model.ButtonApiUrlEntity;
import com.huihe.eg.authorization.mybatis.dao.ButtonApiUrlMapper;
import com.huihe.eg.authorization.service.dao.ButtonApiUrlService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ButtonApiUrlServiceImpl extends BaseFrameworkServiceImpl<ButtonApiUrlEntity, Long> implements ButtonApiUrlService {

    @Resource
    private ButtonApiUrlMapper mapper;
    public void init() {
        setMapper(mapper);
    }
}