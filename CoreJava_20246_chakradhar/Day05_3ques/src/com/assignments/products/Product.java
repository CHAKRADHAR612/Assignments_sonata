package com.assignments.products;

import java.util.Comparator;

public class Product implements Comparable<Product>{
	private int productId;
	private String productName;
	private Double productPrice;
	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	@Override
	public int compareTo(Product o) {
		if(productPrice==o.productPrice) {			
			return 0;
		}else if(productPrice>o.productPrice) {
			return 1;
		}else return -1;
	}
}
