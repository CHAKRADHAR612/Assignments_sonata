package com.autoshop;

public class Sedan extends Car {
	//constructor
	public Sedan(int speed, double regularPrice, String color) {
		super(speed, regularPrice, color);
	}
	private int length;
	//getter and setter
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	//sale price computation
	public double getSalePrice() {
		double sprice=super.getRegularPrice();
		if(getLength()>20) {
			sprice-=sprice*0.05;
		}else {
			sprice-=sprice*0.1;
		}
		return sprice;
	}
}
