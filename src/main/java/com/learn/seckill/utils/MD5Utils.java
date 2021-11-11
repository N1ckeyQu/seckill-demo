package com.learn.seckill.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * md5工具类
 */
public class MD5Utils {

    private static final String SALT = "1a2b3c4d";

    public static String md5(String str) {
        return DigestUtils.md5Hex(str);
    }

}
