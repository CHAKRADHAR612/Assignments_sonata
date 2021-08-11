package com.autoshop;

public class Truck extends Car {
	//constructor
	public Truck(int speed, double regularPrice, String color) {
		super(speed, regularPrice, color);
	}

	private int weight;
	//getter and setter
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	//sale price computation
	public double getSalePrice() {
		double sprice=super.getRegularPrice();
		if(getWeight()>2000) {
			sprice=sprice*0.9;
		}else {
			sprice=sprice*0.8;
		}
		return sprice;
	}
}
