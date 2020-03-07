package com.mmbbhh.shop.mapper;


import com.mmbbhh.shop.model.Good;
import com.mmbbhh.shop.model.Role;
import com.mmbbhh.shop.model.User;
import com.mmbbhh.shop.model.UserDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    //通过用户名读取用户
    UserDetail loadUserByUsername(String username);
    //通过id读取用户权限
    List<Role> getUserRolesByUid(Integer id);
    //用户注册
    int add_user(User user);
    //用户添加权限
    int add_user_role(String name);
    //判断是否存在同名用户
    Integer user_num(String name);
    //判断用户是否收藏该商品
    Integer if_like(String name,int goods_id);
    //添加收藏记录
    int add_collect(String name,int goods_id);
    //删除收藏记录
    int delete_collect(String name,int goods_id);
    //获取用户所有收藏商品
    List<Good> get_collections(String name);
}
