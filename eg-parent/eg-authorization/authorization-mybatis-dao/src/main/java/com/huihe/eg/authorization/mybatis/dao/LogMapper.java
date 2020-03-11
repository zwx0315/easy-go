package com.huihe.eg.authorization.mybatis.dao;

import com.cy.framework.mybaties.dao.BaseFrameworkMapper;
import com.huihe.eg.authorization.model.LogEntity;

public interface LogMapper extends BaseFrameworkMapper<LogEntity, Long> {
    /**
     *
     * @mbggenerated 2019-01-05
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int insert(LogEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int insertSelective(LogEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    LogEntity selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int updateByPrimaryKeySelective(LogEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int updateByPrimaryKey(LogEntity record);
}