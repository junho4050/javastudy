package kr.co.ezen;

import com.naver.Person;
import com.naver.Phone;
import com.naver.TV;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1 = new Test();
		t1.me1();
		t1.me2(60);
		t1.me3(5);
		String  msg= t1.me4(3);
		System.out.println(msg);
		t1.me6(6);
		t1.me3(10);
		
		TV tv1 = new TV(10,15 ,false);
		
		tv1.powerOn();
		System.out.println(tv1.getVol());
		tv1.volUp();
		System.out.println(tv1.getVol());
		tv1.powerOff();
		tv1.volUp();
		System.out.println(tv1.getVol());
		tv1.powerOn();
		tv1.chUp();
		System.out.println(tv1.getCh());
		tv1.chUp();
		System.out.println(tv1.getCh());
		tv1.chDown();
		System.out.println(tv1.getCh());
		tv1.chDown();
		System.out.println(tv1.getCh());
		tv1.chDown();
		System.out.println(tv1.getCh());
		tv1.powerOff();
		tv1.chDown();
		System.out.println(tv1.getCh());
		
		t1.me3(5);
		
		
		Person kim = new Person(tv1);
		//kim¿Ã tv∏¶ ƒ“¥Ÿ
		kim.tvOn();
		//kim¿Ã tv∏¶ ≤ˆ¥Ÿ
		kim.tvOff();
		
		TV tv = kim.getTv1();
		System.out.println(tv.getCh());
		tv.chUp();
		System.out.println(tv.getCh());
		
		TV tv2 = kim.getTv1();
		System.out.println(tv2.getVol());
		tv2.volDown();
		System.out.println(tv2.getVol());
		
		TV tv3 = kim.getTv1();
		System.out.println(tv3.getVol());
		tv3.setVol(50);
		System.out.println(tv3.getVol());
		
		
		
		Phone ph1 = new Phone();		
		Person kim1 = new Person(tv1, ph1);
		
		
		
		
				

				
		
		
		
		
		

	}

}
