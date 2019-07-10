package com.sunzhiyuan.szybusinessapi.service.impl;

import com.sunzhiyuan.szybusinessapi.beans.QueryUserInfoDTO;
import com.sunzhiyuan.szybusinessapi.beans.UserInfoDTO;
import com.sunzhiyuan.szybusinessapi.orm.mybatis.entity.UserInfoDO;
import com.sunzhiyuan.szybusinessapi.orm.mybatis.mappers.UserInfoMapper;
import com.sunzhiyuan.szybusinessapi.service.UserInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sunzhiyuan on 2019/7/9.
 */

@Service
public class UserServiceImpl implements UserInfoService{

    @Autowired UserInfoMapper userInfoMapper;

    @Override public Boolean addUser(UserInfoDTO userInfo) {
        return null;
    }

    @Override public Boolean updateUser(UserInfoDTO userInfo) {
        return null;
    }

    @Override public UserInfoDTO queryUserById(Long userId) {

        QueryUserInfoDTO query = new QueryUserInfoDTO();
        query.setId(userId);
        UserInfoDO userInfoDO = userInfoMapper.queryUser(query);

        UserInfoDTO userInfoDTO = new UserInfoDTO();
        if(userInfoDO != null){
            BeanUtils.copyProperties(userInfoDO, userInfoDTO);
        }
        return userInfoDTO;
    }

    @Override public UserInfoDTO queryUserByMobile(String mobile) {
        return null;
    }

    @Override public UserInfoDTO queryUserByIdCardNo(String idCard) {
        return null;
    }
}
