package com.sunzhiyuan.szybusinessapi.orm.mybatis.mappers;

import com.sunzhiyuan.szybusinessapi.beans.QueryUserInfoDTO;
import com.sunzhiyuan.szybusinessapi.orm.mybatis.entity.UserInfoDO;

/**
 * Created by sunzhiyuan on 2019/7/9.
 */
public interface UserInfoMapper {
    Boolean addUser(UserInfoDO userInfo);

    Boolean updateUser(UserInfoDO userInfo);

    UserInfoDO queryUser(QueryUserInfoDTO userInfo);
}
