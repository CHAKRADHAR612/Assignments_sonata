package com.secondques;

import javax.persistence.Entity;

@Entity
public class SavingAccount extends Bank{

	private String accountType;

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

}
