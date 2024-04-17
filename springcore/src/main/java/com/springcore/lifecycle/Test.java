package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.lifecycle.Samosa;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		context.registerShutdownHook();
		
		Samosa s=(Samosa)context.getBean("s1");    
        System.out.println(s);
        
        System.out.println("_________________________________");
        
        Pepsi p=(Pepsi)context.getBean("p1");
        System.out.println(p);
        
        System.out.println("_________________________________");
        
        Example e=(Example)context.getBean("e1");
        System.out.println(e);
	}

}
