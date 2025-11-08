package first_Demo.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {

	
	//we are saying that take the "std" bean a give it to me when i asked
	//here we are created the object creation by our own and give it to the spring container
	@Bean("std")
	public Student student1() {
		System.out.println("i am form the first config");
		System.out.println("student1 bean is created");
		return new Student();
	}
	
	@Bean("std1")
	public Student student2() {
		System.out.println("student2 bean is created");
		return new Student();
	}
	
	
/*
 * 
-> In a configuration class, if we are not annotated a method with @Bean then that method will not be executed by container.
-> If we are not provided bean id as part of @Bean along with Bean method inside a configuration class, what will happen?
	then it take the method name is taken as the bean id.
	*/
}
