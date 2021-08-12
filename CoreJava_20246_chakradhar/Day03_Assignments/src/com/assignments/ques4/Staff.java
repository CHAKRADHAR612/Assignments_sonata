package com.assignments.ques4;

public class Staff extends Employee {
	private String title;
	protected int EmployeeID;
	protected String EmployeeName;
	protected Address address;
	protected double basicPay;
	protected int leaves;
	
	public Staff(String title, int employeeID, String employeeName, Address address, double basicPay, int leaves) {
		super();
		this.title = title;
		EmployeeID = employeeID;
		EmployeeName = employeeName;
		this.address = address;
		this.basicPay = basicPay;
		this.leaves = leaves;
	}

	@Override
public void calculateSalary() {
	double sal=basicPay*1.18;
	System.out.printf("Staff salary:%.2f\n",sal);
}

	@Override
	public String toString() {
		return "Staff [title=" + title + ", EmployeeID=" + EmployeeID + ", EmployeeName=" + EmployeeName + ", address="
				+ address + ", basicPay=" + basicPay + ", leaves=" + leaves + "]";
	}

}
