package com.accp.pojo;

public class Department {
	private Integer departmentid;//部门id
	
	private String depnames;//部门名称

	public Integer getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}

	public String getDepnames() {
		return depnames;
	}

	public void setDepnames(String depnames) {
		this.depnames = depnames;
	}

	@Override
	public String toString() {
		return "Department [departmentid=" + departmentid + ", depnames=" + depnames + "]";
	}
	
	
		
}
