package com.huihe.eg.authorization.service.impl;

import com.cy.framework.service.impl.BaseFrameworkServiceImpl;
import com.huihe.eg.authorization.model.MenuApiUrlEntity;
import com.huihe.eg.authorization.mybatis.dao.MenuApiUrlMapper;
import com.huihe.eg.authorization.service.dao.MenuApiUrlService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class MenuApiUrlServiceImpl extends BaseFrameworkServiceImpl<MenuApiUrlEntity, Long> implements MenuApiUrlService {

    @Resource
    private MenuApiUrlMapper mapper;
    public void init() {
        setMapper(mapper);
    }
}