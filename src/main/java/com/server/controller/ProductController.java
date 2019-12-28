package com.server.controller;



import com.baomidou.dynamic.datasource.annotation.DS;
import com.server.mapper.ProductMapper;
import com.server.utils.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author SH
 * @since 2019-10-23
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductMapper productMapper;



    @GetMapping(value = "/bom")
    private ApiResult<List<Map<String,Object>>> selectProduct() {
        return ApiResult.success(productMapper.selectProduct("1656"));
    }

    @GetMapping
    private ApiResult<List<Map<String,Object>>> selectBom() {
      return ApiResult.success(productMapper.selectProductBom("1370"));
    }


    @GetMapping(value = "/xa")
    private ApiResult<List<Map<String,Object>>> selectxa() {
        List<Map<String, Object>> product = productMapper.selectXA("22175426");
        System.out.println("begin");
        product.forEach( bom -> {
            System.out.println(bom.get("fxstn"));
        });
        System.out.println("end");
        return ApiResult.success(productMapper.selectXA("22175426"));
    }



}
