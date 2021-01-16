package com.accp.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Statistics{
	private Integer stid;
	private String stname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date stdate;
	private Integer stcount;

	public Date getStdate() {
		return stdate;
	}
	public void setStdate(Date stdate) {
		this.stdate = stdate;
	}
	public Integer getStid(){
		return stid;
	}
	public void setStid(Integer stid){
		this.stid = stid;
	}
	public String getStname(){
		return stname;
	}
	public void setStname(String stname){
		this.stname = stname;
	}
	
	public Integer getStcount(){
		return stcount;
	}
	public void setStcount(Integer stcount){
		this.stcount = stcount;
	}
	public Statistics(){
		super();
	}
	
	
	public Statistics(String stname, Date stdate, Integer stcount) {
		super();
		this.stname = stname;
		this.stdate = stdate;
		this.stcount = stcount;
	}
	public Statistics(Integer stid,String stname,Date stdate,Integer stcount){
		super();
		this.stid = stid;
		this.stname = stname;
		this.stdate = stdate;
		this.stcount = stcount;
	}
}