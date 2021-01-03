package com.accp.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Jurisdiction{
	private int jurisdictionid;//角色编号
	private String jurisdictionname;//角色名
	private String jurisdictioncode;//角色编码
	private int jurstatus;//角色状态

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private String createdate;//角色创建日期
	private String createby;//角色创建人

	public int getJurisdictionid(){
		return jurisdictionid;
	}
	public void setJurisdictionid(int jurisdictionid){
		this.jurisdictionid = jurisdictionid;
	}
	public String getJurisdictionname(){
		return jurisdictionname;
	}
	public void setJurisdictionname(String jurisdictionname){
		this.jurisdictionname = jurisdictionname;
	}
	public String getJurisdictioncode(){
		return jurisdictioncode;
	}
	public void setJurisdictioncode(String jurisdictioncode){
		this.jurisdictioncode = jurisdictioncode;
	}
	public int getJurstatus(){
		return jurstatus;
	}
	public void setJurstatus(int jurstatus){
		this.jurstatus = jurstatus;
	}
	public String getCreatedate(){
		return createdate;
	}
	public void setCreatedate(String createdate){
		this.createdate = createdate;
	}
	public String getCreateby(){
		return createby;
	}
	public void setCreateby(String createby){
		this.createby = createby;
	}
	public Jurisdiction(){
		super();
	}
	public Jurisdiction(int jurisdictionid,String jurisdictionname,String jurisdictioncode,int jurstatus,String createdate,String createby){
		super();
		this.jurisdictionid = jurisdictionid;
		this.jurisdictionname = jurisdictionname;
		this.jurisdictioncode = jurisdictioncode;
		this.jurstatus = jurstatus;
		this.createdate = createdate;
		this.createby = createby;
	}
}