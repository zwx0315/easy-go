package com.huihe.eg.authorization.mybatis.dao;

import com.cy.framework.mybaties.dao.BaseFrameworkMapper;
import com.huihe.eg.authorization.model.MenuApiUrlEntity;

public interface MenuApiUrlMapper extends BaseFrameworkMapper<MenuApiUrlEntity, Long> {
    /**
     *
     * @mbggenerated 2019-01-05
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int insert(MenuApiUrlEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int insertSelective(MenuApiUrlEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    MenuApiUrlEntity selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int updateByPrimaryKeySelective(MenuApiUrlEntity record);

    /**
     *
     * @mbggenerated 2019-01-05
     */
    int updateByPrimaryKey(MenuApiUrlEntity record);
}