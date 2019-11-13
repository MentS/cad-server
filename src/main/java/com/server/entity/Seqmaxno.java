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
public class Seqmaxno implements Serializable {

    private static final long serialVersionUID = 1L;

    private String s_tbname;

    private Integer s_maxno;


}
