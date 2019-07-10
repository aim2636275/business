package com.sunzhiyuan.szybusinessapi.service;

import com.sunzhiyuan.szybusinessapi.beans.UserInfoDTO;

/**
 * Created by sunzhiyuan on 2019/7/9.
 */
public interface UserInfoService {

    Boolean addUser(UserInfoDTO userInfo);

    Boolean updateUser(UserInfoDTO userInfo);

    UserInfoDTO queryUserById(Long userId);

    UserInfoDTO queryUserByMobile(String mobile);

    UserInfoDTO queryUserByIdCardNo(String idCard);


}
