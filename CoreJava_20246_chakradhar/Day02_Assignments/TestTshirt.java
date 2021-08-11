package com.sonata.assignments;

public class TestTshirt {

	public static void main(String[] args) {
		Tshirt small=new Tshirt();
		small.setColor("Red");
		small.setMaterial("cotton");
		small.setDesign("Plain");
		System.out.println("Small:"+small);
		Tshirt large=new Tshirt();
		large.setColor("Blue");
		large.setMaterial("silk");
		large.setDesign("diagnol stripes");
		System.out.println("Large:"+large);
		Tshirt xlarge=new Tshirt();
		xlarge.setColor("Green");
		xlarge.setMaterial("Wool");
		xlarge.setDesign("Boxes");
		System.out.println("Xtra Large:"+xlarge);
	}

}
