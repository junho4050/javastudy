package com.naver;

public class Hero {
	Weapon[] weapons;
	
	Weapon w;
	public Hero() {
		// TODO Auto-generated constructor stub
		weapons = new Weapon[] {new Bow(1, "Ȱ"),
				new Sword(5, "��"),new Gun(10, "��")};
		w = weapons[2];
	}
	public void attack(Monster mon) {
		w.attack(mon);
		
	}
	public void changWeapon(int weaponIdx) {
		if (weaponIdx >= weapons.length || weaponIdx<0) {
			weaponIdx = weapons.length-1;
		}
		
		w = weapons[weaponIdx];
		System.out.println(w+"�� ����Ǿ����ϴ�.");
		
	}
	public Hero(Weapon[] weapons, Weapon w) {
		super();
		this.weapons = weapons;
		this.w = w;
	}

}
