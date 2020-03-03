package com.mmbbhh.shop.mapper;


import com.mmbbhh.shop.model.Role;
import com.mmbbhh.shop.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    //通过用户名读取用户
    User loadUserByUsername(String username);
    //通过id读取用户权限
    List<Role> getUserRolesByUid(Integer id);
}
