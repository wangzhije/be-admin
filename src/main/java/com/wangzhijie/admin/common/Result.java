package com.wangzhijie.admin.common;

import lombok.Data;

/**
 * 企业级统一接口返回结果
 * 所有接口必须用这个类返回，保证前端格式一致
 */
@Data
public class Result<T> {

    // 响应状态码 200成功 500失败
    private Integer code;

    // 响应消息
    private String message;

    // 响应数据
    private T data;

    // 成功：不带数据
    public static <T> Result<T> success() {
        Result<T> r = new Result<>();
        r.setCode(200);
        r.setMessage("操作成功");
        return r;
    }

    // 成功：带数据
    public static <T> Result<T> success(T data) {
        Result<T> r = new Result<>();
        r.setCode(200);
        r.setMessage("操作成功");
        r.setData(data);
        return r;
    }

    // 失败
    public static <T> Result<T> error(String message) {
        Result<T> r = new Result<>();
        r.setCode(500);
        r.setMessage(message);
        return r;
    }
}
