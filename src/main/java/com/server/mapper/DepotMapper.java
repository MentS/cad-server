package com.server.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.server.entity.Depot;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author SH
 * @since 2019-10-12
 */
public interface DepotMapper extends BaseMapper<Depot> {

   void updateID(@Param(Constants.WRAPPER) Wrapper<Depot> userWrapper, @Param("id") String id , @Param("depot") Depot depot);
}
