package com.accp.pojo;

public class Department {
	private Integer departmentid;//����id
	
	private String depnames;//��������

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
