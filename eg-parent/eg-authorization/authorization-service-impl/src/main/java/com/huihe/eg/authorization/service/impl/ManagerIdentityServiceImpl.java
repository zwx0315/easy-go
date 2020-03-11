package com.huihe.eg.authorization.service.impl;

import com.cy.framework.service.impl.BaseFrameworkServiceImpl;
import com.huihe.eg.authorization.model.ManagerIdentityEntity;
import com.huihe.eg.authorization.model.ManagerUserEntity;
import com.huihe.eg.authorization.mybatis.dao.ManagerIdentityMapper;
import com.huihe.eg.authorization.service.dao.ManagerIdentityService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huihe.eg.authorization.service.dao.ManagerUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerIdentityServiceImpl extends BaseFrameworkServiceImpl<ManagerIdentityEntity, Long> implements ManagerIdentityService {

    @Resource
    private ManagerIdentityMapper mapper;
    @Resource
    private ManagerUserService managerUserService;
    public void init() {
        setMapper(mapper);
    }
    public List<ManagerIdentityEntity> queryRoleList(ManagerIdentityEntity param, HttpServletRequest request, HttpServletResponse response){
        List<ManagerIdentityEntity> managerUserEntities=null;
        try {
            managerUserEntities=mapper.query(param);
            for (ManagerIdentityEntity managerIdentityEntity: managerUserEntities){
                ManagerUserEntity managerUserEntity=new ManagerUserEntity();
                managerUserEntity.setType(managerIdentityEntity.getType());
                Integer integer=managerUserService.queryListPageCount(managerUserEntity,request,response);
                managerIdentityEntity.setNumber_people(integer);
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("ManagerUserServiceImpl   queryRoleList");
        }
        return managerUserEntities;
    }
}