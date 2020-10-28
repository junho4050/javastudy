package com.naver;

public class Test4 {
	
	private int a;
	private int b;
	
	public Test4() {
		// TODO Auto-generated constructor stub
		a =4;
		b =11;
	}
	
	public void con1() {
		
	char c = a>=b? 'a':'z';
		
	}
	
    public void cond2() {
    	
    	String c = a!=b ? "hello":"no";
		
	}
    public void cond3() {
		StringBuffer c = a <= b ? new StringBuffer("hello"): new StringBuffer("no");
	}
    public int me1() {
    	return 3;		
	}
    public void me2() {
		System.out.println(a);
		
	}
    public void con4() {
    	int c = a > b*2? me1():a;
		
	}
    public void cond5(int score) {
    	char c = score >= 90?'A': score >= 80?'B': score >= 70?'C':score >= 60? 'D':'F';
		System.out.println(c);
	}
    
    
}
