package com.huihe.eg.authorization.mybatis.dao;

import com.cy.framework.mybaties.dao.BaseFrameworkMapper;
import com.huihe.eg.authorization.model.ManagerUserEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManagerUserMapper extends BaseFrameworkMapper<ManagerUserEntity, Long> {
    /**
     *
     * @mbggenerated 2019-01-05
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int insert(ManagerUserEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int insertSelective(ManagerUserEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    ManagerUserEntity selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int updateByPrimaryKeySelective(ManagerUserEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int updateByPrimaryKey(ManagerUserEntity record);

}