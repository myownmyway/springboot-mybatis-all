package com.wpw.springbootmybatis.controller;

import com.wpw.springbootmybatis.entity.IdCard;
import com.wpw.springbootmybatis.mapper.IdCardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 身份证处理器
 *
 * @author wpw
 */
@RestController
public class IdCardController {
    public final IdCardMapper idCardMapper;

    public IdCardController(IdCardMapper idCardMapper) {
        this.idCardMapper = idCardMapper;
    }

    @GetMapping(value = "/select")
    public List<IdCard> listOfUser() {
        return idCardMapper.selectIdOfUser();
    }
}
