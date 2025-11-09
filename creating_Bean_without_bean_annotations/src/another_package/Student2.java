package another_package;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//When we annatotated a class with @Component then make sure 100% default constructor is available.

//@Component
public class Student2 {
	//if we want to create the one more bean with this class then we have to create @Bean method in the config class
	private int id;
	private String name;
	private float avg;
	
	public Student2(){
		System.out.println("default constructor");
		
	}
	public Student2(int id, String name, float avg) {
		this.id=id;
		this.name=name;
		this.avg=avg;
	
	}
	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", avg=" + avg + "]";
	}
	
	


}
