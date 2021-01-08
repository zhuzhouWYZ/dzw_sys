package com.accp.pojo.ydh;

import java.util.Date;

public class Settleaccounts {
    private Integer csid;

    private String employeeno;

    private Integer repairbillid;

    private Integer rescuebillid;

    private String cssettleno;

    private Date cstime;

    private Integer cssum;

    private Float csdiscount;

    private Float cscloseprice;

    private Float csmaterialspr;

    private Float csmanhourpr;

    private Float csadditionpr;

    private String csremakes;

    public Integer getCsid() {
        return csid;
    }

    public void setCsid(Integer csid) {
        this.csid = csid;
    }

    public String getEmployeeno() {
        return employeeno;
    }

    public void setEmployeeno(String employeeno) {
        this.employeeno = employeeno == null ? null : employeeno.trim();
    }

    public Integer getRepairbillid() {
        return repairbillid;
    }

    public void setRepairbillid(Integer repairbillid) {
        this.repairbillid = repairbillid;
    }

    public Integer getRescuebillid() {
        return rescuebillid;
    }

    public void setRescuebillid(Integer rescuebillid) {
        this.rescuebillid = rescuebillid;
    }

    public String getCssettleno() {
        return cssettleno;
    }

    public void setCssettleno(String cssettleno) {
        this.cssettleno = cssettleno == null ? null : cssettleno.trim();
    }

    public Date getCstime() {
        return cstime;
    }

    public void setCstime(Date cstime) {
        this.cstime = cstime;
    }

    public Integer getCssum() {
        return cssum;
    }

    public void setCssum(Integer cssum) {
        this.cssum = cssum;
    }

    public Float getCsdiscount() {
        return csdiscount;
    }

    public void setCsdiscount(Float csdiscount) {
        this.csdiscount = csdiscount;
    }

    public Float getCscloseprice() {
        return cscloseprice;
    }

    public void setCscloseprice(Float cscloseprice) {
        this.cscloseprice = cscloseprice;
    }

    public Float getCsmaterialspr() {
        return csmaterialspr;
    }

    public void setCsmaterialspr(Float csmaterialspr) {
        this.csmaterialspr = csmaterialspr;
    }

    public Float getCsmanhourpr() {
        return csmanhourpr;
    }

    public void setCsmanhourpr(Float csmanhourpr) {
        this.csmanhourpr = csmanhourpr;
    }

    public Float getCsadditionpr() {
        return csadditionpr;
    }

    public void setCsadditionpr(Float csadditionpr) {
        this.csadditionpr = csadditionpr;
    }

    public String getCsremakes() {
        return csremakes;
    }

    public void setCsremakes(String csremakes) {
        this.csremakes = csremakes == null ? null : csremakes.trim();
    }
}