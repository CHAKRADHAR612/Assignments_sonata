package com.assignments;

public class CurrentAccount extends Bank implements BankInterface{
	private int accno;
	private String accName;
	private double accBal;
	public CurrentAccount(int accno, String accName, double accBal) {
		super(accno,accName,accBal);
		this.accno = accno;
		this.accName = accName;
		this.accBal = accBal;
	}

	@Override
	public double deposit(double amt) {
		accBal+=amt;
		System.out.println("Amount deposited successfully");
		return accBal;
	}

	@Override
	public double withDraw(double amt) {
		if(accBal-amt<10000) {
			System.out.println("Amount cannot be withdrawn");
			System.out.println("Minimum Balance must be maintained or else you will be charged");
		}else {
			System.out.println("Amount withdrawn successfully");
			accBal-=amt;
		}
		return accBal;
	}

}
