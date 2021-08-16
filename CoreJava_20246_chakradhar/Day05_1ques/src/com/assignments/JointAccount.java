package com.assignments;

public class JointAccount extends Bank implements BankInterface {

	private int accno;
	private String accName;
	private double accBal;
	public JointAccount(int accno, String accName, double accBal) {
		super(accno, accName, accBal);
		this.accno=accno;
		this.accName=accName;
		this.accBal=accBal;
	}

	@Override
	public double deposit(double amt) {
		if(amt>50000) {
			System.out.println("Sorry only 50000 is accepted per transaction");
		}else {			
			accBal+=amt;
		}
		return accBal;
	}

	@Override
	public double withDraw(double amt) {
		if(accBal-amt<500) {
			System.out.println("Sorry Minimum Balance must be maintained");
		}else {
			accBal-=amt;
		}
		return accBal;
	}

}
