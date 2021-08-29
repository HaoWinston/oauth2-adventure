package com.hao.authcommon.util;

import com.alibaba.fastjson.JSON;

/**
 * @author H
 * @version v1.0.0
 * @Package : com.test.oauth.common.util
 * @Description : JSONUtils
 * @Create on : 2021/7/22 09:29
 **/
public class JSONUtils {

    public static String toString(Object object) {
        return JSON.toJSONString(object);
    }

}
