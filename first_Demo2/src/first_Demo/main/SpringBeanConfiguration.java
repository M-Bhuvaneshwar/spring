package first_Demo.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {

	
	//we are saying that take the "std" bean a give it to me when i asked
	//here we are created the object creation by our own and give it to the spring container
	@Bean("std")
	public Student student1() {
		System.out.println("student1 bean is created");
		return new Student();
	}
	
	@Bean("std1")
	public Student student2() {
		System.out.println("student2 bean is created");
		return new Student();
	}
	
	@Bean("clg")
	public College college() {
		College clg = new College();
		System.out.println("1");
		clg.setName("Osmaina");
		return clg;
	}
	
	//this will ignore because, already one bean have the same id before it. but in xml it will give exception.
	@Bean("clg")
	public College college1() {
		College clg = new College();
		System.out.println("2");
		clg.setName("Osmaina university");
		return clg;
	}
	@Bean() //here method name is taken as the bean id
	public College college11() {
		College clg = new College();
		clg.setPincode(1223);
		System.out.println("without bean id");
		return clg;
	}
/*
 * 
-> In a configuration class, if we are not annotated a method with @Bean then that method will not be executed by container.
-> If we are not provided bean id as part of @Bean along with Bean method inside a configuration class, what will happen?
	then it take the method name is taken as the bean id.
	*/
}
