package com.springcore.lifecycle;

// implentating lifecycle methods of spring bean using xml.

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Seeting price");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init()
	{
		System.out.println("Inside init method");
	}
	
	public void destroy()
	{
		System.out.println("Inside destroy method");
	}
}
