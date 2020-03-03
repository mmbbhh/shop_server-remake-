package com.mmbbhh.shop.service;

import com.mmbbhh.shop.mapper.UserMapper;
import com.mmbbhh.shop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    UserMapper userMapper;
    @Override
    //实现UserDetailService接口实现查询用户
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //System.out.println(username);
        User user = userMapper.loadUserByUsername(username);
        //用户名不存在抛出异常
        if (user == null) {
            throw new UsernameNotFoundException("账户不存在");
        }
        //用户存在把用户相关信息返回
        user.setRoles(userMapper.getUserRolesByUid(user.getId()));
        return user;
    }
}