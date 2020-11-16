package com.naver;

import java.util.Random;

public class lotto {
	
	public void randomNum() {
		Random rnd = new Random();
		for (int i = 0; i < 46; i++) {
			int num = rnd.nextInt(45)+1;
			System.out.println(num);
		}
	}

}
