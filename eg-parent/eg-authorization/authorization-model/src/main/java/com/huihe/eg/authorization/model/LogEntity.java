package com.huihe.eg.authorization.model;

import com.cy.framework.model.PageInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@ApiModel(value="操作的日志",description="操作的日志属性说明")
public class LogEntity extends PageInfo {
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
     * 内容
     */
    @ApiModelProperty(value="内容")
    private String descr;

    /**
     * 操作的用户
     */
    @ApiModelProperty(value="操作的用户",example="1")
    private Long user_id;

    /**
     * 操作的菜单ID
     */
    @ApiModelProperty(value="操作的菜单ID",example="1")
    private Long menu_id;

    /**
     * 操作的按钮ID
     */
    @ApiModelProperty(value="操作的按钮ID",example="1")
    private Long button_id;

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
     * 内容
     * @return descr 内容
     */
    public String getDescr() {
        return descr;
    }

    /**
     * 内容
     * @param descr 内容
     */
    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    /**
     * 操作的用户
     * @return user_id 操作的用户
     */
    public Long getUser_id() {
        return user_id;
    }

    /**
     * 操作的用户
     * @param user_id 操作的用户
     */
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    /**
     * 操作的菜单ID
     * @return menu_id 操作的菜单ID
     */
    public Long getMenu_id() {
        return menu_id;
    }

    /**
     * 操作的菜单ID
     * @param menu_id 操作的菜单ID
     */
    public void setMenu_id(Long menu_id) {
        this.menu_id = menu_id;
    }

    /**
     * 操作的按钮ID
     * @return button_id 操作的按钮ID
     */
    public Long getButton_id() {
        return button_id;
    }

    /**
     * 操作的按钮ID
     * @param button_id 操作的按钮ID
     */
    public void setButton_id(Long button_id) {
        this.button_id = button_id;
    }
}