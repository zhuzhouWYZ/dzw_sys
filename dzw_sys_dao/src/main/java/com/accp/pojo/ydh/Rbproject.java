package com.accp.pojo.ydh;

public class Rbproject {
    private Integer rbprojectid;

    private Integer rescuebillid;

    private Integer tid;

    private Integer mnpricetypeid;

    private Integer repairbillid;

    private String employeeno;

    private Integer serviceitemid;

    private String rbprojectno;

    private Integer rbprojectsl;

    private String rbprojectms;

    private String rbprojectyy;

    private Float yprice;

    private Float yprices;

    private String nocharge;

    private Integer maintion;

    public Integer getRbprojectid() {
        return rbprojectid;
    }

    public void setRbprojectid(Integer rbprojectid) {
        this.rbprojectid = rbprojectid;
    }

    public Integer getRescuebillid() {
        return rescuebillid;
    }

    public void setRescuebillid(Integer rescuebillid) {
        this.rescuebillid = rescuebillid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getMnpricetypeid() {
        return mnpricetypeid;
    }

    public void setMnpricetypeid(Integer mnpricetypeid) {
        this.mnpricetypeid = mnpricetypeid;
    }

    public Integer getRepairbillid() {
        return repairbillid;
    }

    public void setRepairbillid(Integer repairbillid) {
        this.repairbillid = repairbillid;
    }

    public String getEmployeeno() {
        return employeeno;
    }

    public void setEmployeeno(String employeeno) {
        this.employeeno = employeeno == null ? null : employeeno.trim();
    }

    public Integer getServiceitemid() {
        return serviceitemid;
    }

    public void setServiceitemid(Integer serviceitemid) {
        this.serviceitemid = serviceitemid;
    }

    public String getRbprojectno() {
        return rbprojectno;
    }

    public void setRbprojectno(String rbprojectno) {
        this.rbprojectno = rbprojectno == null ? null : rbprojectno.trim();
    }

    public Integer getRbprojectsl() {
        return rbprojectsl;
    }

    public void setRbprojectsl(Integer rbprojectsl) {
        this.rbprojectsl = rbprojectsl;
    }

    public String getRbprojectms() {
        return rbprojectms;
    }

    public void setRbprojectms(String rbprojectms) {
        this.rbprojectms = rbprojectms == null ? null : rbprojectms.trim();
    }

    public String getRbprojectyy() {
        return rbprojectyy;
    }

    public void setRbprojectyy(String rbprojectyy) {
        this.rbprojectyy = rbprojectyy == null ? null : rbprojectyy.trim();
    }

    public Float getYprice() {
        return yprice;
    }

    public void setYprice(Float yprice) {
        this.yprice = yprice;
    }

    public Float getYprices() {
        return yprices;
    }

    public void setYprices(Float yprices) {
        this.yprices = yprices;
    }

    public String getNocharge() {
        return nocharge;
    }

    public void setNocharge(String nocharge) {
        this.nocharge = nocharge == null ? null : nocharge.trim();
    }

    public Integer getMaintion() {
        return maintion;
    }

    public void setMaintion(Integer maintion) {
        this.maintion = maintion;
    }
}