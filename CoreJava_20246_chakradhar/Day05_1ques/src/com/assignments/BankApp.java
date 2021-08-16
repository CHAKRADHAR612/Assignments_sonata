package com.assignments;

import java.util.ArrayList;
import java.util.List;

public class BankApp {

	public static void main(String[] args) {
		List<SavingAccount> susers=new ArrayList<>();
		System.out.println("------Savings Account------");
		SavingAccount s=new SavingAccount(123,"chakradhar",10000);
		System.out.println("Available Balance:"+s.deposit(112000));
		System.out.println("Available Balance:"+s.withDraw(20000));
		
		System.out.println("------Current Account------");
		CurrentAccount c=new CurrentAccount(234,"prudhvi",20000);
		System.out.println("Available Balance:"+c.deposit(12000));
		System.out.println("Available Balance:"+c.withDraw(50000));
		
		System.out.println("------Joint Account------");
		JointAccount j=new JointAccount(345,"chakradhar,chandra",50000);
		System.out.println("Available Balance:"+j.deposit(2000));
		System.out.println("Available Balance:"+j.withDraw(70000));
		
	}

}
