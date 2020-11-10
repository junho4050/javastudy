package kr.co.ezen;

import java.util.Scanner;

import com.naver.Bow;
import com.naver.Gun;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Sword;
import com.naver.Weapon;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Monster mon = new Monster(100);
		
		Weapon[] weapons = {new Bow("Ȱ", 1),new Sword("��", 5),new Gun("��", 10)};
		
		Weapon w = weapons[2];
		
		Hero spyderman = new Hero(weapons, w);
		boolean isTrue = true;
		int menu = 0;
		int weaponIdx = 0;

		while (isTrue) {
			System.out.println("���� �� �ϳ��� ���ÿ�");
			System.out.println("0:���� 1:���⺯�� 2:����");

			menu = sc.nextInt();
			if (menu == 2) {
				break;
			}
			if (menu == 0) {
				spyderman.attack(mon);
			} else if (menu == 1) {
				System.out.println("���⸦ �����Ͻÿ�");
				for (int i = 0; i < weapons.length; i++) {
					System.out.print(i);
					System.out.print(":"+weapons[i]+",");
				}
				weaponIdx = sc.nextInt();
				sc.nextLine();
				spyderman.changeWeapon(weaponIdx);
			}
		}sc.close();

	}

}
