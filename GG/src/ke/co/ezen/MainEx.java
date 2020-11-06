package ke.co.ezen;

import com.naver.Bow;
import com.naver.Gun;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Sword;
import com.naver.Weapon;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monster mon = new Monster(100);
		System.out.println(mon);

		Weapon[] weapons = { new Bow(1, "È°"), new Sword(5, "°Ë"), new Gun(10, "ÃÑ") };
		
		Weapon w = weapons[2];
		
		Hero spyderman = new Hero(weapons, w);
		
		spyderman.attack(mon);
		spyderman.attack(mon);
		
		spyderman.changWeapon(1);
		

	}

	}


