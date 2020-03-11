package com.huihe.eg.authorization.service.web;

import com.cy.framework.service.web.BaseFrameworkController;
import com.huihe.eg.authorization.model.MenuEntity;
import com.huihe.eg.authorization.service.dao.MenuService;
import io.swagger.annotations.Api;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value="菜单信息可用接口说明",description="菜单信息可用接口说明",tags = {"菜单信息"})
@RestController
@RequestMapping("menu")
public class MenuController extends BaseFrameworkController<MenuEntity, Long> {

    @Resource
    private MenuService service;
    @Override
    public void init() {
        setBaseService(service);
    }
}