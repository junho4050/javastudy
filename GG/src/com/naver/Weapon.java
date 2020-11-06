package com.naver;

public class Weapon {
	  private int power;
	  private String name;
      
      public Weapon() {
		// TODO Auto-generated constructor stub
	}

	public Weapon(int power) {
		super();
		this.power = power;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	public void attack(Monster mon) {
		int bhp = mon.getHp();
		int ahp = bhp - power;
		mon.setHp(ahp);
		System.out.println("monster¿« HP: "+ahp);
	}

	

	
	
	

	private String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Weapon(int power, String name) {
		super();
		this.power = power;
		this.name = name;
	}

	@Override
	public String toString() {
		return getName();
	}
	
	

}
