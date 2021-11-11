package com.learn.seckill.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public enum RespBeanEnum {
    SUCCESS(200, "请求成功"),
    ERROR(500, "服务端异常");

    private final Integer code;
    private final String message;

}
