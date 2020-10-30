package com.naver;

import java.security.PublicKey;

public class Test {
	public void me1() {
		// i j k l n
		for(int a = 0; a < 10;  a ++) {
			System.out.println("hello world");
		}
		
	}
	public void me2() {
		for(int i = 0 ; i<101 ; i ++) {
			System.out.println(i);
		}
		
	}
	public void me3() {
		for(int j = 0; j < 51; j++ ) {
			int a = j*2;
			System.out.println(a);
		}
		
	}
	public void me4() {
		for(int i = 0; i <51; i ++) {
			int a = i*2+1;
			System.out.println(a);
		}
		
	}
	public void me4(int n) {
		for(int i = 0; i < n; i++ ) {
			int a = i*2+1;
			System.out.println(a);
			
		}
		
		
		
	}
	public void dan(int dan) {
		for(int i = 1; i <10; i++) {
			System.out.println(dan +"x"+i +"="+dan*i);
			
		}
		
	}
	public void sossu(int num) {
	
		for(int i = 2; i < num+1;i++) {
			if(num % i == 0) {
				//1.i가 num의 약수이지만 num은 아닌 상황-->소수
				//2.i == num :소수
				if ( i == num) {
					System.out.println("소수");
				}else {
					System.out.println("소수가 아님");
					break;
				}
			}
		}
		
		
		
		
		
	}
	public void me5() {
		for(int i = 0; i<10; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		
	}
	public void me5(int n) {
		for(int i =0; i < n; i++)
		System.out.print("*");
		System.out.println();
	}
	
	public void gugudan() {
		for (int i =2; i<10; i++) {
			dan(i);
			System.out.println();
		}
		
	}
	
	public void printStar() {
		for(int i = 0;i < 5; i++) {
		 me5(i+1);
		 
		}
		
	}
	public void printStar(int n) {
		for(int i = 0; i < n; i++) {
			me5(i+1);
		}
		
	}
	public void me6() {
		for (int i = 10; i >=0; i--) {
		System.out.println(i);	
		}
		
	}
	
	public void halfDiamond() {
		int n =10;
		for (int i = 0; i < n; i++) {
			if(i< n/2) {
				me5(i+1);
			}else {
				me5(n-i-1);
			}
		}
	}
	public void me10() {
		for (int i = 0; i < 5; i++) {
			System.out.println("장준호");
			
		}
		
	}
	public void dan2(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "x" + i + "="+dan*i);
		}
		
	}
	public void gugudan2() {
		for (int i = 2; i < 10; i++) {
			dan2(i);
			System.out.println("-------------------");
			
		}
	}
	public void me0() {
		for (int i = 0; i < 20; i++) {
			int b = i*2+1;
			System.out.println(b);
			
			
		}
		System.out.println("------------------");
	}
	public void me11() {
		for (int i = 0; i < 10; i++) {
			System.out.println("hello world");
			
		}System.out.println("-----------------");
	}
	public void me12() {
		for (int i = 1; i < 10; i++) {
			int a = i*2;
			System.out.println(a);
		}
		System.out.println("-------------");
	}
	
	
	
	
	
	
	
	
	
    
}
