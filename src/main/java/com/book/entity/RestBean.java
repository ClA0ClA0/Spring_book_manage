package com.book.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RestBean<T> {
    int code;
    String reason;
    T data;
    /*
        code为200或500
        reason为对应的状态
     */
    public RestBean(int code, String reason) {
        this.code = code;
        this.reason = reason;
    }
}