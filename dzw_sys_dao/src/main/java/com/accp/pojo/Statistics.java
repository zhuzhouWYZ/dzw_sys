package com.accp.pojo;
public class Statistics{
	private Integer stid;
	private String stname;
	private String stdate;
	private Integer stcount;

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
	public String getStdate(){
		return stdate;
	}
	public void setStdate(String stdate){
		this.stdate = stdate;
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
	public Statistics(Integer stid,String stname,String stdate,Integer stcount){
		super();
		this.stid = stid;
		this.stname = stname;
		this.stdate = stdate;
		this.stcount = stcount;
	}
}