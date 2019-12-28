package com.server.controller;


import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.server.VO.OrderdVO;

import com.server.entity.MakeOrderProcess;
import com.server.mapper.MakeOrderProcessMapper;
import com.server.mapper.OrderdMapper;
import com.server.utils.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author SH
 * @since 2019-12-27
 */
@RestController
@RequestMapping("/orderd")
@CrossOrigin(origins = "*")
public class OrderdController {

    @Autowired
    private OrderdMapper orderdMapper;
    @Autowired
    private MakeOrderProcessMapper makeOrderProcessMapper;

    @GetMapping(value = "/list")
    public ApiResult<List<Map<String,Object>>> selectAll() {
        Page<Map<String, Object>> page = new Page<>(1,2);
        IPage<Map<String, Object>> list = orderdMapper.selectList(page);

        List<Map<String, Object>> records = list.getRecords();

        records.forEach( item -> {
            System.out.println(item.get("m_code"));
        });


        //System.out.println(list.getRecords());

        //List<Map<String ,Object>> list = orderdMapper.selectList();
        return ApiResult.success(list);
    }

    @GetMapping(value = "/test")
    public ApiResult<Map<String,Object>> test (@RequestParam(value = "page",  defaultValue = "1") Integer page,
                                               @RequestParam(value = "size",  defaultValue = "10") Integer size) {

        Page<OrderdVO> pageinfo = new Page<>(page,size);

        IPage<OrderdVO> list =  orderdMapper.test(pageinfo);

        List<OrderdVO> records = list.getRecords();


        records.forEach( item->{
            String mcode = item.getM_code();
            Integer bomid = item.getO_bomid();
            if(!StrUtil.isEmpty(mcode)) {
                item.setChildren(makeOrderProcessMapper.selectProcess(mcode,bomid));
                //System.out.println(makeOrderProcessMapper.selectProcess(mcode,bomid));
            }

        });

        //System.out.println(records);


        return ApiResult.success(list);
    }
}
