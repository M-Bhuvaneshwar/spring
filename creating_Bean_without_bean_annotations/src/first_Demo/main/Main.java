package first_Demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import another_package.Student2;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
															// it is a configuration class
		
		College clg = (College) ctx.getBean("clg");
		clg.greet();
		
		Student2 std2 = (Student2) ctx.getBean("student2");
		System.out.println(std2.toString());;
		
		
	}

}
