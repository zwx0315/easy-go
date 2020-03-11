package com.huihe.eg.authorization.service.dao;

import com.cy.framework.service.dao.BaseFrameworkService;
import com.cy.framework.util.result.ResultParam;
import com.huihe.eg.authorization.model.ManagerUserEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface ManagerUserService extends BaseFrameworkService<ManagerUserEntity, Long> {
    String queryManager(Long id);
}