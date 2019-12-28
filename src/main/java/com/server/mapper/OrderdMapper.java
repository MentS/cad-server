package com.server.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.server.entity.Orderd;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.server.VO.OrderdVO;

import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author SH
 * @since 2019-12-27
 */
public interface OrderdMapper extends BaseMapper<Orderd> {

    IPage<Map<String, Object>> selectList(Page page);

    IPage<OrderdVO> test(Page page);
}
