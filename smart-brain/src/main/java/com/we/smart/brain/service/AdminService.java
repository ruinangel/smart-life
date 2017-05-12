package com.we.smart.brain.service;

import com.we.smart.common.base.BaseResponse;
import com.we.smart.common.dto.AddAdminRequest;
import com.we.smart.common.dto.AdminLoginRequest;

/**
 * Created by shange on 2017/5/12.
 */
public interface AdminService {

    /**
     * 添加管理员
     *
     * @param user
     * @return
     */
    BaseResponse addAdmin(AddAdminRequest user);

    /**
     * 管理员登录
     *
     * @param user
     * @return
     */
    BaseResponse adminLogin(AdminLoginRequest user);
}