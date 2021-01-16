package com.accp.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Syslog{
	private Integer id;
	private String  user_id;
	private String user_action;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private String create_time;

	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_action(){
		return user_action;
	}
	public void setUser_action(String user_action){
		this.user_action = user_action;
	}
	public String getCreate_time(){
		return create_time;
	}
	public void setCreate_time(String create_time){
		this.create_time = create_time;
	}
	public Syslog(){
		super();
	}
	public Syslog(Integer id,String  user_id,String user_action,String create_time){
		super();
		this.id = id;
		this.user_id = user_id;
		this.user_action = user_action;
		this.create_time = create_time;
	}
}