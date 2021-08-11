package com.autoshop;

public class Ford extends Car {
	//constructor
	public Ford(int speed, double regularPrice, String color) {
		super(speed, regularPrice, color);
	}
	private int year;
	private int manufacturerDiscount;
	//getters and setters
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getManufacturerDiscount() {
		return manufacturerDiscount;
	}
	public void setManufacturerDiscount(int manufacturerDiscount) {
		this.manufacturerDiscount = manufacturerDiscount;
	}
	//sale price computation
	public double getSalePrice() {
		double sprice=super.getSalePrice();
		sprice-=sprice*(double)(getManufacturerDiscount()*0.01);
//		System.out.println(getManufacturerDiscount()*0.01);
		return sprice;
	}
}
