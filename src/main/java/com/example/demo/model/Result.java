package com.example.demo.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class Result<T> implements Serializable {

    public static int _SUCCESS = 200;

    private static final long serialVersionUID = -5137910665878192217L;

    private Integer code;

    private String msg;

    private T data;

    public Result() {
    }

    public Result(Integer code) {
        this.code = code;
    }

    public Result(Integer code, String msg)
    {
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, T data)
    {
        this.code = code;
        this.data = data;
    }

    public Result(Integer code, String msg, T data)
    {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
