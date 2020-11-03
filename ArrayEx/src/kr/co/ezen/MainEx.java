package kr.co.ezen;

import com.naver.Dog;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t1 = new Test();
		
		
		Dog[] dogs = new Dog[] {new Dog(),new Dog(),new Dog(),new Dog()};
		t1.me32(dogs);
		
		t1.me1();
		
		t1.me11();
		t1.me21();
		System.out.println("--------------");
		t1.me01();
		System.out.println("--------------");
		t1.me13();
		
	}
	
}
