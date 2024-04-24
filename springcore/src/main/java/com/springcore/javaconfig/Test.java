package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.javaconfig.Student;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
//        Student student= (Student)context.getBean("firststudent");
        Student student= (Student)context.getBean("temp");
                
        System.out.println(student);
        student.study();
	}

}
