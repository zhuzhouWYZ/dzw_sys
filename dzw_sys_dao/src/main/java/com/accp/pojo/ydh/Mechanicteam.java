package com.accp.pojo.ydh;

public class Mechanicteam {
    private Integer tid;

    private Integer rescuebillid;

    private String tname;

    private Float tprice;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getRescuebillid() {
        return rescuebillid;
    }

    public void setRescuebillid(Integer rescuebillid) {
        this.rescuebillid = rescuebillid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Float getTprice() {
        return tprice;
    }

    public void setTprice(Float tprice) {
        this.tprice = tprice;
    }
}