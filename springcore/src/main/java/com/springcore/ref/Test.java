package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ref.A;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
        A temp= (A)context.getBean("aref");
                
        System.out.println(temp.getX());
        System.out.println(temp.getOb().getY());
	}

}
