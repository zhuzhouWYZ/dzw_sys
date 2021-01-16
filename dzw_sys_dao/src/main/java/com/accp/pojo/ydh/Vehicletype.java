package com.accp.pojo.ydh;

import java.util.Date;

public class Vehicletype {
    private Integer vtypeid;

    private Integer enginetypeid;

    private String vtypeno;

    private String vtypename;

    private Float veprice;

    private Date vdate;

    private Integer vpower;

    private String fuelmark;

    public Integer getVtypeid() {
        return vtypeid;
    }

    public void setVtypeid(Integer vtypeid) {
        this.vtypeid = vtypeid;
    }

    public Integer getEnginetypeid() {
        return enginetypeid;
    }

    public void setEnginetypeid(Integer enginetypeid) {
        this.enginetypeid = enginetypeid;
    }

    public String getVtypeno() {
        return vtypeno;
    }

    public void setVtypeno(String vtypeno) {
        this.vtypeno = vtypeno == null ? null : vtypeno.trim();
    }

    public String getVtypename() {
        return vtypename;
    }

    public void setVtypename(String vtypename) {
        this.vtypename = vtypename == null ? null : vtypename.trim();
    }

    public Float getVeprice() {
        return veprice;
    }

    public void setVeprice(Float veprice) {
        this.veprice = veprice;
    }

    public Date getVdate() {
        return vdate;
    }

    public void setVdate(Date vdate) {
        this.vdate = vdate;
    }

    public Integer getVpower() {
        return vpower;
    }

    public void setVpower(Integer vpower) {
        this.vpower = vpower;
    }

    public String getFuelmark() {
        return fuelmark;
    }

    public void setFuelmark(String fuelmark) {
        this.fuelmark = fuelmark == null ? null : fuelmark.trim();
    }
}