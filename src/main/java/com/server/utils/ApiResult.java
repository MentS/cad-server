package com.server.utils;

import java.io.Serializable;

/**
 * @author SH
 * @date 2019/9/20
 */
@SuppressWarnings("serial")
public class ApiResult<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ApiResult() {

    }

    /*
     * 1. put post delete 请求只返回 code 的 message
     * 2. get 请求数据 返回 code message data
     *
     * */

    public ApiResult(Integer code, String message) {
        this.code = code;
        this.message = message;
        this.data = null;
    }

    public ApiResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static ApiResult success() {
        return new ApiResult(Code.SUCCESS, Code.SUCCESS_MSG);
    }

    public static <T> ApiResult success(T data) {
        return new ApiResult(Code.SUCCESS, Code.SUCCESS_MSG, data);
    }

    public static ApiResult fail() {
        return new ApiResult(Code.FAIL_CODE, Code.FAIL_MSG);
    }

    public static ApiResult fail(Integer code, String message) {
        return new ApiResult(code, message);
    }

}
