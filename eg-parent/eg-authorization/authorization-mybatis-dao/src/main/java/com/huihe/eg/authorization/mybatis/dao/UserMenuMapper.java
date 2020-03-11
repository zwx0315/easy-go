package com.huihe.eg.authorization.mybatis.dao;

import com.cy.framework.mybaties.dao.BaseFrameworkMapper;
import com.huihe.eg.authorization.model.UserMenuEntity;

public interface UserMenuMapper extends BaseFrameworkMapper<UserMenuEntity, Long> {
    /**
     *
     * @mbggenerated 2019-01-05
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int insert(UserMenuEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int insertSelective(UserMenuEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    UserMenuEntity selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int updateByPrimaryKeySelective(UserMenuEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int updateByPrimaryKey(UserMenuEntity record);
}