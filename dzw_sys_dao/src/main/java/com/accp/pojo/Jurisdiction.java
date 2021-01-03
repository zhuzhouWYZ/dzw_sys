package com.accp.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Jurisdiction{
	private int jurisdictionid;//��ɫ���
	private String jurisdictionname;//��ɫ��
	private String jurisdictioncode;//��ɫ����
	private int jurstatus;//��ɫ״̬

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private String createdate;//��ɫ��������
	private String createby;//��ɫ������

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