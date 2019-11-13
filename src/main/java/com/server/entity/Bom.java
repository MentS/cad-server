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
public class Bom implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer b_id;

    private Integer b_prodid;

    private Double b_qty;

    private Integer b_parentBomId;

    private String b_description;

    private Integer b_fineno;

    private Double b_price;

    private Integer b_priceID;

    private Integer b_processID;

    private String b_process;

    private String b_material;

    private Double b_width;

    private String b_MfrDetail;

    private String b_Surface;

    private String b_PicFileName;

    private String b_color;

    private Integer b_standBuildTime;

    private String b_maincolor;

    private Boolean b_isPointweld;

    private String b_isProd;

    private String b_isAttach;

    private Boolean b_isMRP;

    private Boolean b_isFetchDraw;

    private String b_note1;

    private String b_note2;

    private String b_note3;

    private String b_note4;

    private String b_note5;

    private String b_note6;

    private String b_note7;

    private String b_note8;

    private String b_note9;

    private String b_note10;

    private String b_reqProcess;

    private Boolean b_isMaterial;


}
