package kr.co.ezen;

import com.naver.CarRegistManagementService;
import com.naver.CatRegistManegementService;
import com.naver.DogRegistManegementService;

public class MainEx {
	public static void main(String[] args) {
		CarRegistManagementService crms =  new CarRegistManagementService();
		
		
		
		String carName = crms.getCarname();
		
		
		CarRegistManagementService crms2 = new CarRegistManagementService();
		
		long result = crms2.add(2100000000, 500000000);
		System.out.println(result);
		
		DogRegistManegementService dg1 = new DogRegistManegementService();
		 Dog d1 = dg1.makeDog("happy", 24);
		 System.out.println(d1);
		 System.out.println(d1.getName());
		 System.out.println(d1.getAge());
		 
		 CatRegistManegementService yy = new CatRegistManegementService();
		 Cat p = yy.makeCat("æﬂøÀ¿Ã", 3 ,'ø©');
		 System.out.println(p);
		 System.out.println(p.getName());
		 System.out.println(p.getAge());
		 System.out.println(p.getAa());
		 
	
	}

}
