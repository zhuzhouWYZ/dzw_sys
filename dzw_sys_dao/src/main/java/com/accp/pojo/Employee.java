package com.accp.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Employee {
    private String employeeno;
    private Integer postid;
    private Integer jurisdictionid;

    private Integer departmentid;

    private String empname;

    private Integer esex;

    private String emplogenid;

    private String emplogepaw;

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
    @DateTimeFormat(pattern="yyyy-MM-dd")  //非常重要
	@JSONField(format="yyyy-MM-dd")
    private Date rztimes;
    @DateTimeFormat(pattern="yyyy-MM-dd")  //非常重要
	@JSONField(format="yyyy-MM-dd")
    private Date lztimes;
    @DateTimeFormat(pattern="yyyy-MM-dd")  //非常重要
	@JSONField(format="yyyy-MM-dd")
    private Date brithtimes;

    private Integer status;
    private Integer empmoney;
    
    public String getEmployeeno() {
        return employeeno;
    }

    public void setEmployeeno(String employeeno) {
        this.employeeno = employeeno == null ? null : employeeno.trim();
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
        this.empname = empname == null ? null : empname.trim();
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
        this.emplogenid = emplogenid == null ? null : emplogenid.trim();
    }

    public String getEmplogepaw() {
        return emplogepaw;
    }

    public void setEmplogepaw(String emplogepaw) {
        this.emplogepaw = emplogepaw == null ? null : emplogepaw.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getGraduationschool() {
        return graduationschool;
    }

    public void setGraduationschool(String graduationschool) {
        this.graduationschool = graduationschool == null ? null : graduationschool.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getNewaddress() {
        return newaddress;
    }

    public void setNewaddress(String newaddress) {
        this.newaddress = newaddress == null ? null : newaddress.trim();
    }

    public String getEmpphone() {
        return empphone;
    }

    public void setEmpphone(String empphone) {
        this.empphone = empphone == null ? null : empphone.trim();
    }

    public String getEmergencyphone() {
        return emergencyphone;
    }

    public void setEmergencyphone(String emergencyphone) {
        this.emergencyphone = emergencyphone == null ? null : emergencyphone.trim();
    }

    public String getMolphone() {
        return molphone;
    }

    public void setMolphone(String molphone) {
        this.molphone = molphone == null ? null : molphone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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

	public Integer getPostid() {
		return postid;
	}

	public void setPostid(Integer postid) {
		this.postid = postid;
	}

	public Integer getEmpmoney() {
		return empmoney;
	}

	public void setEmpmoney(Integer empmoney) {
		this.empmoney = empmoney;
	}

	@Override
	public String toString() {
		return "Employee [employeeno=" + employeeno + ", postid=" + postid + ", jurisdictionid=" + jurisdictionid
				+ ", departmentid=" + departmentid + ", empname=" + empname + ", esex=" + esex + ", emplogenid="
				+ emplogenid + ", emplogepaw=" + emplogepaw + ", education=" + education + ", graduationschool="
				+ graduationschool + ", major=" + major + ", idcard=" + idcard + ", address=" + address
				+ ", newaddress=" + newaddress + ", empphone=" + empphone + ", emergencyphone=" + emergencyphone
				+ ", molphone=" + molphone + ", email=" + email + ", rztimes=" + rztimes + ", lztimes=" + lztimes
				+ ", brithtimes=" + brithtimes + ", status=" + status + ", empmoney=" + empmoney + "]";
	}
    
}