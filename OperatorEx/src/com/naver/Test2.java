package com.naver;

public class Test2 {
	public void s1() {
		int a = 3;
		int b = 4;
		
		a += b;
		
		System.out.println(a);
		System.out.println(b);
		
	}
	public void s12() {
		int a =3;
		int b =4;
		
		b += a;
		System.out.println(a);
		System.out.println(b);
		
	}
	public void s2(int a , int b) {
		int c = a -= b;
		//a = a -b;
		
		System.out.println(a);
		System.out.println(b);
		
	}
	public void s3(int a , int b) {
		int c = a *= b;
		
			
		System.out.println(c);
		System.out.println(b);
		
		
	}
	public void s4(int a , int b) {
		
		 int c = a /= b;
		     
		System.out.println(c);
		System.out.println(b);
		
		
	}
	public void s5(int a , int b) {
		
		
		int c = a %= b;
		
		System.out.println(c);
		System.out.println(b);
	}

}
