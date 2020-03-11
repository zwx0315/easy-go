package com.huihe.eg.authorization.service.dao;

import com.cy.framework.service.dao.BaseFrameworkService;
import com.huihe.eg.authorization.model.ApiUrlEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ApiUrlService extends BaseFrameworkService<ApiUrlEntity, Long> {
    Object authorization(ApiUrlEntity entity, String account, String pwd, HttpServletRequest request, HttpServletResponse response);
}