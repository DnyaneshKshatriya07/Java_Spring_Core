package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.auto.wire.Emp;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
        Emp temp= (Emp)context.getBean("emp1");
                
        System.out.println(temp);
	}

}
