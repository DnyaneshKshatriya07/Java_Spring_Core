package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.standalone.collections.Person;

public class Test {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
        Person p1= (Person)context.getBean("person1");
                
        System.out.println(p1);
        System.out.println(p1.getFriends().getClass().getName());
        System.out.println("__________________________________________________");
        System.out.println(p1.getFeestructure());
        System.out.println(p1.getFeestructure().getClass().getName());
        System.out.println("__________________________________________________");
        System.out.println(p1.getProperties());
        System.out.println(p1.getProperties().getClass().getName());
	}
}
