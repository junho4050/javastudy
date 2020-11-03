package com.naver;

public class Test {
	public void me1() {
		int [] arrint = new int [4];
		
		//arrint에 0,1,2,3을 입력하시오
	 for (int i = 0; i < arrint.length; i++) {
		 arrint[i] = i;
		
	}
	 for (int i = 0; i < arrint.length; i++) {
		arrint[i] = i*2;
	}
	 for (int i = 0; i < arrint.length; i++) {
		arrint[i] = i*2+1;
				
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(arrint.length);
		arrint[0] = 100;
		arrint[1] = 200;
		arrint[2] = 300;
		arrint[3] = 400;
		System.out.println(arrint[0]);		
		System.out.println(arrint [1]);
		System.out.println(arrint[2]);
		System.out.println(arrint[3]);
		
		for( int i = 0; i<arrint.length;i++) {
			System.out.println(arrint[i]);
		}
		
		
	}
	
	
	
	public void me0() {
		//1.반복문 사용을 위해서
		//2.여러 개의 데이터를 반환하기 위해서.
		
		int a0 = 3;
		int a1 = 6;
		int a2 = 3;
		int a3 = 7;
	}
	public int[] me01() {
		int[] arr = {3,6,3,7};
		
		for(int i = 0; i < arr.length;i++) {
			System.out.println(arr[i]);
		}
		return arr;
	}
	public void me11() {
		StringBuffer[] arrSb = new StringBuffer[100];
		System.out.println("--------------------");
		
		System.out.println(arrSb[50]);
		
		StringBuffer sb1 = new StringBuffer();
		sb1 = arrSb[1];
		for(int i = arrSb.length-1; i>=0;i--) {
			System.out.println(arrSb[i]);
		}
	
		
		
		System.out.println("-----------------------");
		System.out.println(arrSb.length);
	}
	
	
	public void me12(Dog[] dogs) {
		System.out.println(dogs.length);
					    
	    dogs[dogs.length -1] = null;
	    for(int i =0; i<dogs.length;i++) {
	    	//System.out.println(dogs[i].getName());
	    	Dog dog = dogs[i];
	    	
	    	if (dog != null) {
				String name = dog.getName();
				System.out.println(name);
			}
	    }
	  
		
		
		
		
		 
	}
	
	
	
	
	
	public void me13() {
		String data = "teacheryo#1#seoul#226#-1";
		String[] arrData = data.split("#");
		System.out.println(arrData.length);
		
		arrData[arrData.length -1] = "100";
		arrData[0 ] = "ezen";
	 for(int i = 0;i < arrData.length;i++) {
		 System.out.println(arrData[i]);
		 System.out.println(arrData[i].charAt(0));
	 }
		
		
	}
	public void me2() {
		// 자료형[] 배열명 = {값1 , 값2 , 값3};
		int[] arrInt = {1,4,6};
		System.out.println(arrInt.length);
		System.out.println(arrInt[1]);
		arrInt[1] = 333;
		System.out.println(arrInt[1]);
		for(int i = 0;i<arrInt.length;i++) {
			System.out.println(arrInt[i]);
			
			if (i == 1) {
				continue;
				
			}System.out.println(arrInt[i]);
				int num = arrInt[i];
				if (num != 6) {
					System.out.println(num);
				}
			
		}   
	
		
	}
	public void me21() {
		Dog[] arrDog = {new Dog(),new Dog() };
		System.out.println(arrDog.length);
		
		arrDog[arrDog.length -1] = null;
		
		Dog dog = arrDog[1];
		
		if (dog != null) {
			System.out.println(dog.getName());
			
		}
			
			
		}
		
		//Dog a = new Dog();
	//	Dog b = new Dog();
		//Dog[] arrDog = {a,b};
		
		
		 
		
	
	public void me22(String[] arrStr) {
		System.out.println(arrStr.length);
		arrStr[1] = "12";
		System.out.println(arrStr[1]);
		
		String s1 = arrStr[1];
		
		
		}
		
		
		
	
	public void me3() {
		int[] arrint = new int[ ] {1,3,5,7};
		
		
		
		
	}
	public void me31() {
		float[] arrFloat = new float[] {3.14f , 4.2f, 9.8f};
		System.out.println(arrFloat.length);
	}
	public void me32(Dog[] dogs) {
        int size = dogs.length;
		System.out.println(size);
	}
	int[] arrException = {1,2,3};{
		System.out.println(arrException[3]);
	}
	     
	
	
	
}
