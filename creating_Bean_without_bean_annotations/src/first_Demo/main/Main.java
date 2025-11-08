package first_Demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
															// it is a configuration class
		
		College clg = (College) ctx.getBean("college");
		clg.greet();
		
		
	}

}
