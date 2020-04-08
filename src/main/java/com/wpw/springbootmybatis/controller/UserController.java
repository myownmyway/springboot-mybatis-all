package com.wpw.springbootmybatis.controller;

import com.wpw.springbootmybatis.entity.Combo;
import com.wpw.springbootmybatis.entity.User;
import com.wpw.springbootmybatis.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户controller
 *
 * @author wpw
 */
@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 根据id获取用户信息
     *
     * @param id 用户id
     * @return user
     */
    @GetMapping(value = "/get")
    public User selectById(@RequestParam(value = "id") Integer id) {
        return userService.selectById(id);
    }

    /**
     * 查询所有用户信息
     *
     * @return userList
     */
    @GetMapping(value = "/list")
    public List<User> list() {
        return userService.list();
    }

    /**
     * 新增用户信息
     *
     * @param user 用户信息
     * @return 自增主键
     */
    @PostMapping(value = "/insert")
    public int insert(@RequestBody User user) {
        return userService.insert(user);
    }

    /**
     * 修改用户信息
     *
     * @param user 用户信息
     * @return 成功与否
     */
    @PutMapping(value = "/update")
    public int update(@RequestBody User user) {
        return userService.update(user);
    }

    /**
     * 删除用户信息
     *
     * @param id 用户id
     * @return 成功与否
     */
    @DeleteMapping(value = "/delete")
    public int delete(@RequestParam(value = "id") Integer id) {
        return userService.delete(id);
    }

    @GetMapping(value = "/getPhone")
    public User selectPhoneById(@RequestParam(value = "id") Integer id) {
        return userService.selectPhoneById(id);
    }

    @GetMapping(value = "/getCombo")
    public User selectComboById(@RequestParam(value = "id") Integer id) {
        return userService.selectComboById(id);
    }
    @GetMapping(value = "/getComboById")
    public Combo selectCombo(@RequestParam(value = "id") Integer id){
        return userService.selectCombo(id);
    }
}
