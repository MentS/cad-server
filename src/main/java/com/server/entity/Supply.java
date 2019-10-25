package com.server.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author SH
 * @since 2019-09-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Supply implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private String s_no;

    private String s_name;

    private String s_fmaddr;

    private String s_ivaddr;

    private String s_fmaddrcode;

    private String s_ivaddrcode;

    private String s_ivfirm;

    private String s_bona;

    private String s_inna;

    private String s_intel;

    private String s_fmno;

    private String s_tel1;

    private String s_tel2;

    private String s_fax;

    private Float s_rang;

    private String s_rank;

    private Date s_kndt;

    private String s_grade;

    private String s_memo;

    private String s_sname;

    private String s_phon;

    private Integer s_recday;

    private Boolean s_invalid;

    private Integer s_sort;

    private Integer s_checkday;

    private String s_oldno;

    private String s_invokind;

    private Date s_lastrecday;

    private String s_makeprocess;

    private String s_note;

    private String s_email;

    private String s_url;

    private Float s_pfpamt;

    private Integer aiid_accounts;

    private Integer aiid_notes;

    private Integer aiid_beforehand;

    private Boolean s_isdeliver;

    private String s_paycondition;

    private Boolean s_isbuild;

    private Date updatedt;

    private Date exportdt;

    private Integer s_checkmonth;

    private Integer s_id;

    private Double s_rate;


}
