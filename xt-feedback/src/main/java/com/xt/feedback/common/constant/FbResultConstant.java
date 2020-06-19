package com.xt.feedback.common.constant;

/**
 * cms系统接口结果常量枚举类
 *
 */
public enum FbResultConstant {

    /**
     * 失败
     */
    FAILED(0, "失败"),

    /**
     * 成功
     */
    SUCCESS(1, "成功"),

    /**
     * 文件类型不支持
     */
    FILE_TYPE_ERROR(20001, "文件类型不支持!"),

    /**
     * 无效长度
     */
    INVALID_LENGTH(20002, "参数长度无效"),

    /**
     * 无效参数
     */
    INVALID_PARAMETER(20003, "无效参数");

    public int code;

    public String message;

    FbResultConstant(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
