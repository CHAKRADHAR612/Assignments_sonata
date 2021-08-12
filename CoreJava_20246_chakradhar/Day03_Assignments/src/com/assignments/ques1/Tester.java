package com.assignments.ques1;

public class Tester extends Employee {
	private int empId;
	private String empName;
	private double empSal;
	public Tester(int eid, String ename, double esal) {
		super(eid,ename,esal);
		this.empId=eid;
		this.empName=ename;
		this.empSal=esal;
	}

	public void salCal() {
		empSal=empSal*0.3 + empSal*0.4;
		System.out.println("After salary calculation:"+empSal);
	}
}
