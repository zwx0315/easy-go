package com.huihe.eg.authorization.mybatis.dao;

import com.cy.framework.mybaties.dao.BaseFrameworkMapper;
import com.huihe.eg.authorization.model.UserButtonEntity;

public interface UserButtonMapper extends BaseFrameworkMapper<UserButtonEntity, Long> {
    /**
     *
     * @mbggenerated 2019-01-05
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int insert(UserButtonEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int insertSelective(UserButtonEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    UserButtonEntity selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int updateByPrimaryKeySelective(UserButtonEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int updateByPrimaryKey(UserButtonEntity record);
}