package com.server.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

@Data
public class Prodstock implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private Integer p_id;

    private String p_depotno;

    private String p_mpno;

    private String p_supno;

    private Double p_stock;

    private Double p_orderdemand;

    private Double p_makedemand;

    private Double p_purchaseqty;

    private Double p_supplystock;

    private Double p_safetystock;




}