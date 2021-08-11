package com.sonata.assignments;

public class Student {
	private int stdId;
	private String stdName;
	private int stdClass;
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
	public int getStdClass() {
		return stdClass;
	}
	public void setStdClass(int stdClass) {
		this.stdClass = stdClass;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdClass=" + stdClass + "]";
	}

}
