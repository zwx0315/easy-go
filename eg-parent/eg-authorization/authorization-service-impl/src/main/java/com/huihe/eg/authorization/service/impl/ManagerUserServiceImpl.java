package com.huihe.eg.authorization.service.impl;

import com.cy.framework.service.impl.BaseFrameworkServiceImpl;
import com.cy.framework.util.json.JSONUtils;
import com.huihe.eg.authorization.model.ManagerUserEntity;
import com.huihe.eg.authorization.mybatis.dao.ManagerUserMapper;
import com.huihe.eg.authorization.service.dao.ManagerUserService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ManagerUserServiceImpl extends BaseFrameworkServiceImpl<ManagerUserEntity, Long> implements ManagerUserService {

    @Resource
    private ManagerUserMapper mapper;
    public void init() {
        setMapper(mapper);
    }
    //查询管理员信息
    public String queryManager(Long id) {
        ManagerUserEntity managerUserEntity=mapper.selectByPrimaryKey(id);
        return JSONUtils.obj2Json(managerUserEntity).toString();
    }

}