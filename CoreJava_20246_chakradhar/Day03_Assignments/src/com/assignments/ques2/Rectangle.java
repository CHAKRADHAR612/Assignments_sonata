package com.assignments.ques2;

public class Rectangle extends Shape {
	private int l,b;
	Rectangle(int l,int b){
		this.l=l;
		this.b=b;
	}
	
	public void area() {
		double area=l*b;
		System.out.printf("Rectangle Area:%.2f\n",area);
	}
}
