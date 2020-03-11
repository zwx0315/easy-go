package com.huihe.eg.authorization.service.impl;

import com.cy.framework.service.dao.UserTokenService;
import com.cy.framework.service.impl.BaseFrameworkServiceImpl;
import com.cy.framework.service.impl.DataException;
import com.cy.framework.util.StringUtil;
import com.huihe.eg.authorization.model.ApiUrlEntity;
import com.huihe.eg.authorization.model.ManagerUserEntity;
import com.huihe.eg.authorization.mybatis.dao.ApiUrlMapper;
import com.huihe.eg.authorization.service.dao.ApiUrlService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huihe.eg.authorization.service.dao.ManagerUserService;
import com.huihe.eg.comm.AuthorizationEum;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Service
public class ApiUrlServiceImpl extends BaseFrameworkServiceImpl<ApiUrlEntity, Long> implements ApiUrlService {

    @Resource
    private ApiUrlMapper mapper;

    @Resource
    private UserTokenService userTokenService;
    @Resource
    private ManagerUserService managerUserService;
    public void init() {
        setMapper(mapper);
    }

    @Override
    public Object authorization(ApiUrlEntity entity, String account, String pwd, HttpServletRequest request, HttpServletResponse response) {
        List<ApiUrlEntity> list = mapper.query(entity);
//        if (list == null || list.size() <= 0) {
//            throw new DataException(AuthorizationEum.authorization_30001.getCode(), AuthorizationEum.authorization_30001.getDesc());
//        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        if (!list.get(0).getOpend()) {
            throw new DataException(AuthorizationEum.authorization_30000.getCode(), AuthorizationEum.authorization_30000.getDesc());
        }
        if (list.get(0).getAuthorize()) {
            if (StringUtil.isEmpty(entity.getToken())) {
                throw new DataException(AuthorizationEum.authorization_30002.getCode(), AuthorizationEum.authorization_30002.getDesc());
            }
            Map<String, Object> map = (Map<String, Object>) userTokenService.getUserInfo(entity.getToken());
            if (map == null) {
                throw new DataException(AuthorizationEum.authorization_30003.getCode(), AuthorizationEum.authorization_30003.getDesc());
            }
            entity.setUser_id((Long) map.get("id"));
//            List<ApiUrlEntity> list2 = queryMyApiUrlListPage(entity);
//            if (list2 == null || list2.size() <= 0) {
//                throw new DataException(AuthorizationEum.authorization_30004.getCode(), AuthorizationEum.authorization_30004.getDesc());
//            }
        }
        ManagerUserEntity managerUserEntity = null;
        //是否需要账号认证
        if (list.get(0).getAuthorize_account() != null && list.get(0).getAuthorize_account()) {
            if (StringUtil.isEmpty(account)) {
                throw new DataException(AuthorizationEum.authorization_300017.getCode(), AuthorizationEum.authorization_300017.getDesc());
            }
            if (StringUtil.isEmpty(pwd)) {
                throw new DataException(AuthorizationEum.authorization_300018.getCode(), AuthorizationEum.authorization_300018.getDesc());
            }
            managerUserEntity = new ManagerUserEntity();
            managerUserEntity.setMobile(account);
            managerUserEntity.setPwd(pwd);
            List<ManagerUserEntity> list1 = managerUserService.query(managerUserEntity, request, response);
            if (list1 == null || list1.size() <= 0) {
                throw new DataException(AuthorizationEum.authorization_300015.getCode(), AuthorizationEum.authorization_300015.getDesc());
            }
            if (!list1.get(0).getAvailable()) {
                throw new DataException(AuthorizationEum.authorization_300016.getCode(), AuthorizationEum.authorization_300016.getDesc());
            }
            managerUserEntity = list1.get(0);
            entity.setUser_id(managerUserEntity.getId());
        }
       /* if (list.get(0).getAmount().compareTo(BigDecimal.ZERO) == 1) {
            //扣费
            managerUserService.deductionFee(list.get(0).getAmount(), entity.getUser_id(), request, response);
        }*/
        return managerUserEntity;
    }
}