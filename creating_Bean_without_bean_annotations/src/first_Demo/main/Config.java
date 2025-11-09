package first_Demo.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import another_package.Student2;



/*
@ComponentScan("com.dilipit.beans")
Please scan the package called com.dilipit.bean and it's sub packages for the component classes.
*/


/*
while scanning,if it found @Component annotated classes, then container immediately creates an Object.

Note : When Container created bean Object for component class, then container
will check weather any bean id is provided or not, if not then container will assign class
names as bean id, class name converted to camel case. 
*/

//@ComponentScan("com.*") // if we have multiple subpackages then we can use like this
//@ComponentScan("another_package")
//@ComponentScan("first_Demo.main")

//if we want to specify the all packages in single componentscan then
@ComponentScan(basePackages = {"another_package","first_Demo.main"})
//@ComponentScan(basePackages = {"com.bhuvan"}) //including com.bhuvan
//@ComponentScan(basePackages = {"com.bhuvan.*"}) //except com.bhuvan but, it consider the subpackages of com.bhuvan
@Configuration

//in realtime projects they use the single base package.
//	like for example if we what to build the "swiggy" website
//	then their package is look like "com.swiggy"is base package and remaining are look like
//	"com.swiggy.home" 
//	"com.swiggy.order" 
//	"com.swiggy.payment" 
//	"com.swiggy..." etc 

public class Config {
	
	@Bean("bean")
	public Student2 newmethod() {
		System.out.println("i am created by the @Bean method");
		return new Student2();// here we are calling the student2 again
	}
	/*
	 *
	For a class, create only one bean Object in container : @Component
	For a class, create only one bean Object in container with values configuration for the properties.
	Ex : Student : 10@, Dilip, 66.66

	is it possible to achive this Req with @Component?
	No : by @Component we can't configure values in bean Object.
	
	@Component: Creating a bean Object with default constructor execution.
	Creating an Object always with default values for the properties.
	
	then we have to use the @Bean like the given below
	 * */

			@Bean("student2")
			public Student2 getStudent() {
			System.out.println("Bean method of : getStudent : called");
			// logic
			// calculations //result
			int toatal = 100+99+77;
			float avg = toatal/3;
			return new Student2 (1,"bhuvan",avg) ;
			}
		

}
