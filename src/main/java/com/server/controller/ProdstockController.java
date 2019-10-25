package com.server.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.server.entity.Prodstock;
import com.server.mapper.ProdstockMapper;
import com.server.utils.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author SH
 * @since 2019-09-26
 */
@RestController
@RequestMapping("/prodstock")
public class ProdstockController {
    @Autowired
    private ProdstockMapper prodstockMapper;

    @GetMapping
    public ApiResult<Prodstock> selectList() {
        return ApiResult.success(prodstockMapper.selectList(new QueryWrapper<>( new Prodstock()).ne("p_stock","0")));
    }
}
