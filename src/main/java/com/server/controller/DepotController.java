package com.server.controller;


import cn.hutool.core.util.ObjectUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.server.entity.Depot;
import com.server.mapper.DepotMapper;
import com.server.utils.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author SH
 * @since 2019-10-12
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/depot")
public class DepotController {

    @Autowired
    private DepotMapper depotMapper;

    @GetMapping()
    public ApiResult<Depot> selectList() {
        return ApiResult.success(depotMapper.selectList(null));
    }

    @PostMapping
    public ApiResult save( @RequestBody Depot depot) {
        String id = JSONUtil.parseObj(depot).getStr("d_no");
        if(!ObjectUtil.isEmpty(depotMapper.selectById(id))) {
            return ApiResult.fail(10001, "编号已存在");
        }
        depotMapper.insert(depot);
        return ApiResult.success();
    }

    @DeleteMapping(value = "/{d_no}")
    public ApiResult delete(@PathVariable("d_no") String d_no) {
        depotMapper.deleteById(d_no);
        return ApiResult.success();
    }

    @PutMapping(value = "/{d_no}")
    public ApiResult update(@PathVariable("d_no") String d_no,  @RequestBody Depot depot){

        depotMapper.update(depot, new UpdateWrapper<Depot>().eq("d_no",d_no));
//        depotMapper.updateById(depot);
        return ApiResult.success();
    }
}
