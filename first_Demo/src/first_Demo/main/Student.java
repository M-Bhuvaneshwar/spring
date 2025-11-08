package first_Demo.main;

public class Student {
	private int id;
	private String name;
	private long salary;
	
	public Student() {
		System.out.println("Bean is created");
		
	}
	
	//getters and setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public void commonMethod() {
		System.out.println("I am a Student method~~~~~");
	}
	
	

}
