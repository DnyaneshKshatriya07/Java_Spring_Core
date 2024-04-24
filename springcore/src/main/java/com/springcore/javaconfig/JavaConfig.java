package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //This is used to show that this is main class
//@ComponentScan(basePackages="com.springcore.javaconfig")
public class JavaConfig {
	
	@Bean(name= {"student","temp","obj"}) 
	public Student getstudent(){
		//creating the object of student because we are not use @Component 
		Student student= new Student(getsamosa());
		return student;
	}
	
	@Bean 
	public Samosa getsamosa(){
		return new Samosa();
	}

}
