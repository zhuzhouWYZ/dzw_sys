package com.accp.pojo.ydh;

public class MechanicStatus {
    private Integer mcstatusid;

    private String mcstatusname;

    public Integer getMcstatusid() {
        return mcstatusid;
    }

    public void setMcstatusid(Integer mcstatusid) {
        this.mcstatusid = mcstatusid;
    }

    public String getMcstatusname() {
        return mcstatusname;
    }

    public void setMcstatusname(String mcstatusname) {
        this.mcstatusname = mcstatusname == null ? null : mcstatusname.trim();
    }
}