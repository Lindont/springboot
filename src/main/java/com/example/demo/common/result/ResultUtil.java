package com.example.demo.common.result;

/**
 * @Author : HuangHaoXin
 * @Description : 全局统一返回工具类
 * @Date : Create in 2018-01-23
 */
public class ResultUtil {
    /**
     * success
     *
     * @param <T>
     * @return
     */
    public static <T> Result<T> success() {
        return success("success", null);
    }

    /**
     * success
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data) {
        return success(null, data);
    }

    /**
     * success
     *
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(String msg) {
        return success(msg, null);
    }

    /**
     * success
     *
     * @param msg
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(String msg, T data) {
        return resultMsg(ResultCode.SUCCESS, msg, data);
    }


    /**
     * error
     *
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> Result<T> error(String msg) {
        return error(msg, null);
    }

    /**
     * error
     *
     * @param msg
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> error(String msg, T data) {
        return resultMsg(ResultCode.ERROR, msg, data);
    }


    /**
     * Result
     *
     * @param code
     * @param msg
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> resultMsg(Integer code, String msg, T data) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }


    /**
     * EnumResult
     *
     * @param resultEnum
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> resultEnumMsg(ResultEnum resultEnum, T data) {
        Result<T> result = new Result<>();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMsg());
        result.setData(data);
        return result;
    }

}
