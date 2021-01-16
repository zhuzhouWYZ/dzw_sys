package com.accp.pojo.ydh;

import java.util.Date;

public class RepairBill {
    private Integer repairbillid;

    private Integer uvehicleid;

    private Integer mid;

    private Integer serviceitid;

    private Integer csid;

    private Integer servicestatusid;

    private String maintiontype;

    private Date repairbilldate;

    private Date repairbilldated;

    private Date repairbilldates;

    private String receptionnote;

    private String statement;

    private String redriverphone;

    private Double totalmoney;

    private Integer userid;

    public Integer getRepairbillid() {
        return repairbillid;
    }

    public void setRepairbillid(Integer repairbillid) {
        this.repairbillid = repairbillid;
    }

    public Integer getUvehicleid() {
        return uvehicleid;
    }

    public void setUvehicleid(Integer uvehicleid) {
        this.uvehicleid = uvehicleid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getServiceitid() {
        return serviceitid;
    }

    public void setServiceitid(Integer serviceitid) {
        this.serviceitid = serviceitid;
    }

    public Integer getCsid() {
        return csid;
    }

    public void setCsid(Integer csid) {
        this.csid = csid;
    }

    public Integer getServicestatusid() {
        return servicestatusid;
    }

    public void setServicestatusid(Integer servicestatusid) {
        this.servicestatusid = servicestatusid;
    }

    public String getMaintiontype() {
        return maintiontype;
    }

    public void setMaintiontype(String maintiontype) {
        this.maintiontype = maintiontype == null ? null : maintiontype.trim();
    }

    public Date getRepairbilldate() {
        return repairbilldate;
    }

    public void setRepairbilldate(Date repairbilldate) {
        this.repairbilldate = repairbilldate;
    }

    public Date getRepairbilldated() {
        return repairbilldated;
    }

    public void setRepairbilldated(Date repairbilldated) {
        this.repairbilldated = repairbilldated;
    }

    public Date getRepairbilldates() {
        return repairbilldates;
    }

    public void setRepairbilldates(Date repairbilldates) {
        this.repairbilldates = repairbilldates;
    }

    public String getReceptionnote() {
        return receptionnote;
    }

    public void setReceptionnote(String receptionnote) {
        this.receptionnote = receptionnote == null ? null : receptionnote.trim();
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement == null ? null : statement.trim();
    }

    public String getRedriverphone() {
        return redriverphone;
    }

    public void setRedriverphone(String redriverphone) {
        this.redriverphone = redriverphone == null ? null : redriverphone.trim();
    }

    public Double getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Double totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}