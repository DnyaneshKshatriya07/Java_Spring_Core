package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ci.Person;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
        Person p1= (Person)context.getBean("person");
        Addition a=(Addition)context.getBean("add");
                
        System.out.println(p1);
        a.doSum();
        

	}

}
