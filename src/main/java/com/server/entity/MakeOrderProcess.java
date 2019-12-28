package com.server.entity;

import java.time.LocalDateTime;
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
 * @since 2019-12-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MakeOrderProcess implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer mp_MODid;

    private String mp_barcode;

    private Integer mp_itemno;

    private String mp_seq;

    private String mp_method;

    private String mp_department;

    private String mp_process;

    private Double mp_makedqty;

    private Double mp_beqty;

    private Integer mp_id;

    private Double mp_typesetqty;

    private Double mp_req_qty;

    private Double mp_stockqty;

    private Boolean mp_over;

    private Integer mp_sortondepart;

    private LocalDateTime mp_dueDay;

    private String mp_memo;

    private String mp_mac;

    private Double mp_AssignedQty;

    private LocalDateTime mp_starttime;

    private LocalDateTime mp_endtime;

    private Integer mp_status;

    private String mp_machineno;

    private Boolean mp_isready;

    private Double mp_usedqtynextp;

    private Double mp_singletimes;

    private Double mp_tottimes;

    private Double mp_repairqty;

    private Integer mp_repairmpid;

    private Double mp_Assignqty;

    private Boolean mp_typesetover;

    private Double mp_badqty;

    private Integer mp_prempid;


}
