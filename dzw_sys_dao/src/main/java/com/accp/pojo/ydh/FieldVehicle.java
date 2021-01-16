package com.accp.pojo.ydh;

public class FieldVehicle {
    private Integer fvid;

    private Integer tid;

    private Integer fstatusid;

    private Integer vtypeid;

    private String fvname;

    private String fvmileage;

    private Float fvpprices;

    public Integer getFvid() {
        return fvid;
    }

    public void setFvid(Integer fvid) {
        this.fvid = fvid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getFstatusid() {
        return fstatusid;
    }

    public void setFstatusid(Integer fstatusid) {
        this.fstatusid = fstatusid;
    }

    public Integer getVtypeid() {
        return vtypeid;
    }

    public void setVtypeid(Integer vtypeid) {
        this.vtypeid = vtypeid;
    }

    public String getFvname() {
        return fvname;
    }

    public void setFvname(String fvname) {
        this.fvname = fvname == null ? null : fvname.trim();
    }

    public String getFvmileage() {
        return fvmileage;
    }

    public void setFvmileage(String fvmileage) {
        this.fvmileage = fvmileage == null ? null : fvmileage.trim();
    }

    public Float getFvpprices() {
        return fvpprices;
    }

    public void setFvpprices(Float fvpprices) {
        this.fvpprices = fvpprices;
    }
}