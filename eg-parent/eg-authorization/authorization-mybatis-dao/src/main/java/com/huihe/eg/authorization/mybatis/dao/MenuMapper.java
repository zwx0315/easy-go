package com.huihe.eg.authorization.mybatis.dao;

import com.cy.framework.mybaties.dao.BaseFrameworkMapper;
import com.huihe.eg.authorization.model.MenuEntity;

public interface MenuMapper extends BaseFrameworkMapper<MenuEntity, Long> {
    /**
     *
     * @mbggenerated 2019-01-05
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int insert(MenuEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int insertSelective(MenuEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    MenuEntity selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int updateByPrimaryKeySelective(MenuEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int updateByPrimaryKey(MenuEntity record);
}