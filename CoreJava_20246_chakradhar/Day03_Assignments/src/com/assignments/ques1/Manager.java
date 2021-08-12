package com.assignments.ques1;

class Manager extends Employee {
	private int empId;
	private String empName;
	private double empSal;
	public Manager(int eid, String ename, double esal) {
		super(eid,ename,esal);
		this.empId=eid;
		this.empName=ename;
		this.empSal=esal;
	}

	public void salCal() {
		empSal=empSal*0.2 + empSal*0.6;
		System.out.println("After salary calculation:"+empSal);
	}
}
