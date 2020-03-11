package com.huihe.eg.comm;

import org.springframework.boot.SpringApplication;

public enum OrderEum {
    order_70000(7000, "金额未传"), order_70001(70001, "金额最少0.01"),
    order_70002(70002, "查询的节点未传"), order_70003(70003, "查询的节点名称"),
    order_70004(70004, "风险等级ID未传"), order_70005(70005, "风险等级名称未传"),
    order_70006(70006, "手机号未传"), order_70007(70007, "角色不存在"),
    order_70008(70008, "余额不足,请前往充值"),order_70009(70009, "扣除失败"),
    order_70010(70010, "订单已存在"),order_70011(70011, "商品不存在"),
    order_70012(70012, "红包已领取"),order_70013(70013, "订单不存在"),
    order_70014(70013, "订单失败")
    ;


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
    public static OrderEum getByCode(String code) {
        for (OrderEum resultCode : values()) {
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
    OrderEum(Integer code, String desc) {
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
