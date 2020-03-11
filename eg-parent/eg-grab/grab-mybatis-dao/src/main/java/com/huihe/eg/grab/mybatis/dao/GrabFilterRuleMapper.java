package com.huihe.eg.grab.mybatis.dao;

import com.cy.framework.mybaties.dao.BaseFrameworkMapper;
import com.huihe.eg.grab.model.GrabFilterRuleEntity;

public interface GrabFilterRuleMapper extends BaseFrameworkMapper<GrabFilterRuleEntity, Long> {
    /**
     *
     * @mbggenerated 2019-02-15
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-02-15
     */
    int insert(GrabFilterRuleEntity record);

    /**
     *
     * @mbggenerated 2019-02-15
     */
    int insertSelective(GrabFilterRuleEntity record);

    /**
     *
     * @mbggenerated 2019-02-15
     */
    GrabFilterRuleEntity selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-02-15
     */
    int updateByPrimaryKeySelective(GrabFilterRuleEntity record);

    /**
     *
     * @mbggenerated 2019-02-15
     */
    int updateByPrimaryKey(GrabFilterRuleEntity record);
}