package com.share.sso.interfaces.service;

import com.share.sso.interfaces.model.UserModel;

import java.util.List;

public interface UserService {
    /**
     * 通过id查询用户
     * @param id
     * @return T
     * @日期：2018年6月17日
     */
    public UserModel findById( Long id);

    /**
     * 查询用户列表
     * @return List<T>
     * @日期：2018年6月17日
     */
    public List<UserModel> listUser();
}
