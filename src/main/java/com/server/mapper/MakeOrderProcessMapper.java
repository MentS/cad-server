package com.server.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.server.entity.MakeOrderProcess;
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
 * @since 2019-12-26
 */
public interface MakeOrderProcessMapper extends BaseMapper<MakeOrderProcess> {

    List<Map<String, Object>> selectProcess(@Param("mcode") String m_code, @Param("bomid") Integer bomid);
}
