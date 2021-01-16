package com.accp.pojo;

import java.util.Date;

public class Dimission {
    private Integer dimissionid;

    private String employeeno;

    private String dimreasona;

    private Date departuredate;

    public Integer getDimissionid() {
        return dimissionid;
    }

    public void setDimissionid(Integer dimissionid) {
        this.dimissionid = dimissionid;
    }

    public String getEmployeeno() {
        return employeeno;
    }

    public void setEmployeeno(String employeeno) {
        this.employeeno = employeeno == null ? null : employeeno.trim();
    }

    public String getDimreasona() {
        return dimreasona;
    }

    public void setDimreasona(String dimreasona) {
        this.dimreasona = dimreasona == null ? null : dimreasona.trim();
    }

    public Date getDeparturedate() {
        return departuredate;
    }

    public void setDeparturedate(Date departuredate) {
        this.departuredate = departuredate;
    }

	public Dimission() {
		super();
	}

	public Dimission(String employeeno, String dimreasona, Date departuredate) {
		super();
		this.employeeno = employeeno;
		this.dimreasona = dimreasona;
		this.departuredate = departuredate;
	}
    
    
}