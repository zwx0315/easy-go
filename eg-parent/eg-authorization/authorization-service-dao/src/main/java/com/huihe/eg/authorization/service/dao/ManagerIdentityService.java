package com.huihe.eg.authorization.service.dao;

import com.cy.framework.service.dao.BaseFrameworkService;
import com.huihe.eg.authorization.model.ManagerIdentityEntity;
import com.huihe.eg.authorization.model.ManagerUserEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface ManagerIdentityService extends BaseFrameworkService<ManagerIdentityEntity, Long> {
    List<ManagerIdentityEntity> queryRoleList(ManagerIdentityEntity param, HttpServletRequest request, HttpServletResponse response);
}