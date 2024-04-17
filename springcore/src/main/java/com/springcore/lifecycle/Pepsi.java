package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// implentating lifecycle methods of spring bean using interfaces(InitializingBean, DisposableBean).

public class Pepsi implements InitializingBean, DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// This is same as init method.
		System.out.println("taking pepsi:- init");
	}

	public void destroy() throws Exception {
		// This is same as destroy method.
		System.out.println("drop pepsi:- destroy");
	}
}
