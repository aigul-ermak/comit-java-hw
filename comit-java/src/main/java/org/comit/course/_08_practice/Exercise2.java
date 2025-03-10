package org.comit.course._08_practice;

import java.util.ArrayList;
import java.util.List;

class Product {

	int id;
	String name;
	double quantity;

	Product(int id, String name, double quantity) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}

	// This equals() method only needs the product id to match to consider a product
	// the same.

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id;
	}
}

class Inventory {

	List<Product> products;

	Inventory() {
		this.products = new ArrayList<>();
	}

	void add(Product product) {
		this.products.add(product);
	}

	void remove(Product product) {
		this.products.remove(product);
	}

	boolean isLow() {

		if (this.products.size() < 5) {
			return true;
		}

		return false;
	}
}

public class Exercise2 {
	public static void main(String[] args) {

		Inventory inv = new Inventory();

		inv.add(new Product(1, "Product 1", 4.7));
		inv.add(new Product(2, "Product 2", 7));
		inv.add(new Product(3, "Product 3", 10));
		inv.add(new Product(4, "Product 4", 2));
		inv.add(new Product(5, "Product 5", 8));

		System.out.println("Check Inventory isLow() Before: " + inv.isLow());

		inv.remove(new Product(4, "Product 4", 2));

		System.out.println("Check Inventory isLow() After: " + inv.isLow());

	}
}
