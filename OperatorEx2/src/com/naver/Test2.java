package com.naver;

public class Test2 {
	private boolean b = false;
	private boolean r = true;
	
	public void k1(boolean a, boolean b) {
		
		 boolean result  = a && b;
		 System.out.println(result);
		
	}
	
	public void k2(boolean a,boolean b) {
		boolean result = a || b;
		System.out.println(result);
		
	}
	
	public void k3(boolean a) {
		System.out.println(!a);
		System.out.println(a);
		
	}
	public void switchboolean() {
		b = !b;
	   System.out.println(b);
		
		
	}
	public void switchboolean2() {
		r = !r;
		System.out.println(r);
		
	}
	

}
