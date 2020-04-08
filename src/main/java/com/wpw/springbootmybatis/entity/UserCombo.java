package com.wpw.springbootmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 用户拥有运营商实体
 *
 * @author wpw
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Accessors(chain = true)
public class UserCombo implements Serializable {
    private Integer uid;
    private Integer cid;
    private Integer price;
    private List<User> users;
    private List<Combo> combos;
}
