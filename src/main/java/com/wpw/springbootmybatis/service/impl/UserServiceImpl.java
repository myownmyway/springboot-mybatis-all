package com.wpw.springbootmybatis.service.impl;

import com.wpw.springbootmybatis.entity.Combo;
import com.wpw.springbootmybatis.entity.User;
import com.wpw.springbootmybatis.mapper.ComboMapper;
import com.wpw.springbootmybatis.mapper.UserMapper;
import com.wpw.springbootmybatis.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wpw
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
    private final ComboMapper comboMapper;

    public UserServiceImpl(UserMapper userMapper, ComboMapper comboMapper) {
        this.userMapper = userMapper;
        this.comboMapper = comboMapper;
    }

    @Override
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public int delete(Integer id) {
        return userMapper.delete(id);
    }

    @Override
    public User selectPhoneById(Integer id) {
        return userMapper.selectPhoneById(id);
    }

    @Override
    public User selectComboById(Integer id) {
        return userMapper.selectComboById(id);
    }

    @Override
    public Combo selectCombo(Integer id) {
        return   comboMapper.selectUserById(id);
    }
}
