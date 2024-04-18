package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.auto.wire.annotation.Emp;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autoconfig.xml");
        Emp temp1= (Emp)context.getBean("emp1");
                
        System.out.println(temp1);
	}

}
