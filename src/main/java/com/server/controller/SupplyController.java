package com.server.controller;


import cn.hutool.core.util.ObjectUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.server.entity.Supply;
import com.server.mapper.SupplyMapper;
import com.server.utils.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author SH
 * @since 2019-09-25
 */
@RestController
@RequestMapping("/supply")
public class SupplyController {

    @Autowired
    private SupplyMapper supplyMapper;

    @GetMapping()
    public ApiResult<List<Supply>> selectList(@RequestParam(value = "page", required = false,defaultValue = "1") Integer page,
                                            @RequestParam(value = "size", required = false, defaultValue = "10") Integer size){
        if(page == null && size == null){
            return ApiResult.success(supplyMapper.selectList(null));
        }
        Page<Supply> pageInfo = new Page<>(page,size);
        IPage<Supply> supplyIPage = supplyMapper.selectPage(pageInfo, new QueryWrapper<>());
        return  ApiResult.success(supplyIPage);

    }



    @GetMapping(value = "/{s_no}")
    public ApiResult<Supply> selectOne(@PathVariable("s_no") String s_no){
        return ApiResult.success(supplyMapper.selectById(s_no));

    }


    @PostMapping
    public ApiResult save( @RequestBody Supply supply) {
        String supplyNo = JSONUtil.parseObj(supply).getStr("c_no");
        if(!ObjectUtil.isEmpty(supplyMapper.selectById(supplyNo))) {
            return ApiResult.fail(10001, "供应商编号已存在");
        }
        supplyMapper.insert(supply);
        return ApiResult.success();
    }

    @DeleteMapping(value = "/{s_no}")
    public ApiResult delete(@PathVariable("s_no") String s_no) {
        supplyMapper.deleteById(s_no);
        return ApiResult.success();
    }

    @PutMapping()
    public ApiResult update(@RequestBody Supply cust){
        supplyMapper.updateById(cust);
        return ApiResult.success();
    }
}
