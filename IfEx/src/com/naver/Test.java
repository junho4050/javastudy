package com.naver;

import java.security.PublicKey;

public class Test {
	
	public void me1() {
		
		int a =10;
		if(a % 5 == 0) {
			System.out.println(5);
		}
		
	}
	public void me2(int a) {
		if( a % 5 == 0 && a % 6 == 0) {
			System.out.println(30);
		}
		
	}
	
	public void me3(int a) {
		if(a!=10 == true) {
		System.out.println(true);
		
	}
	}
	public String me4(int a) {
		if (a <= 10){
		return "ok";
				
	}else {
		return "no";
	}
}
	
	public void me5(int x) {
		if(x<0) {
			System.out.println(3);
			
		}else {
			System.out.println(-3);
		}
		
	
		
	}
	
	public void me6(int a) {
		
		if(a % 2 == 0) {
			System.out.println(0);
		}else if(a % 3 == 0){
			System.out.println(3);
		}else if(a % 5 == 0) {
			System.out.println(5);
		}else System.out.println(0);
		
	}
	
	public char me7(int score) {
		char result = '��';
		if (score >= 90) {
			result = '��';
		}else if (score >= 80) {
			result = '��';
		}else if (score >= 70) {
			result = '��';
		}else if (score >= 60) {
			result = '��';
		}else {
			result = '��';
		}
		return result;
		
		
	}
	
	
	
	
	
	
	
	
	
}