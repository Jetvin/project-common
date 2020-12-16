package com.springboot.jetvin.common.response;

import lombok.ToString;

@ToString
public class Result<T> {

    private String msg;

    private int code;

    private T data;

    public static <T> Result<T> ofSuccess(String msg) {
        return new Result<T>()
                .setCode(200)
                .setMsg(msg);
    }

    public static <T> Result<T> ofSuccess(T data) {
        return new Result<T>()
                .setCode(200)
                .setMsg("success")
                .setData(data);
    }

    public static <T> Result<T> ofSuccess(String msg, T data) {
        return new Result<T>()
                .setCode(200)
                .setMsg(msg)
                .setData(data);
    }

    public static <T> Result<T> ofFail(String msg) {
        return new Result<T>()
                .setCode(400)
                .setMsg(msg);
    }

    public static <T> Result<T> ofFail(int code, String msg) {
        return new Result<T>()
                .setCode(code)
                .setMsg(msg);
    }

    public int getCode() {
        return code;
    }

    public Result<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Result<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result<T> setData(T data) {
        this.data = data;
        return this;
    }
}
