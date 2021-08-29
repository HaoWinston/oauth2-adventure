package com.hao.authcommon.enums;


public enum ResponseEnum implements IResponseEnum {
    ILLEGAL_ARGUMENT("998999", "参数错误"),
    NULL_RESULT_SET("998998", "结果集不存在"),
    UNEXPECTED_RESULT_SET("998997", "结果集已存在"),
    USER_OR_PASSWORD_ERROR("998996", "用户名或密码错误"),
    GET_TOKEN_FAIL("998995", "获取token失败"),
    RPC_ERROR("998994", "获取token失败"),
    TOKEN_IS_NOT_MATCH_USER("998993", "token错误")
    ;

    private String code;

    private String message;

    ResponseEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String formatMsg(String msg) {
        return msg;
    }

}
