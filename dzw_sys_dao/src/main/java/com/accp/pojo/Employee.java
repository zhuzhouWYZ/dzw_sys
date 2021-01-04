package com.accp.pojo;
public class Employee{
	private String employeeno;
	private int jurisdictionid;
	private int departmentid;
	private String empname;
	private int esex;
	private String emplogenid;
	private String emplogepaw;
	private String education;
	private String graduationschool;
	private String major;
	private String IDcard;
	private String address;
	private String newaddress;
	private String empphone;
	private String emergencyphone;
	private String molphone;
	private String email;
	private String rztimes;
	private String lztimes;
	private String brithtimes;
	private int status;

	public String getEmployeeno(){
		return employeeno;
	}
	public void setEmployeeno(String employeeno){
		this.employeeno = employeeno;
	}
	public int getJurisdictionid(){
		return jurisdictionid;
	}
	public void setJurisdictionid(int jurisdictionid){
		this.jurisdictionid = jurisdictionid;
	}
	public int getDepartmentid(){
		return departmentid;
	}
	public void setDepartmentid(int departmentid){
		this.departmentid = departmentid;
	}
	public String getEmpname(){
		return empname;
	}
	public void setEmpname(String empname){
		this.empname = empname;
	}
	public int getEsex(){
		return esex;
	}
	public void setEsex(int esex){
		this.esex = esex;
	}
	public String getEmplogenid(){
		return emplogenid;
	}
	public void setEmplogenid(String emplogenid){
		this.emplogenid = emplogenid;
	}
	public String getEmplogepaw(){
		return emplogepaw;
	}
	public void setEmplogepaw(String emplogepaw){
		this.emplogepaw = emplogepaw;
	}
	public String getEducation(){
		return education;
	}
	public void setEducation(String education){
		this.education = education;
	}
	public String getGraduationschool(){
		return graduationschool;
	}
	public void setGraduationschool(String graduationschool){
		this.graduationschool = graduationschool;
	}
	public String getMajor(){
		return major;
	}
	public void setMajor(String major){
		this.major = major;
	}
	public String getIDcard(){
		return IDcard;
	}
	public void setIDcard(String IDcard){
		this.IDcard = IDcard;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getNewaddress(){
		return newaddress;
	}
	public void setNewaddress(String newaddress){
		this.newaddress = newaddress;
	}
	public String getEmpphone(){
		return empphone;
	}
	public void setEmpphone(String empphone){
		this.empphone = empphone;
	}
	public String getEmergencyphone(){
		return emergencyphone;
	}
	public void setEmergencyphone(String emergencyphone){
		this.emergencyphone = emergencyphone;
	}
	public String getMolphone(){
		return molphone;
	}
	public void setMolphone(String molphone){
		this.molphone = molphone;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getRztimes(){
		return rztimes;
	}
	public void setRztimes(String rztimes){
		this.rztimes = rztimes;
	}
	public String getLztimes(){
		return lztimes;
	}
	public void setLztimes(String lztimes){
		this.lztimes = lztimes;
	}
	public String getBrithtimes(){
		return brithtimes;
	}
	public void setBrithtimes(String brithtimes){
		this.brithtimes = brithtimes;
	}
	public int getStatus(){
		return status;
	}
	public void setStatus(int status){
		this.status = status;
	}
	public Employee(){
		super();
	}
	public Employee(String employeeno,int jurisdictionid,int departmentid,String empname,int esex,String emplogenid,String emplogepaw,String education,String graduationschool,String major,String IDcard,String address,String newaddress,String empphone,String emergencyphone,String molphone,String email,String rztimes,String lztimes,String brithtimes,int status){
		super();
		this.employeeno = employeeno;
		this.jurisdictionid = jurisdictionid;
		this.departmentid = departmentid;
		this.empname = empname;
		this.esex = esex;
		this.emplogenid = emplogenid;
		this.emplogepaw = emplogepaw;
		this.education = education;
		this.graduationschool = graduationschool;
		this.major = major;
		this.IDcard = IDcard;
		this.address = address;
		this.newaddress = newaddress;
		this.empphone = empphone;
		this.emergencyphone = emergencyphone;
		this.molphone = molphone;
		this.email = email;
		this.rztimes = rztimes;
		this.lztimes = lztimes;
		this.brithtimes = brithtimes;
		this.status = status;
	}
}