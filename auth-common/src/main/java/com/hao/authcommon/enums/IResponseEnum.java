package com.hao.authcommon.enums;

/**
 * @author H
 * @version v1.0.0
 * @Description : IResponseEnum
 * @Create on : 2021/7/22 09:34
 **/
public interface IResponseEnum {

    String getCode();

    String getMessage();

    default String formatMsg(String msg) {
        return null;
    }

}
