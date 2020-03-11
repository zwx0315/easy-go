package com.huihe.eg.authorization.service.impl;

import com.cy.framework.service.impl.BaseFrameworkServiceImpl;
import com.huihe.eg.authorization.model.MenuEntity;
import com.huihe.eg.authorization.mybatis.dao.MenuMapper;
import com.huihe.eg.authorization.service.dao.MenuService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl extends BaseFrameworkServiceImpl<MenuEntity, Long> implements MenuService {

    @Resource
    private MenuMapper mapper;
    public void init() {
        setMapper(mapper);
    }
}