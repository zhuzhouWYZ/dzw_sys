package com.accp.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Employee{
	private String employeeno;
	private Integer postid; 
	private Integer jurisdictionid;
	private Integer departmentid;
	private String empname;
	private Integer esex;
	private String emplogenid;//登录名
	private String emplogepaw;//密码
	private String education;
	private String graduationschool;
	private String major;
	private String idcard;
	private String address;
	private String newaddress;
	private String empphone;
	private String emergencyphone;
	private String molphone;
	private String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date rztimes;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date lztimes;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date brithtimes;
	private Integer status;
	private Integer empmoney;
	
	private Jurisdiction jurisdiction;//角色信息
	
	
	

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public Integer getEmpmoney() {
		return empmoney;
	}

	public void setEmpmoney(Integer empmoney) {
		this.empmoney = empmoney;
	}

	public Employee(String employeeno, String empname, String emplogenid, String emplogepaw, Integer status,
			Jurisdiction jurisdiction) {
		super();
		this.employeeno = employeeno;
		this.empname = empname;
		this.emplogenid = emplogenid;
		this.emplogepaw = emplogepaw;
		this.status = status;
		this.jurisdiction = jurisdiction;
	}

	public Employee() {
		super();
	}

	public String getEmployeeno() {
		return employeeno;
	}

	public void setEmployeeno(String employeeno) {
		this.employeeno = employeeno;
	}

	public Integer getPostid() {
		return postid;
	}

	public void setPostid(Integer postid) {
		this.postid = postid;
	}

	public Integer getJurisdictionid() {
		return jurisdictionid;
	}

	public void setJurisdictionid(Integer jurisdictionid) {
		this.jurisdictionid = jurisdictionid;
	}

	public Integer getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Integer getEsex() {
		return esex;
	}

	public void setEsex(Integer esex) {
		this.esex = esex;
	}

	public String getEmplogenid() {
		return emplogenid;
	}

	public void setEmplogenid(String emplogenid) {
		this.emplogenid = emplogenid;
	}

	public String getEmplogepaw() {
		return emplogepaw;
	}

	public void setEmplogepaw(String emplogepaw) {
		this.emplogepaw = emplogepaw;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getGraduationschool() {
		return graduationschool;
	}

	public void setGraduationschool(String graduationschool) {
		this.graduationschool = graduationschool;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNewaddress() {
		return newaddress;
	}

	public void setNewaddress(String newaddress) {
		this.newaddress = newaddress;
	}

	public String getEmpphone() {
		return empphone;
	}

	public void setEmpphone(String empphone) {
		this.empphone = empphone;
	}

	public String getEmergencyphone() {
		return emergencyphone;
	}

	public void setEmergencyphone(String emergencyphone) {
		this.emergencyphone = emergencyphone;
	}

	public String getMolphone() {
		return molphone;
	}

	public void setMolphone(String molphone) {
		this.molphone = molphone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getRztimes() {
		return rztimes;
	}

	public void setRztimes(Date rztimes) {
		this.rztimes = rztimes;
	}

	public Date getLztimes() {
		return lztimes;
	}

	public void setLztimes(Date lztimes) {
		this.lztimes = lztimes;
	}

	public Date getBrithtimes() {
		return brithtimes;
	}

	public void setBrithtimes(Date brithtimes) {
		this.brithtimes = brithtimes;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Jurisdiction getJurisdiction() {
		return jurisdiction;
	}

	public void setJurisdiction(Jurisdiction jurisdiction) {
		this.jurisdiction = jurisdiction;
	}
	
	
	
	
}