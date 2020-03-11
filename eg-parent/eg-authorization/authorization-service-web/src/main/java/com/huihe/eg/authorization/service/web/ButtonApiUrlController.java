package com.huihe.eg.authorization.service.web;

import com.cy.framework.service.web.BaseFrameworkController;
import com.huihe.eg.authorization.model.ButtonApiUrlEntity;
import com.huihe.eg.authorization.service.dao.ButtonApiUrlService;
import io.swagger.annotations.Api;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value="按钮的api可用接口说明",description="按钮的api可用接口说明",tags = {"按钮的api"})
@RestController
@RequestMapping("buttonApiUrl")
public class ButtonApiUrlController extends BaseFrameworkController<ButtonApiUrlEntity, Long> {

    @Resource
    private ButtonApiUrlService service;
    @Override
    public void init() {
        setBaseService(service);
    }
}