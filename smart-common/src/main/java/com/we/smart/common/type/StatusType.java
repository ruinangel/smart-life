package com.we.smart.common.type;

/**
 * 状态类型
 * Created by shange on 2017/5/12.
 */
public enum StatusType {
    Normal(1),// 正常用户
    Unauthorized(0),// 未授权的用户（管理员可以将User和Guest相互转换）
    Deleted(-1);// 已删除的

    private int value;

    StatusType(int value) {
        this.value = value;
    }

    public static StatusType valueOf(int value) {
        for (StatusType type : StatusType.values()) {
            if (value == type.value) return type;
        }
        throw new RuntimeException("unknown status type");
    }
}
