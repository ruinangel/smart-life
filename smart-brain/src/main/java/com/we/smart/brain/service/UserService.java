package com.we.smart.brain.service;

import com.we.smart.common.base.BaseResponse;
import com.we.smart.common.dto.AddUserRequest;
import com.we.smart.common.dto.UserLoginRequest;

/**
 * Created by shange on 2017/5/12.
 */
public interface UserService {

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    BaseResponse addUser(AddUserRequest user);

    /**
     * 用户登录
     *
     * @param user
     * @return
     */
    BaseResponse userLogin(UserLoginRequest user);
}