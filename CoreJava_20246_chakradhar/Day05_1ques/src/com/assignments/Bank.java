package com.assignments;

public class Bank {
	private int accno;
	private String accName;
	private double accBal;
	public Bank(int accno, String accName, double accBal) {
		super();
		this.accno = accno;
		this.accName = accName;
		this.accBal = accBal;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	@Override
	public String toString() {
		return "Bank [accno=" + accno + ", accName=" + accName + ", accBal=" + accBal + "]";
	}
	
}
