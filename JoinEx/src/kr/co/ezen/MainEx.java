package kr.co.ezen;

import com.naver.Test;
import com.naver.ZZZ;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread ct = Thread.currentThread();
		String name = ct.getName();
		System.out.println(name);
		
		System.out.println("main start");
		
		Test t1 = new Test("문도");
		Test t2 = new Test("로봇");
		ZZZ t3 = new ZZZ(t1, "미니언");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main end");

	}

}
