package kr.co.ezen;

public class Cat {
	private int age;
	private float fa;
	private String name;
	private String address;
	
	
	public Cat(int age, float fa, String name, String address) {
		super();
		this.age = age;
		this.fa = fa;
		this.name = name;
		this.address = address;
		
		
		
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public float getFa() {
		return fa;
	}


	public void setFa(float fa) {
		this.fa = fa;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

}
