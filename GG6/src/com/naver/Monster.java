package com.naver;

public class Monster {
	private int hp;
	
	public Monster() {
		// TODO Auto-generated constructor stub
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public Monster(int hp) {
		super();
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Monster�� HP:"+ hp;
	}
	

}
