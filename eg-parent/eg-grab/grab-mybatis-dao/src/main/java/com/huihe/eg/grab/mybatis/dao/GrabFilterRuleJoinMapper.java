package com.huihe.eg.grab.mybatis.dao;

import com.cy.framework.mybaties.dao.BaseFrameworkMapper;
import com.huihe.eg.grab.model.GrabFilterRuleJoinEntity;

public interface GrabFilterRuleJoinMapper extends BaseFrameworkMapper<GrabFilterRuleJoinEntity, Long> {
    /**
     *
     * @mbggenerated 2019-02-15
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-02-15
     */
    int insert(GrabFilterRuleJoinEntity record);

    /**
     *
     * @mbggenerated 2019-02-15
     */
    int insertSelective(GrabFilterRuleJoinEntity record);

    /**
     *
     * @mbggenerated 2019-02-15
     */
    GrabFilterRuleJoinEntity selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-02-15
     */
    int updateByPrimaryKeySelective(GrabFilterRuleJoinEntity record);

    /**
     *
     * @mbggenerated 2019-02-15
     */
    int updateByPrimaryKey(GrabFilterRuleJoinEntity record);
}