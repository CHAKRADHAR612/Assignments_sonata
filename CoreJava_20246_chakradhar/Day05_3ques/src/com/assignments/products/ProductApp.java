package com.assignments.products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductApp {

	public static void main(String[] args) {
		List<Product> products=new ArrayList<>();
		Product p1=new Product(123,"Samsung mobile",25000d);
		ProductDaoImpl pd=new ProductDaoImpl();
		pd.addProduct(p1);
		Product p2=new Product(345,"Dell laptop",70000d);
		pd.addProduct(p2);
		Product p3=new Product(234,"Vivo mobile",21000d);
		pd.addProduct(p3);
		Product p4=new Product(567,"Oppo mobile",25000d);
		pd.addProduct(p4);
		Product p5=new Product(456,"HP laptop",75000d);
		pd.addProduct(p5);
		System.out.println("-----------All products with increasing ID-----------");
		 products=pd.getProductsById();
		 products.stream().forEach(t->System.out.println(t));
		 
		 System.out.println("-----------Mobile Products-----------");
		 products=pd.getMobileProducts();
		 products.stream().forEach(t->System.out.println(t));
		 
		 
		 System.out.println("-----------All Products with increasing Price-----------");
		 products=pd.getProductByPrice();
		 products.stream().forEach(t->System.out.println(t));
		 
		 System.out.println("-----------All Products with Decreasing Price-----------");
		 products=pd.getProductByPriceReverse();
		 Collections.sort(products,Collections.reverseOrder());
		 products.stream().forEach(t->System.out.println(t));
		 
		 System.out.println("-----------Product with Highest Price-----------");
		 Product product=pd.getMaxPrice();
//		 products.stream().forEach(t->System.out.println(t));
		 System.out.println(product);
		 
		 
	}

}
