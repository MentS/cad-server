package com.server.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.server.entity.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author SH
 * @since 2019-10-23
 */
public interface ProductMapper extends BaseMapper<Product> {

    List<Map<String, Object>> selectProduct(@Param("bomId") String bomId);

    List<Map<String, Object>> selectProductBom(@Param("b_id") String b_id);

    @DS("xa")
    List<Map<String, Object>> selectXA(@Param("fpdno") String fpdno);
}
