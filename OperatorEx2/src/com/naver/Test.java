package com.naver;

public class Test {
	public boolean me1(int a , int b) {
		return a > b;
				
	}
	public boolean me2(long a ,long b) {
		boolean result = a >= b;
		return a >= b;
		
	}
	public String me3(float a , float b) {
		 boolean result = a < b;
		if(result) {
			return "ok";
		}else {
			return "no";
		}
		 								
	}
	public boolean me4(byte a , byte b) {
		 return a <= b;
		
	}
	public void me5(short a ,short b) {
		System.out.println(a == b);
		 
	
	}
	public void me51(boolean a , boolean b) {
		System.out.println(a == b);
		
		
		
	}
	public void me6(boolean a , boolean b) {
		System.out.println(a != b);
		
	}
	
	

}
