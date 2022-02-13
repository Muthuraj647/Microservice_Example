package com.muthu.sampleProject.Microservices_Department.Entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Department")

public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	public Department(String DepartmentName, String departmentCode) {
		super();
		departmentName = DepartmentName;
		this.departmentCode = departmentCode;
	}

	public Department() {
		super();
	}
	
	
}

