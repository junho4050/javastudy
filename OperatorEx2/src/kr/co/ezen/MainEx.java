package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test4;
import com.naver.Test5;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1 = new Test();
		Test2 t2 = new Test2();
		Test3 t3 = new Test3();
		
		
		
		boolean result = t1.me1(3, 4);
		System.out.println(result);
		
		boolean result1 = t1.me2(300L, 400L);
		System.out.println(result1);
		
		boolean result2 = t1.me4((byte)3, (byte)4);
		System.out.println(result2);
		
		t1.me5((short)4, (short)9);
		t1.me51(true, false);
		t1.me6(false, true);
		
		System.out.println("-----------------------------------");

		t2.k1(true, true);
		t2.k1(true, false);
		t2.k1(false, true);
		t2.k1(false, false);
		t2.k2(false, true);
		t2.k2(true, false);
		t2.k2(false, true);
		t2.k2(false, false);
		t2.k3(true);
		t2.k3(false);
		
		boolean e = false;
		t2.k3(e);
		
		t2.switchboolean();
		t2.switchboolean();
		t2.switchboolean();
		System.out.println("----------------------------------");
		t2.switchboolean2();
		t2.switchboolean2();
		
		System.out.println("---------------------------------");
		
		t3.plus1();
		t3.plus11();
		t3.plus2();
		t3.plus21();
		System.out.println(t3.getB());
		t3.minus1();
	
		
		Test5 t5 = new Test5();
		
		t5.h1();
		t5.h2();
		t5.h3();
		t5.h4();
		t5.h5(0);
		t5.h5(1);
		t5.h5(2);
		t5.h5(3);
		t5.h5(4);
		
		t5.h6(0);
		t5.h6(1);
		t5.h6(2);
		t5.h6(3);
		
		Test4 t4 = new Test4();
		t4.cond5(50);
		
	    
		
	}

}
