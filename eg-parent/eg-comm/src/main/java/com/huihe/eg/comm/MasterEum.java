package com.huihe.eg.comm;

public enum  MasterEum {

    master_40001(40001, "剩余时间不足"),master_40002(40002, "主键id未传"),
    master_40003(40003, "课程时间有冲突，请重试"),master_40004(40004, "您的课程时间不足,请前往购买"),
    master_40005(40005, "时区未获取"),master_40006(40006, "您未购买相应学习卡"),
    master_40007(40007, "课程不存在"),master_40008(40008, "预约失败"),
    master_40009(40009, "课程已结束"),master_40010(40010, "您的课程尚未开始,请稍后再试"),
    master_40011(40011, "已过可修改时间,无法删除"),master_40012(40012, "您尚未选择学习卡");
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
    public static MasterEum getByCode(String code) {
        for (MasterEum resultCode : values()) {
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
    MasterEum(Integer code, String desc) {
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
