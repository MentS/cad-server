package com.server.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author SH
 * @date 2019/9/23
 */

@Data
public class Cust implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId
    private String c_no;

    private String c_name;

    private String c_sname;

    private String c_fmaddr;

    private String c_deaddr;

    private String c_ivaddr;

    private String c_fmaddrcode;

    private String c_deaddrcode;

    private String c_ivaddrcode;

    private String c_ivfirm;

    private String c_bona;

    private String c_inna;

    private String c_intel;

    private String c_fmno;

    private String c_tel1;

    private String c_tel2;

    private String c_fax;

    private Double c_range;

    private String c_rank;

    private Date c_kndt;

    private String c_grade;

    private String c_email;

    private String c_memo;

    private String c_phon;

    private Byte c_recday;

    private Byte c_gatherday;

    private Boolean c_invalid;

    private Integer c_sort;

    private String c_operationarea;

    private String c_operationcode;

    private String c_invokind;

    private String c_oldno;

    private String c_rebateqtyno;

    private Integer c_id;

    private Integer c_salesid;

    private String c_custtype;

    private Date c_lastrecday;

    private String c_discount;

    private Boolean c_hasrebate;

    private String c_supno;

    private Integer c_letterAddress;

    private Integer c_checkterm;

    private String c_paymode;

    private Short c_notradeday;

    private Double c_usramt;

    private Integer aiid_accounts;

    private Integer aiid_notes;

    private Integer aiid_beforehand;

    private Integer c_NoRecAmtNum;

    private Boolean c_isbuild;

    private Date updatedt;

    private Date exportdt;

    private String c_picpath;

    private BigDecimal c_rate;

    private String c_paycondition;


}
