package com.huihe.eg.grab.mybatis.dao;

import com.cy.framework.mybaties.dao.BaseFrameworkMapper;
import com.huihe.eg.grab.model.GrabTaskEntity;

public interface GrabTaskMapper extends BaseFrameworkMapper<GrabTaskEntity, Long> {
    /**
     *
     * @mbggenerated 2019-02-15
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-02-15
     */
    int insert(GrabTaskEntity record);

    /**
     *
     * @mbggenerated 2019-02-15
     */
    int insertSelective(GrabTaskEntity record);

    /**
     *
     * @mbggenerated 2019-02-15
     */
    GrabTaskEntity selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-02-15
     */
    int updateByPrimaryKeySelective(GrabTaskEntity record);

    /**
     *
     * @mbggenerated 2019-02-15
     */
    int updateByPrimaryKey(GrabTaskEntity record);
}