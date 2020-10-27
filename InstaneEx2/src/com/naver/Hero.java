package com.naver;

public class Hero {
	private Bow bow;
	private Sword sword;
	private Spear spear;
	
	public Hero() {
		// TODO Auto-generated constructor stub
	}
	
	public void attack(Monster mon) {
		Bow.attack(mon);
		
		
	}
	public void attackSw(Sword sword ,Monster mon) {
		
		Sword.attack(mon);
	}

	public void attackSp(Monster mon) {
		Spear.attack(mon);
		
		
	}

	
	
	public Hero(Bow bow, Sword sword, Spear spear) {
		super();
		this.bow = bow;
		this.sword = sword;
		this.spear = spear;
	}

	public Spear getSpear() {
		return spear;
	}

	public void setSpear(Spear spear) {
		this.spear = spear;
	}

	public Sword getSword() {
		return sword;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
	}

	public Hero(Bow bow) {
		super();
		this.bow = bow;
	}

	public Bow getBow() {
		return bow;
	}

	public void setBow(Bow bow) {
		this.bow = bow;
	}
	

}
