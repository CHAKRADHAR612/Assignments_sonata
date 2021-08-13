package com.assignments.ques2;

public class Student {
	private int stdId;
	private String stdName;
	private Integer marks;
	public Student(int stdId, String stdName, int marks) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.marks = marks;
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
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", marks=" + marks + "]";
	}

}
