package kr.co.ezen;

public class MyPhone {
	private String name;
	private String numb;
	private int price;
	private char ca;
	private boolean bl;
	private Dog dog;
	private Cat cat;
	
	
	
	


	


	public Dog getDog() {
		return dog;
	}


	public void setDog(Dog dog) {
		this.dog = dog;
	}


	public Cat getCat() {
		return cat;
	}


	public void setCat(Cat cat) {
		this.cat = cat;
	}


	public MyPhone(String name, String numb, int price, char ca, boolean bl, Dog dog, Cat cat) {
		super();
		this.name = name;
		this.numb = numb;
		this.price = price;
		this.ca = ca;
		this.bl = bl;
		this.dog = dog;
		this.cat = cat;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNumb() {
		return numb;
	}


	public void setNumb(String numb) {
		this.numb = numb;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public char getCa() {
		return ca;
	}


	public void setCa(char ca) {
		this.ca = ca;
	}


	public boolean isBl() {
		return bl;
	}


	public void setBl(boolean bl) {
		this.bl = bl;
	}

}
