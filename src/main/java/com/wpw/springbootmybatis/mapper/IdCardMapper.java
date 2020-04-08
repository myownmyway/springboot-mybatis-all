package com.wpw.springbootmybatis.mapper;

import com.wpw.springbootmybatis.entity.IdCard;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * idCard dao操作类
 *
 * @author wpw
 */
@Mapper
@Repository
public interface IdCardMapper {
    /**
     * @return 获取用户信息的身份证列表
     */
    List<IdCard> selectIdOfUser();
}
