package com.secondques;

import javax.persistence.Entity;

@Entity
public class CurrentAccount extends Bank{
	
	private String accType;

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}
	
}
