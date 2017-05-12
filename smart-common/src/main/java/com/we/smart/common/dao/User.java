package com.we.smart.common.dao;

import com.we.smart.common.type.StatusType;
import com.we.smart.common.type.UserType;

import java.util.Date;

/**
 * Created by shange on 2017/5/12.
 */
public class User {

    // 本地库自增编号
    private int uid;
    // 全局唯一编号
    private String uuid;
    // 用户名(可用于登录)
    private String username;
    // 手机号(可用于登录)
    private String phone;
    // 邮箱(可用于登录)
    private String email;
    // 登录密码
    private String password;
    // 昵称
    private String nickname;
    // 用户类型
    private UserType userType;
    // 用户状态
    private StatusType status;
    // 头像base64
    private String headImageBase64;
    // 创建时间
    private Date createTime;
    // 最后修改时间
    private Date updateTime;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public String getHeadImageBase64() {
        return headImageBase64;
    }

    public void setHeadImageBase64(String headImageBase64) {
        this.headImageBase64 = headImageBase64;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
