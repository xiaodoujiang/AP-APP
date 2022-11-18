package com.bmilk.common.domain;

/**
 * 返回状态信息
 */
public enum Result {
    SUCCESS("000", "成功"),
    PARMA_ERROR("001", "参数错误"),
    NOT_FUND("002", null),
    SYSTEM_ERROR("999", "系统错误");



    private String code;

    private String msg;

    Result(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
