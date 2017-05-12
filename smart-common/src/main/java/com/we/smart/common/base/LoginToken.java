package com.we.smart.common.base;

import com.we.smart.common.type.UserType;

/**
 * Created by shange on 2017/5/12.
 */
public class LoginToken {

    // 登录用户类型
    private UserType userType;
    // 用户昵称
    private String nickname;

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
