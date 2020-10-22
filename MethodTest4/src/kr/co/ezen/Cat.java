package kr.co.ezen;

public class Cat {

	private String name;
	private int age;
	private char aa;
	
	public Cat() {
		name = "냥냥이";
		age = 3;
		aa= '남';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Cat (String name, int age) {
		this.name = name;
		this.age = age;
	}

	public char getAa() {
		return aa;
	}

	public void setAa(char aa) {
		this.aa = aa;
	}

   
	
}
