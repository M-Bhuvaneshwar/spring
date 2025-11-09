package first_Demo.main.subpackage;

import org.springframework.stereotype.Component;

//When we annatotated a class with @Component then make sure 100% default constructor is available.

@Component
public class Marks {
	public Marks() {
		System.out.println("Marks class is executed");
	}

}
