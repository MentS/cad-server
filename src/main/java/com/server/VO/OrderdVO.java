package com.server.VO;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author SH
 * @since 2019-12-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OrderdVO implements Serializable {

    private static final long serialVersionUID = 1L;


    private String o_code;

    private String m_code;

    private String o_prodno;

    private String P_name;

    private Timestamp o_targetdate;

    private String overduedays;

    private Integer o_status;

    private String c_sname;

    private Float o_qty;

    private Integer o_bomid;

    private String o_process;

    private List<Map<String,Object>> children;



}
