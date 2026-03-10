package com.capg.springboot.controller;

public class Product {
	private String name;
	private int id;
	private double price;
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

	
	public Product(String name, int id, double price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	
	
}
