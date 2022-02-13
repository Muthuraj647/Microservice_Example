package com.muthu.sampleProject.Microservices_User.Entity;

public class Department {

	private int id;
	
	private String departmentName;
	
	private String departmentCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public Department(String departmentName, String departmentCode) {
		super();
		this.departmentName = departmentName;
		this.departmentCode = departmentCode;
	}

	public Department() {
		super();
	}
	
	
}


