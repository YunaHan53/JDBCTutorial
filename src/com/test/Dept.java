package com.test;

public class Dept {

	// Declaring department variables
	private int deptId;
	private String deptName;
	private String deptLocation;
	
	// Custom constructor
	public Dept(int deptId, String deptName, String deptLocation) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptLocation = deptLocation;
	}
	
	// Getters
	public int getDeptId() {
		return deptId;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	public String getDeptLocation() {
		return deptLocation;
	}
	
	// Setters
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}
}
