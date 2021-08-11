package com.autoshop;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		System.out.println("-------Car sale price is 50000 + regular price------");
		
		Sedan s=new Sedan(100,500000.25d,"Red");//taken regular price to calculate the sale price
		s.setLength(25);//setting length
		System.out.printf("sedan sale price:%.2f\n",s.getSalePrice());
		
		Ford f1=new Ford(120,600000.30d,"Blue");//taken computed sale price to calculate the sale price
		f1.setYear(2019);
		f1.setManufacturerDiscount(25);//setting manufacturer discount
		System.out.printf("f1 Ford sale price:%.2f\n",f1.getSalePrice());
		
		Ford f2=new Ford(110,600000.30d,"Green");//taken computed sale price to calculate the sale price
		f2.setYear(2020);
		f2.setManufacturerDiscount(20);//setting manufacturer discount
		System.out.printf("f2 Ford sale price:%.2f\n",f2.getSalePrice());
		
		Truck t=new Truck(75,450000.24d,"Black");//taken regular price to calculate the sale price
		t.setWeight(1500);//setting weight
		System.out.printf("Truck sale price:%.2f\n",t.getSalePrice());
	}

}
