package com.huihe.eg.authorization.model;

import com.cy.framework.model.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@ApiModel(value="",description="属性说明")
public class ManagerIdentityEntity extends PageInfo {
    /**
     * 
     */
    @ApiModelProperty(value="",example="1")
    private Long id;

    /**
     * 类型 admin系统管理员 business商务中心  service客服 merchants招商  audit审核招商 agent代理商
     */
    @ApiModelProperty(value="类型 admin系统管理员 business商务中心  service客服 merchants招商  audit审核招商 agent代理商")
    private String type;

    /**
     * type admin系统管理员 business商务中心  service客服 merchants招商  audit审核招商 agent代理商
     */
    @ApiModelProperty(value="type admin系统管理员 business商务中心  service客服 merchants招商  audit审核招商 agent代理商")
    private String short_name;

    /**
     * 更新的时间
     */
    @ApiModelProperty(value="更新的时间")
    private Date update_time;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间")
    private Date create_time;

    /**
     * 编号
     */
    @ApiModelProperty(value="编号")
    private String serial_number;

    /**
     * 排序
     */
    @ApiModelProperty(value="排序",example="1")
    private Integer sort;

    @ApiModelProperty(value = "人数",example = "1")
    private Integer number_people;

    public Integer getNumber_people() {
        return number_people;
    }

    public void setNumber_people(Integer number_people) {
        this.number_people = number_people;
    }

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 类型 admin系统管理员 business商务中心  service客服 merchants招商  audit审核招商 agent代理商
     * @return type 类型 admin系统管理员 business商务中心  service客服 merchants招商  audit审核招商 agent代理商
     */
    public String getType() {
        return type;
    }

    /**
     * 类型 admin系统管理员 business商务中心  service客服 merchants招商  audit审核招商 agent代理商
     * @param type 类型 admin系统管理员 business商务中心  service客服 merchants招商  audit审核招商 agent代理商
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * type admin系统管理员 business商务中心  service客服 merchants招商  audit审核招商 agent代理商
     * @return short_name type admin系统管理员 business商务中心  service客服 merchants招商  audit审核招商 agent代理商
     */
    public String getShort_name() {
        return short_name;
    }

    /**
     * type admin系统管理员 business商务中心  service客服 merchants招商  audit审核招商 agent代理商
     * @param short_name type admin系统管理员 business商务中心  service客服 merchants招商  audit审核招商 agent代理商
     */
    public void setShort_name(String short_name) {
        this.short_name = short_name == null ? null : short_name.trim();
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
     * 编号
     * @return serial_number 编号
     */
    public String getSerial_number() {
        return serial_number;
    }

    /**
     * 编号
     * @param serial_number 编号
     */
    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number == null ? null : serial_number.trim();
    }

    /**
     * 排序
     * @return sort 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}