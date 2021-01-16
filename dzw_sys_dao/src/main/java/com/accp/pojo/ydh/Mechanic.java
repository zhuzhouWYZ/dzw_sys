package com.accp.pojo.ydh;

import java.util.Date;

public class Mechanic {
    private Integer mid;

    private Integer mcstatusid;

    private Integer tid;

    private Integer sid;

    private String mname;

    private Integer mprice;

    private Date mtime;

    private Integer mstar;

    private Integer mstatus;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getMcstatusid() {
        return mcstatusid;
    }

    public void setMcstatusid(Integer mcstatusid) {
        this.mcstatusid = mcstatusid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public Integer getMprice() {
        return mprice;
    }

    public void setMprice(Integer mprice) {
        this.mprice = mprice;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    public Integer getMstar() {
        return mstar;
    }

    public void setMstar(Integer mstar) {
        this.mstar = mstar;
    }

    public Integer getMstatus() {
        return mstatus;
    }

    public void setMstatus(Integer mstatus) {
        this.mstatus = mstatus;
    }
}