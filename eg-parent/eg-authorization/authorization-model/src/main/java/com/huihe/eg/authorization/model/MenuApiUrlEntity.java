package com.huihe.eg.authorization.model;

import com.cy.framework.model.PageInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@ApiModel(value="按钮拥有的api",description="按钮拥有的api属性说明")
public class MenuApiUrlEntity extends PageInfo {
    /**
     * id 唯一
     */
    @ApiModelProperty(value="id 唯一",example="1")
    private Long id;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间")
    private Date create_time;

    /**
     * 添加的用户
     */
    @ApiModelProperty(value="添加的用户")
    private String add_user;

    /**
     * api的id
     */
    @ApiModelProperty(value="api的id",example="1")
    private Long api_id;

    /**
     * 菜单的id
     */
    @ApiModelProperty(value="菜单的id",example="1")
    private Long menu_id;

    /**
     * 修改的用户
     */
    @ApiModelProperty(value="修改的用户")
    private String update_user;

    /**
     * 修改的时间
     */
    @ApiModelProperty(value="修改的时间")
    private Date update_time;

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
     * api的id
     * @return api_id api的id
     */
    public Long getApi_id() {
        return api_id;
    }

    /**
     * api的id
     * @param api_id api的id
     */
    public void setApi_id(Long api_id) {
        this.api_id = api_id;
    }

    /**
     * 菜单的id
     * @return menu_id 菜单的id
     */
    public Long getMenu_id() {
        return menu_id;
    }

    /**
     * 菜单的id
     * @param menu_id 菜单的id
     */
    public void setMenu_id(Long menu_id) {
        this.menu_id = menu_id;
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
     * 修改的时间
     * @return update_time 修改的时间
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     * 修改的时间
     * @param update_time 修改的时间
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}