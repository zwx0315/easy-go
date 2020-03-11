package com.huihe.eg.authorization.mybatis.dao;

import com.cy.framework.mybaties.dao.BaseFrameworkMapper;
import com.huihe.eg.authorization.model.ButtonEntity;

public interface ButtonMapper extends BaseFrameworkMapper<ButtonEntity, Long> {
    /**
     *
     * @mbggenerated 2019-01-05
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int insert(ButtonEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int insertSelective(ButtonEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    ButtonEntity selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int updateByPrimaryKeySelective(ButtonEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int updateByPrimaryKey(ButtonEntity record);
}