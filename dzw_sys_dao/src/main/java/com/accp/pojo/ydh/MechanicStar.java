package com.accp.pojo.ydh;

public class MechanicStar {
    private Integer sid;

    private String sname;

    private Float sprice;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Float getSprice() {
        return sprice;
    }

    public void setSprice(Float sprice) {
        this.sprice = sprice;
    }
}