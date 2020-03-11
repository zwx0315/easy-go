package com.huihe.eg.authorization.service.web;

import com.cy.framework.service.web.BaseFrameworkController;
import com.huihe.eg.authorization.model.MenuApiUrlEntity;
import com.huihe.eg.authorization.service.dao.MenuApiUrlService;
import io.swagger.annotations.Api;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value="按钮拥有的api可用接口说明",description="按钮拥有的api可用接口说明",tags = {"按钮拥有的api"})
@RestController
@RequestMapping("menuApiUrl")
public class MenuApiUrlController extends BaseFrameworkController<MenuApiUrlEntity, Long> {

    @Resource
    private MenuApiUrlService service;
    @Override
    public void init() {
        setBaseService(service);
    }
}