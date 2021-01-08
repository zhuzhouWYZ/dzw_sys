package com.accp.pojo;
public class Qxconnect{
	private Integer qxconnectid;
	private Integer jurisdictionid;
	private Integer syfunctionid;
	private String creatdate;
	private String createby;

	public Integer getQxconnectid(){
		return qxconnectid;
	}
	public void setQxconnectid(Integer qxconnectid){
		this.qxconnectid = qxconnectid;
	}
	public Integer getJurisdictionid(){
		return jurisdictionid;
	}
	public void setJurisdictionid(Integer jurisdictionid){
		this.jurisdictionid = jurisdictionid;
	}
	public Integer getSyfunctionid(){
		return syfunctionid;
	}
	public void setSyfunctionid(Integer syfunctionid){
		this.syfunctionid = syfunctionid;
	}
	public String getCreatdate(){
		return creatdate;
	}
	public void setCreatdate(String creatdate){
		this.creatdate = creatdate;
	}
	public String getCreateby(){
		return createby;
	}
	public void setCreateby(String createby){
		this.createby = createby;
	}
	public Qxconnect(){
		super();
	}
	public Qxconnect(Integer qxconnectid,Integer jurisdictionid,Integer syfunctionid,String creatdate,String createby){
		super();
		this.qxconnectid = qxconnectid;
		this.jurisdictionid = jurisdictionid;
		this.syfunctionid = syfunctionid;
		this.creatdate = creatdate;
		this.createby = createby;
	}
}