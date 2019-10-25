package com.server.controller;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.server.mapper.CustMapper;
import com.server.entity.Cust;
import com.server.utils.ApiResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author SH
 * @date 2019/9/20
 */
@RestController
@RequestMapping("/cust")
public class CustController {

    @Autowired
    private CustMapper custMapper;

    private Logger logger = LoggerFactory.getLogger(CustController.class);


    @GetMapping()
    public ApiResult<List<Cust>> selectList(@RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                          @RequestParam(value = "page", required = false, defaultValue = "10") Integer size){

        if (page ==null && size == null) {
            return ApiResult.success(custMapper.selectList(null));
        }
        Page<Cust> pageInfo = new Page<>(page,size);
        IPage<Cust> custIPage = custMapper.selectPage(pageInfo, new QueryWrapper<Cust>());
        return  ApiResult.success(custIPage);
    }


    @GetMapping(value = "/{c_no}")
    public ApiResult<Cust> selectOne(@PathVariable("c_no") String c_no){
        return ApiResult.success(custMapper.selectById(c_no));
    }


    @PostMapping
    public ApiResult save( @RequestBody Cust cust) {
        String custNo = JSONUtil.parseObj(cust).getStr("c_no");
        if(!ObjectUtil.isEmpty(custMapper.selectById(custNo))) {
            return ApiResult.fail(10001, "客户编号已存在");
        }
        custMapper.insert(cust);
        return ApiResult.success();
    }

    @DeleteMapping(value = "/{c_no}")
    public ApiResult delete(@PathVariable("c_no") String c_no) {
        custMapper.deleteById(c_no);
        return ApiResult.success();
    }

    @PutMapping()
    public ApiResult update(@RequestBody Cust cust){
        custMapper.updateById(cust);
        return ApiResult.success();
    }


}
