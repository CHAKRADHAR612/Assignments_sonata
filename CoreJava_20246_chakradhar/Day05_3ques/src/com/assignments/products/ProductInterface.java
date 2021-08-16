package com.assignments.products;

import java.util.List;

public interface ProductInterface {
	public void addProduct(Product p);
	public void removeProduct(Product p);
	public List<Product> getProducts();
}
