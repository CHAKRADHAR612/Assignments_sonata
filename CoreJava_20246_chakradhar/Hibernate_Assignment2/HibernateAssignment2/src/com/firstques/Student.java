package com.firstques;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name="Student1")
// @NamedNativeQuery(name = "getElementBy.Marks",query = "SELECT * FROM Student1 WHERE marks=(SELECT max(marks) FROM Student1)",resultClass = Student.class)
// b @NamedNativeQuery(name = "getElementBy.Marks",query = "SELECT * FROM Student1 GROUP BY marks HAVING COUNT(marks)>1",resultClass = Student.class)
public class Student {
	@Id
	@GeneratedValue
	private int stdId;
	private String stdName;
	private int marks;
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
	public int getMarks() {
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
