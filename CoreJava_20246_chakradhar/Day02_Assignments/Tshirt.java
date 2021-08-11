package com.sonata.assignments;

public class Tshirt {
	private String color;
	private String material;
	private String design;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	@Override
	public String toString() {
		return "Tshirt [color=" + color + ", material=" + material + ", design=" + design + "]";
	}
	
}
