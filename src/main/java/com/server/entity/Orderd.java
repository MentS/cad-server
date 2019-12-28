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
public class Orderd implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer autono;

    private String o_code;

    private Integer o_status;

    private Integer itemno;

    private Integer itemno2;

    private LocalDateTime o_targetdate;

    private Float o_qty;

    private Float o_price;

    private Float o_amt;

    private String o_memo;

    private Float o_billqty;

    private Boolean o_over;

    private Integer o_bomid;

    private String o_bomlevel;

    private Integer o_bomparentid;

    private Integer o_bomlevels;

    private Integer o_bom_root_bom_id;

    private Boolean o_bom_hasChild;

    private Integer o_designer;

    private Integer o_sales;

    private Boolean o_needDesign;

    private Double o_makeOrderQty;

    private LocalDateTime o_startdesigntime;

    private LocalDateTime o_endesigntime;

    private String o_custFileNo;

    private Boolean o_ismaterial;

    private Double o_bomqty;

    private Integer o_designstatus;

    private String o_prodno_old;

    private Integer o_pid;

    private Boolean o_makeOrderChild;

    private String o_process;

    private String o_memo01;

    private String o_memo02;

    private String o_memo03;

    private String o_memo04;

    private String o_version;

    private Integer o_processid;

    private String o_quotecode;

    private Integer o_quoteautono;

    private Double o_width;

    private Double o_length;

    private Integer o_priceUnit;

    private Integer o_weightUnit;

    private Double o_singleWeight;

    private Double o_qtyWeight;

    private String o_NCcode;

    private String o_innerNO;

    private String o_torch;

    private String o_offerspec;

    private String o_repeat;

    private String o_usespec;

    private Double o_cutlength;

    private Double o_cuthole;

    private Double o_holeweight;

    private String o_machineno;

    private Integer o_priceid;

    private Float o_totalweight;

    private Float o_employRate;

    private Float o_holeEmploy;

    private Integer o_spareMaterial;

    private Double o_makedqty;

    private Boolean o_isPrize;

    private Boolean o_isbill;

    private Double o_isShape;

    private Integer o_bendimgid;

    private LocalDateTime o_designtargetdate;

    private Integer o_designprocessid;

    private String o_designprocess;

    private Double o_MakedNotInStock;

    private String itemno_ori;

    private Integer o_cyid;

    private Double o_cyrate;

    private Double o_cyprice;

    private Double o_cyamt;

    private Double o_prodprice;

    private Double o_proddsnt;

    private Float o_discountprice;

    private Float o_originalstock;

    private Double o_returnweight;

    private Double o_designTargetHH;

    private LocalDateTime o_designScheduleDate;

    private Double o_refprice;

    private Double o_refamt;


}
