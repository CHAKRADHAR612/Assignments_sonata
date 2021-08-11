package com.sonata.assignments;

public class TestProduct {

	public static void main(String[] args) {
		Product p=new Product();
		double gst=18.25d;
		p.setProId(1);
		p.setProName("Headset");
		p.setProPrice(2500.25);
		p.gstAdd(gst);
		System.out.println(p);
	}

}
