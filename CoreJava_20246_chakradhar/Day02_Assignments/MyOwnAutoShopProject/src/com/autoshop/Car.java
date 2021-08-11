package com.autoshop;

public class Car {
	private int speed;
	private double regularPrice;
	private String color;
	//constructor
	public Car(int speed, double regularPrice, String color) {
		super();
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}
	//getters and setters
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public double getRegularPrice() {
		return regularPrice;
	}
	public void setRegularPrice(double regularPrice) {
		this.regularPrice = regularPrice;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//sale price computation
	public double getSalePrice() { //Sale price calculation
		double sprice=getRegularPrice()+50000;
		return sprice;
	}
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", regularPrice=" + regularPrice + ", color=" + color + "]";
	}
}
