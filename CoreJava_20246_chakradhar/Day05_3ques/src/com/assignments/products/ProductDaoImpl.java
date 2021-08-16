package com.assignments.products;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductDaoImpl  implements ProductInterface {
	
	List<Product> products=new ArrayList<>();
	@Override
	public void addProduct(Product p) {
		products.add(p);
	}

	@Override
	public void removeProduct(Product p) {
		products.remove(p);
	}

	@Override
	public List<Product> getProducts() {
		return products;
	}
	public List<Product> getProductsById(){
		return products.stream().sorted(Comparator.comparing(Product::getProductId)).collect(Collectors.toList());
	}
	
	public List<Product> getProductByPrice(){
		return products.stream().sorted(Comparator.comparing(Product::getProductPrice)).collect(Collectors.toList());
	}
	
	public List<Product> getProductByPriceReverse(){
		return products.stream().sorted().sorted(Comparator.comparing(Product::getProductPrice)).collect(Collectors.toList());
	}
	
	public List<Product> getMobileProducts(){
		return products.stream().filter(pro->pro.getProductName().contains("mobile")).collect(Collectors.toList());
	}
	
	public Product getMaxPrice() {
		return products.stream().max(Comparator.comparing(Product::getProductPrice)).get();
	}
	
	public String getMaxPriceString() {
		return products.stream().max(Comparator.comparing(Product::getProductPrice)).toString();
	}

}
