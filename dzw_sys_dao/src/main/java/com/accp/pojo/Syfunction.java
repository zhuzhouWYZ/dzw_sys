package com.accp.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Syfunction{
	private Integer syfunctionid;
	private String syfunctionname;
	private String syfunctioncode;
	private Integer uplv;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private String createdate;
	
	private Syfunction parentSyfun;
	
	

	public Syfunction(Integer syfunctionid, String syfunctionname, String syfunctioncode, Integer uplv,
			String createdate, Syfunction parentSyfun) {
		super();
		this.syfunctionid = syfunctionid;
		this.syfunctionname = syfunctionname;
		this.syfunctioncode = syfunctioncode;
		this.uplv = uplv;
		this.createdate = createdate;
		this.parentSyfun = parentSyfun;
	}
	public Syfunction(Integer syfunctionid, String syfunctionname, String syfunctioncode, String createdate,
			Syfunction parentSyfun) {
		super();
		this.syfunctionid = syfunctionid;
		this.syfunctionname = syfunctionname;
		this.syfunctioncode = syfunctioncode;
		this.createdate = createdate;
		this.parentSyfun = parentSyfun;
	}
	public Syfunction getParentSyfun() {
		return parentSyfun;
	}
	public void setParentSyfun(Syfunction parentSyfun) {
		this.parentSyfun = parentSyfun;
	}
	public Integer getSyfunctionid(){
		return syfunctionid;
	}
	public void setSyfunctionid(Integer syfunctionid){
		this.syfunctionid = syfunctionid;
	}
	public String getSyfunctionname(){
		return syfunctionname;
	}
	public void setSyfunctionname(String syfunctionname){
		this.syfunctionname = syfunctionname;
	}
	public String getSyfunctioncode(){
		return syfunctioncode;
	}
	public void setSyfunctioncode(String syfunctioncode){
		this.syfunctioncode = syfunctioncode;
	}
	public Integer getUplv(){
		return uplv;
	}
	public void setUplv(Integer uplv){
		this.uplv = uplv;
	}
	public String getCreatedate(){
		return createdate;
	}
	public void setCreatedate(String createdate){
		this.createdate = createdate;
	}
	public Syfunction(){
		super();
	}
	public Syfunction(Integer syfunctionid,String syfunctionname,String syfunctioncode,Integer uplv,String createdate){
		super();
		this.syfunctionid = syfunctionid;
		this.syfunctionname = syfunctionname;
		this.syfunctioncode = syfunctioncode;
		this.uplv = uplv;
		this.createdate = createdate;
	}
}