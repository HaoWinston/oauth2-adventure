package com.hao.authcommon.response;

import com.hao.authcommon.enums.IResponseEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class BaseResponse<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private String code;
    private String message;
    private T data;

    public static BaseResponse build(IResponseEnum responseEnum) {
        return new BaseResponse(responseEnum.getCode(), responseEnum.getMessage(), null);
    }

    public static BaseResponse buildData(IResponseEnum responseEnum, Object data) {
        return new BaseResponse(responseEnum.getCode(), responseEnum.getMessage(), data);
    }
}
