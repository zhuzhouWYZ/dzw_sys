package com.accp.pojo;

import java.util.Date;

public class Jurisdiction {
    private Integer jurisdictionid;

    private String jurisdictionname;

    private String jurisdictioncode;

    private Integer jurstatus;

    private Date createdate;

    private String createby;

    public Integer getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(Integer jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
    }

    public String getJurisdictionname() {
        return jurisdictionname;
    }

    public void setJurisdictionname(String jurisdictionname) {
        this.jurisdictionname = jurisdictionname == null ? null : jurisdictionname.trim();
    }

    public String getJurisdictioncode() {
        return jurisdictioncode;
    }

    public void setJurisdictioncode(String jurisdictioncode) {
        this.jurisdictioncode = jurisdictioncode == null ? null : jurisdictioncode.trim();
    }

    public Integer getJurstatus() {
        return jurstatus;
    }

    public void setJurstatus(Integer jurstatus) {
        this.jurstatus = jurstatus;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }
}