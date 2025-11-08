package first_Demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);
															// it is a configuration class
		
		// in the above mentioned configuration class it search for the "std"
		Student std = (Student) ctx.getBean("std");
		
		
		
		Student std1 = (Student) ctx.getBean("std1");
	
		
		College clg = (College) ctx.getBean("clg");
		System.out.println(clg.getName());
		
		College clg2 = (College) ctx.getBean("clg");
		System.out.println(clg2.getName());
		
		College clg1 = (College) ctx.getBean("college11");
		System.out.println(clg1.getPincode());
		
	}

}
