package first_Demo.main;

public class College {
	private String name = "svp";
	private int pincode;
	
	public College() {
		System.out.println("College bean is created");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
}
