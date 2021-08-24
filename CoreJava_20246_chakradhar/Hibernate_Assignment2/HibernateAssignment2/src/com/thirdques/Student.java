package com.thirdques;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student2")
public class Student {
	@Id
	@GeneratedValue
	private int stdId;
	private String stdName;
	private String stdAddress;
	
	public String getStdAddress() {
		return stdAddress;
	}
	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}
	@Embedded
	private SchoolDetails sd;
	public SchoolDetails getSd() {
		return sd;
	}
	public void setSd(SchoolDetails sd) {
		this.sd = sd;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
}
