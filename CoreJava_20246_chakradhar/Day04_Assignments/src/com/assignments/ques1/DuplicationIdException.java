package com.assignments.ques1;

public class DuplicationIdException extends Exception {
	String s;
	DuplicationIdException(String s){
		this.s=s;
	}
	public String toString() {
		return s;
	}
}
