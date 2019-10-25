package com.server.entity;

import java.io.Serializable;

public class Depot implements Serializable {
    private String d_no;

    private String d_name;

    private String d_memo;

    private Boolean d_default;

    private Integer d_compid;

    private String d_no1;

    private String d_no2;

    private String d_no3;

    private static final long serialVersionUID = 1L;

    public String getD_no() {
        return d_no;
    }

    public Depot withD_no(String d_no) {
        this.setD_no(d_no);
        return this;
    }

    public void setD_no(String d_no) {
        this.d_no = d_no == null ? null : d_no.trim();
    }

    public String getD_name() {
        return d_name;
    }

    public Depot withD_name(String d_name) {
        this.setD_name(d_name);
        return this;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name == null ? null : d_name.trim();
    }

    public String getD_memo() {
        return d_memo;
    }

    public Depot withD_memo(String d_memo) {
        this.setD_memo(d_memo);
        return this;
    }

    public void setD_memo(String d_memo) {
        this.d_memo = d_memo == null ? null : d_memo.trim();
    }

    public Boolean getD_default() {
        return d_default;
    }

    public Depot withD_default(Boolean d_default) {
        this.setD_default(d_default);
        return this;
    }

    public void setD_default(Boolean d_default) {
        this.d_default = d_default;
    }

    public Integer getD_compid() {
        return d_compid;
    }

    public Depot withD_compid(Integer d_compid) {
        this.setD_compid(d_compid);
        return this;
    }

    public void setD_compid(Integer d_compid) {
        this.d_compid = d_compid;
    }

    public String getD_no1() {
        return d_no1;
    }

    public Depot withD_no1(String d_no1) {
        this.setD_no1(d_no1);
        return this;
    }

    public void setD_no1(String d_no1) {
        this.d_no1 = d_no1 == null ? null : d_no1.trim();
    }

    public String getD_no2() {
        return d_no2;
    }

    public Depot withD_no2(String d_no2) {
        this.setD_no2(d_no2);
        return this;
    }

    public void setD_no2(String d_no2) {
        this.d_no2 = d_no2 == null ? null : d_no2.trim();
    }

    public String getD_no3() {
        return d_no3;
    }

    public Depot withD_no3(String d_no3) {
        this.setD_no3(d_no3);
        return this;
    }

    public void setD_no3(String d_no3) {
        this.d_no3 = d_no3 == null ? null : d_no3.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", d_no=").append(d_no);
        sb.append(", d_name=").append(d_name);
        sb.append(", d_memo=").append(d_memo);
        sb.append(", d_default=").append(d_default);
        sb.append(", d_compid=").append(d_compid);
        sb.append(", d_no1=").append(d_no1);
        sb.append(", d_no2=").append(d_no2);
        sb.append(", d_no3=").append(d_no3);
        sb.append("]");
        return sb.toString();
    }
}