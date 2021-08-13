package com.assignments.ques1;

public class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private double empSal;
	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	@Override
	public int compareTo(Employee o) {
		if(empId==o.empId) {
			try{
				throw new DuplicationIdException("Duplicate ID is not accepted");
			}catch(DuplicationIdException e) {
				System.out.println(e);
			}
		}else if(empId>o.empId) {
			return 1;
		}else return -1;
		return 0;
	}
}
