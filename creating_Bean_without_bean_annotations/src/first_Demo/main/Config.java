package first_Demo.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



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
@ComponentScan("another_package")
@ComponentScan("first_Demo.main")
@Configuration
public class Config {
	
		

}
