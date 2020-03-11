package com.huihe.eg.authorization.mybatis.dao;

import com.cy.framework.mybaties.dao.BaseFrameworkMapper;
import com.huihe.eg.authorization.model.ApiUrlEntity;

public interface ApiUrlMapper extends BaseFrameworkMapper<ApiUrlEntity, Long> {
    /**
     *
     * @mbggenerated 2019-01-05
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int insert(ApiUrlEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int insertSelective(ApiUrlEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    ApiUrlEntity selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int updateByPrimaryKeySelective(ApiUrlEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int updateByPrimaryKey(ApiUrlEntity record);
}