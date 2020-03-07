package com.mmbbhh.shop.service;

import com.mmbbhh.shop.mapper.UserMapper;
import com.mmbbhh.shop.model.Good;
import com.mmbbhh.shop.model.User;
import com.mmbbhh.shop.model.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    UserMapper userMapper;
    @Override
    //实现UserDetailService接口实现查询用户
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //System.out.println(username);
        UserDetail user = userMapper.loadUserByUsername(username);
        //用户名不存在抛出异常
        if (user == null) {
            throw new UsernameNotFoundException("账户不存在");
        }
        //用户存在把用户相关信息返回
        user.setRoles(userMapper.getUserRolesByUid(user.getId()));
        return user;
    }

    //添加用户
    public Boolean add_user(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);
        user.setUser_pwd(passwordEncoder.encode(user.getUser_pwd()));
        return userMapper.add_user(user) != 0 && userMapper.add_user_role(user.getUser_name()) != 0;
    }

    //判断用户名是否存在
    public boolean ifUserExist(String name) {
        return userMapper.user_num(name) == 0;
    }

    //判断是否收藏该商品
    public boolean ifLike(String name, int id) {
        return userMapper.if_like(name, id) == 0;
    }

    //添加收藏
    public Boolean add_collect(String name, int id) {
        return userMapper.add_collect(name, id) != 0;
    }

    //取消收藏
    public Boolean delete_collect(String name, int id) {
        return userMapper.delete_collect(name, id) != 0;
    }

    //获取所有收藏
    public List<Good> get_collections(String name) {
        return userMapper.get_collections(name);
    }
}