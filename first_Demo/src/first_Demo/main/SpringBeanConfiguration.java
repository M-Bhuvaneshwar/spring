package first_Demo.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {

	
	//we are saying that take the "std" bean a give it to me when i asked
	//here we are created the object creation by our own and give it to the spring container
	@Bean("std")
	public Student student1() {
		return new Student();
	}
	
	@Bean("std1")
	public Student student2() {
		return new Student();
	}
	
	@Bean("clg")
	public College college() {
		College clg = new College();
		clg.setName("Osmaina");
		return clg;
	}
}
