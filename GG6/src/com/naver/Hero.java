package com.naver;

public class Hero {
	Weapon[] weapons;
	Weapon w;
	
	public Hero() {
		weapons = new Weapon[] {new Bow("È°", 1),new Sword("°Ë", 5),new Gun("ÃÑ", 10)};
		
		w = weapons[2];
	}
	public void attack(Monster mon) {
		w.attack(mon);
	}
	public void changeWeapon(int weaponIdx) {
		if (weaponIdx>= weapons.length || weaponIdx<0) {
			weaponIdx = weapons.length-1;						
		}
		w =weapons[weaponIdx];
		System.out.println(w+"·Î º¯°æµÊ");
	}
	public Hero(Weapon[] weapons, Weapon w) {
		super();
		this.weapons = weapons;
		this.w = w;
	}

}
