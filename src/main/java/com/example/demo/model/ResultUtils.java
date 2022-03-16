package com.example.demo.model;



public class ResultUtils {

    public static final int _SUCCESS = 200;

    private ResultUtils() {
    }

    public static Result<?> get(int code, String msg)
    {
        return new Result<>(code, msg);
    }

    public static <T> Result<T> get(T data, int code)
    {
        return new Result<T>(code).setData(data);
    }

    public static <T> Result<T> get(int code, String msg, T data)
    {
        return new Result<T>(code).setMsg(msg).setData(data);
    }

    /** @return (200, 操作成功)的实例 */
    public static Result<?>  success()
    {
        return get(_SUCCESS, "操作成功");
    }

    /** @return (200, 操作成功)的实例 */
    public static <T> Result<T>  success(T data)
    {
        return get(_SUCCESS, "操作成功",data);
    }

}
