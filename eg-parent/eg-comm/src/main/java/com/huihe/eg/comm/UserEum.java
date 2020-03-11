package com.huihe.eg.comm;

public enum UserEum {
    user_10000(10000, "用户已存在"), user_100001(100001, "昵称未传"),
    user_10002(10002, "登录类型未传"), user_10003(10003, "请输入账号"),
    user_10004(10004, "请输入密码"), user_10005(10005, "账号或密码错误"),
    user_10006(10006, "手机号码不正确"), user_10007(10007, "请输入验证码"),
    user_10008(10008, "请输入验证码"), user_10009(10009, "操作过于频繁，请稍后再试"),
    user_10010(10010, "请重新获取验证码"), user_10011(10011, "验证码错误"),
    user_10012(10012, "发送验证码失败"), user_10013(10013, "登录失败"),
    user_10014(10014, "注册失败"), user_10015(10015, "请输入手机号"),
    user_10016(10016, "该账户已存在,请前往登录"), user_10017(10017, "请输入正确的邮箱"),
    user_10018(10018, "账号不存在"), user_10019(10019, "请输入邮箱号"),
    user_10020(10020, "清空失败"),user_10021(10021, "用户资料修改失败"),
    user_10022(10022, "偏好获取失败"),user_10023(10023, "用户偏好选择失败"),
    user_10024(10024, "邀请失败"),user_10025(10025, "通讯录不存在"),
    user_10026(10026, "短信发送失败"),user_10027(10027, "短信发送失败"),
    user_10028(10028, "签到失败"),user_10029(10029, "参数错误"),
    user_10030(10030, "您未成为助学师,请前往注册"),user_10031(10031, "优惠卷不存在,请稍后再试"),
    user_10032(10032, "该手机号已被绑定");
    /**
     * 结果码
     */
    private Integer code;

    /**
     * 结果描述
     */
    private String desc;

    /**
     * 获取结果码
     *
     * @param code 待查询code
     * @return 对应的结果码
     */
    public static UserEum getByCode(String code) {
        for (UserEum resultCode : values()) {
            if (resultCode.getCode().equals(code)) {
                return resultCode;
            }
        }
        return null;
    }

    /**
     * @param code
     * @param desc
     */
    private UserEum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * @return the code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }
}
