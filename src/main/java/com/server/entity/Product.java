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
 * @since 2019-10-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private String p_no;

    private String p_spec;

    private Integer p_unitid;

    private Integer p_kindid;

    private String p_phon;

    private Boolean p_invalid;

    private Integer p_sort;

    private Integer p_id;

    private String p_memo;

    private String p_material;

    private Double p_length;

    private Double p_height;

    private Double p_width;

    private String p_size;

    private String p_pricekind;

    private Integer p_priceUnitid;

    private String p_brand;

    private String p_PicFileName;

    private Integer p_imgId;

    private Double p_price;

    private Integer p_bomid;

    private Double p_cost;

    private String p_location;

    private String p_goodtype;

    private Float p_stock;

    private String p_suppmaterialno;

    private String p_name_old;

    private String p_name;

    private String p_custfileno;

    private String p_mfrnote;

    private String p_pricemode;

    private String p_stockmode;

    private Float p_unitweight;

    private Double p_minpurqty;

    private String p_memo2;

    private Boolean p_isReportPrice;

    private LocalDateTime p_receivePic;

    private LocalDateTime p_createday;

    private String p_depotNo;

    private LocalDateTime p_lastday;

    private Integer p_aiid;

    private Integer p_desingimg;

    private String p_version;

    private Double p_avecost;

    private Double p_bomcost;

    private String p_QualityFilepath;

    private String p_NCcode;

    private String p_torch;

    private String p_repeat;

    private String p_invpdname;

    private Integer p_inovprodid;

    private String p_usespec;

    private String p_designmemo;

    private String p_mfrmemo;

    private Double p_realweight;

    private String p_machinekind;

    private Integer p_tempid;

    private String p_custpicfilepath;

    private String p_file;

    private String p_PicFileName2;

    private Integer p_custid;

    private Double p_cyprice;

    private Integer p_3DImageID;

    private Integer p_ditch;

    private Integer p_templenimgid;

    private Integer p_tempwidthimgid;

    private Integer p_widthtempid;

    private Double p_radius;

    private Double p_diameter;

    private String p_storage;

    private String p_surfacenature;

    private Double p_badrate;

    private Boolean p_isCoiledMaterial;


}
