package com.wpw.springbootmybatis.service;

import com.wpw.springbootmybatis.entity.Combo;
import com.wpw.springbootmybatis.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 根据id获取用户信息
     *
     * @param id 用户id
     * @return user
     */
    User selectById(Integer id);

    /**
     * 查询所有用户信息
     *
     * @return userList
     */
    List<User> list();

    /**
     * 新增用户信息
     *
     * @param user 用户信息
     * @return 自增主键
     */
    int insert(User user);

    /**
     * 修改用户信息
     *
     * @param user 用户信息
     * @return 成功与否
     */
    int update(User user);

    /**
     * 删除用户信息
     *
     * @param id 用户id
     * @return 成功与否
     */
    int delete(Integer id);

    /**
     * 根据用户id查找当前下的手机号信息
     *
     * @param id 用户id
     * @return 用户信息
     */
    User selectPhoneById(Integer id);

    /**
     * 根据id查询用户选择的运营商
     * @param id 用户id
     * @return user
     */
    User selectComboById(Integer id);

    /**
     * 查询运营商信息
     * @param id 运营商id
     * @return combo信息
     */
    Combo selectCombo(Integer id);
}
