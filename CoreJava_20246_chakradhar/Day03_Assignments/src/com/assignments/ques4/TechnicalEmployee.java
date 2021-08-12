package com.assignments.ques4;

public class TechnicalEmployee extends Employee {
	protected int EmployeeID;
	protected String EmployeeName;
	protected Address address;
	protected double basicPay;
	protected int leaves;
	private String skill;

	public TechnicalEmployee(int employeeID, String employeeName, Address address, double basicPay, int leaves,
			String skill) {
		super();
		EmployeeID = employeeID;
		EmployeeName = employeeName;
		this.address = address;
		this.basicPay = basicPay;
		this.leaves = leaves;
		this.skill = skill;
	}

	@Override
	public void calculateSalary() {
		double sal = basicPay*1.12;
		System.out.printf("Technical Employee salary:%.2f\n", sal);
	}

	@Override
	public String toString() {
		return "TechnicalEmployee [EmployeeID=" + EmployeeID + ", EmployeeName=" + EmployeeName + ", address=" + address
				+ ", basicPay=" + basicPay + ", leaves=" + leaves + ", skill=" + skill + "]";
	}
}
