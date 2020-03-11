package com.huihe.eg.authorization.model;

import com.cy.framework.model.PageInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@ApiModel(value="菜单信息",description="菜单信息属性说明")
public class MenuEntity extends PageInfo {
    /**
     * id 唯一
     */
    @ApiModelProperty(value="id 唯一",example="1")
    private Long id;

    /**
     * 名称
     */
    @ApiModelProperty(value="名称")
    private String name;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间")
    private Date create_time;

    /**
     * 更新的时间
     */
    @ApiModelProperty(value="更新的时间")
    private Date update_time;

    /**
     * 内容描述
     */
    @ApiModelProperty(value="内容描述")
    private String descr;

    /**
     * 添加的用户
     */
    @ApiModelProperty(value="添加的用户")
    private String add_user;

    /**
     * 修改的用户
     */
    @ApiModelProperty(value="修改的用户")
    private String update_user;

    /**
     * 上一级的ID
     */
    @ApiModelProperty(value="上一级的ID",example="1")
    private Long parent_id;

    /**
     * 排序 越小越靠前
     */
    @ApiModelProperty(value="排序 越小越靠前",example="1")
    private Integer seq;

    /**
     * id 唯一
     * @return id id 唯一
     */
    public Long getId() {
        return id;
    }

    /**
     * id 唯一
     * @param id id 唯一
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 名称
     * @return name 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     * 创建时间
     * @param create_time 创建时间
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * 更新的时间
     * @return update_time 更新的时间
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     * 更新的时间
     * @param update_time 更新的时间
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     * 内容描述
     * @return descr 内容描述
     */
    public String getDescr() {
        return descr;
    }

    /**
     * 内容描述
     * @param descr 内容描述
     */
    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    /**
     * 添加的用户
     * @return add_user 添加的用户
     */
    public String getAdd_user() {
        return add_user;
    }

    /**
     * 添加的用户
     * @param add_user 添加的用户
     */
    public void setAdd_user(String add_user) {
        this.add_user = add_user == null ? null : add_user.trim();
    }

    /**
     * 修改的用户
     * @return update_user 修改的用户
     */
    public String getUpdate_user() {
        return update_user;
    }

    /**
     * 修改的用户
     * @param update_user 修改的用户
     */
    public void setUpdate_user(String update_user) {
        this.update_user = update_user == null ? null : update_user.trim();
    }

    /**
     * 上一级的ID
     * @return parent_id 上一级的ID
     */
    public Long getParent_id() {
        return parent_id;
    }

    /**
     * 上一级的ID
     * @param parent_id 上一级的ID
     */
    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }

    /**
     * 排序 越小越靠前
     * @return seq 排序 越小越靠前
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * 排序 越小越靠前
     * @param seq 排序 越小越靠前
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }
}