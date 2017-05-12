package com.we.smart.common.type;

/**
 * 返回值
 * Created by shange on 2017/5/12.
 */
public enum ResultType {
    Success(0),// 成功
    Failed(-1);// 失败

    private int value;

    ResultType(int value) {
        this.value = value;
    }

    public static ResultType valueOf(int value) {
        for (ResultType type : ResultType.values()) {
            if (value == type.value) return type;
        }
        throw new RuntimeException("unknown result type");
    }
}
