package com.server.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author SH
 * @since 2019-10-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BOM_Process implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer bp_id;

    private Integer bp_itemid;

    private Integer bp_no;

    private String bp_process;

    private String bp_department;

    private String bp_method;

    private String bp_seq;

    private Double bp_cost;

    private Double bp_standardtime;

    private Double bp_mm;

    private String bp_memo;

    private Double bp_unitcapacity;

    private Double bp_preworktime;

    private Integer bp_strokes;

    private Boolean bp_istransfer;


}
