package com.huihe.eg.authorization.mybatis.dao;

import com.cy.framework.mybaties.dao.BaseFrameworkMapper;
import com.huihe.eg.authorization.model.ButtonApiUrlEntity;

public interface ButtonApiUrlMapper extends BaseFrameworkMapper<ButtonApiUrlEntity, Long> {
    /**
     *
     * @mbggenerated 2019-01-05
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int insert(ButtonApiUrlEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int insertSelective(ButtonApiUrlEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    ButtonApiUrlEntity selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int updateByPrimaryKeySelective(ButtonApiUrlEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int updateByPrimaryKey(ButtonApiUrlEntity record);
}