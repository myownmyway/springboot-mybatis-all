package com.wpw.springbootmybatis.mapper;

import com.wpw.springbootmybatis.entity.Combo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ComboMapper {
    /**
     * @param id 根据id查询运营商
     * @return
     */
    Combo selectUserById(Integer id);

}
