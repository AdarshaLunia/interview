package com.example.serialization;

import java.io.Serializable;

public class EmployeeAnil extends Person implements Serializable {
	private static final long serialVersionUID = 1L;
	private int employeeId;
	private String department;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public EmployeeAnil(int employeeId, String department) {
		super();
		this.employeeId = employeeId;
		this.department = department;
	}

	public EmployeeAnil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeAnil(String name, String nationality) {
		super(name, nationality);
		// TODO Auto-generated constructor stub
	}

	public EmployeeAnil(int employeeId,String name,String department,String nationality) {
		super(name, nationality);
		this.employeeId = employeeId;
		this.department = department;
		System.out.println("Employee:Constructor");
	}

}
