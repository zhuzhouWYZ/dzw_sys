package com.accp.pojo.ydh;

public class FieldStatus {
    private Integer fstatusid;

    private String fstatusname;

    public Integer getFstatusid() {
        return fstatusid;
    }

    public void setFstatusid(Integer fstatusid) {
        this.fstatusid = fstatusid;
    }

    public String getFstatusname() {
        return fstatusname;
    }

    public void setFstatusname(String fstatusname) {
        this.fstatusname = fstatusname == null ? null : fstatusname.trim();
    }
}