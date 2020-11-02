package com.naver;

public class Test {
	
	public void me4() {
		int i =0;
		while(i<10) {
			if(i != 0 && i % 5 ==0) {
				break;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("me4()³¡");
	}
	public void me5() {
		int i = 0;
		while(i<10) {
			if(i !=0 && i % 5 ==0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
	
	public void me1() {
		int i = 0;
		while (i<101) {
			System.out.println(i);
			i++;
		}
	}
	
	public void me11() {
		int i = 100;
		while (i >= 0) {
			System.out.println(i);
			i--;
		}
	}
	public void me2() {
		int i = 0*2;
		while (i<47) {
			System.out.println(i);
			i = i+2;
		}
	}
	public void me21() {
		int i = 99;
		while(i >=21) {
			System.out.println(i);
			i = i-2;
		}
	}
	
		
		
	

   
    
			
		
	
  
    public void printPibo() {
		int a=1;
		int b =1;
		
		for(int i=0;i<15;i++) {
			int c =a +b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
    
		
	public void dan(int dan) {
		int i = 1;
		while(i<10 ) {
			System.out.println(dan + "x"+ i+ "="+(dan*i) );
			i++;
		}
	}
	public void gugudan() {
		int i = 2;
		while(i < 10) {
			System.out.println(i +"´Ü---");
			dan(i);
			i++;
		}
	}
    public void me0() {
		int i =0;
		while(i<276) {
			System.out.println(i);
			i=i+3;
			
		}
    	
	}
    public void Star() {
		int i = 0;
		while(i <10) {
			System.out.print("*");
			i++;
		}
		
	}
    public void printStar(int n) {
		int i = 0;
		while(i<n) {
		 System.out.print("*");
		 i++;
			
		}
		
	}
    public void printStar1(int n) {
		int i = 0;
		while(i< n) {
			System.out.println();			
		    printStar(i-1);
			
			i++;
		
			
		}
	}
   public void sss(int n) {
	int i =0;
	while(i<n) {
		
	}
}
	
	
		
	}
	
	
	

