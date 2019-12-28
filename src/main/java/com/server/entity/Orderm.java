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
 * @since 2019-12-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Orderm implements Serializable {

    private static final long serialVersionUID = 1L;

    private String o_code;

    private LocalDateTime o_date;

    private String o_custno;

    private String o_custbillcode;

    private String o_user;

    private LocalDateTime o_targetdate;

    private String o_invokind;

    private Boolean o_hastax;

    private Float o_detailamt;

    private Float o_taxamt;

    private Float o_totamt;

    private Float o_earnest;

    private String o_memo;

    private Boolean o_invalid;

    private Boolean o_over;

    private LocalDateTime updatedt;

    private Boolean islocked;

    private Integer lockedid;

    private String o_deliveryAddr;

    private Integer o_subCustid;

    private String o_type;

    private String o_coderefer;

    private LocalDateTime o_billdate;

    private String o_billyymm;

    private String o_reccode;

    private String acc_vounotemp;

    private String acc_vouno;

    private Boolean acc_need2voutemp;

    private Boolean o_iscase;

    private Integer compid;

    private String o_inna;

    private String o_shapespec;

    private String o_bomno;

    private String o_makeno;

    private Integer o_salesperson;

    private Double o_sumweight;

    private Double o_totalweightDecimal;

    private String o_memo2;

    private Float o_notaxamt;

    private String o_delivery;

    private Integer o_assistantid;

    private LocalDateTime o_custbilldate;

    private String o_planyymm;

    private Integer o_cyid;

    private Double o_cyrate;

    private Double o_cyamt;

    private Double o_laserdiscount;

    private String o_processmemo;

    private Integer o_processsort;

    private String O_RNS_SYM;

    private String o_correlationfile;

    private Double o_custdiscount;

    private String o_checker;

    private String o_memo3;

    private Boolean o_urgent;

    private Double o_rate;


}
