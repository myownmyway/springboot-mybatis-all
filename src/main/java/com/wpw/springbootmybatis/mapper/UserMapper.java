package com.wpw.springbootmybatis.mapper;

import com.wpw.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * dao操作
 *
 * @author wpw
 */
@Mapper
@Repository
public interface UserMapper {
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
     * @param id 根据用户id查询用户的所有电话信息
     * @return
     */
    User selectPhoneById(Integer id);

    /**
     * 根据id查询用户选择的运营商
     *
     * @param id 用户id
     * @return user
     */
    User selectComboById(Integer id);
}
