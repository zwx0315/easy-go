package com.huihe.eg.authorization.model;

import com.cy.framework.model.PageInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;

@ApiModel(value="后台接口api",description="后台接口api属性说明")
public class ApiUrlEntity extends PageInfo {
    /**
     * id 唯一
     */
    @ApiModelProperty(value="id 唯一",example="1")
    private Long id;

    /**
     * 路径 链接
     */
    @ApiModelProperty(value="路径 链接")
    private String url;

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
     * 是否需要授权
     */
    @ApiModelProperty(value="是否需要授权",example="false")
    private Boolean authorize;

    /**
     * 方法
     */
    @ApiModelProperty(value="方法")
    private String method;

    /**
     * 收费
     */
    @ApiModelProperty(value="收费",example="1")
    private BigDecimal amount;

    /**
     * 是否开放
     */
    @ApiModelProperty(value="是否开放",example="false")
    private Boolean opend;

    /**
     * 是否需要账号密码认证
     */
    @ApiModelProperty(value="是否需要账号密码认证",example="false")
    private Boolean authorize_account;

    private Long user_id;
    private String token;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

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
     * 路径 链接
     * @return url 路径 链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 路径 链接
     * @param url 路径 链接
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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
     * 是否需要授权
     * @return authorize 是否需要授权
     */
    public Boolean getAuthorize() {
        return authorize;
    }

    /**
     * 是否需要授权
     * @param authorize 是否需要授权
     */
    public void setAuthorize(Boolean authorize) {
        this.authorize = authorize;
    }

    /**
     * 方法
     * @return method 方法
     */
    public String getMethod() {
        return method;
    }

    /**
     * 方法
     * @param method 方法
     */
    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    /**
     * 收费
     * @return amount 收费
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 收费
     * @param amount 收费
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 是否开放
     * @return opend 是否开放
     */
    public Boolean getOpend() {
        return opend;
    }

    /**
     * 是否开放
     * @param opend 是否开放
     */
    public void setOpend(Boolean opend) {
        this.opend = opend;
    }

    /**
     * 是否需要账号密码认证
     * @return authorize_account 是否需要账号密码认证
     */
    public Boolean getAuthorize_account() {
        return authorize_account;
    }

    /**
     * 是否需要账号密码认证
     * @param authorize_account 是否需要账号密码认证
     */
    public void setAuthorize_account(Boolean authorize_account) {
        this.authorize_account = authorize_account;
    }
}