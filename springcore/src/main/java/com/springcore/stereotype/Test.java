package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.stereotype.Student;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
        Student student= (Student)context.getBean("ob");
                
        System.out.println(student);
        System.out.println(student.getAddress());
        System.out.println("___________________________________________");
        System.out.println("Singletone using Annotation");
        System.out.println(student.hashCode());
        
        Student student2= (Student)context.getBean("ob");
        System.out.println(student2.hashCode());
        
        System.out.println("___________________________________________");
        System.out.println("Prototype using Xml");
        Teacher teacher1= (Teacher)context.getBean("teacher");
        System.out.println(teacher1.hashCode());
        
        Teacher teacher2= (Teacher)context.getBean("teacher");
        System.out.println(teacher2.hashCode());
	}

}
