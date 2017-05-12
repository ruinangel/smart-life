package com.we.smart.common.type;

/**
 * 用户类型
 * Created by shange on 2017/5/12.
 */
public enum UserType {
    Admin(0),// 管理员
    User(1),// 普通用户
    Guest(2),// 客人，临时用户
    Machine(8),// 机器人
    Other(9);// 其它

    private int value;

    UserType(int value) {
        this.value = value;
    }

    public static UserType valueOf(int value) {
        for (UserType type : UserType.values()) {
            if (value == type.value) return type;
        }
        throw new RuntimeException("unknown user type");
    }
}
