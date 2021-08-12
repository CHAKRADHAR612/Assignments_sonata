package com.assignments.ques1;

public class Developer extends Employee {
	private int empId;
	private String empName;
	private double empSal;
	public Developer(int eid, String ename, double esal) {
		super(eid,ename,esal);
		this.empId=eid;
		this.empName=ename;
		this.empSal=esal;
	}

	public void salCal() {
		empSal=empSal*0.5 + empSal*0.2;
		System.out.println("After salary calculation:"+empSal);
	}
}
