package com.ezen;

public class Test {
	private int sum = 0;
	
	public void me1(int a) {
		
		
		switch (a) {
		case 3:
			System.out.println(3333);
			System.out.println(1111);
			
			break;
		case 4:
			System.out.println(4444);
			System.out.println("end");
			
			break;
		case 5:
			System.out.println(5555);
			System.out.println("oh");
			break;

		default:
			System.out.println("fine");
			break;
		}
		
	}
	
	public void me2(int a) {
		switch (a) {
		case 3:
			System.out.println(333);
			break;
		case 4:
			System.out.println(444);

		default:
			System.out.println(999);
			break;
		}
		
	}
	public void me3(int a) {
		switch (a/10) {
		case 1:
			System.out.println("10~19");
			
			break;
		case 2:
			System.out.println("20~29");

		default:
			System.out.println("end");
			break;
		}
		
	}
	public void me31(int a) {
		int data = a/10;
		
		switch (data) {
		case 1:
			
			break;

		default:
			break;
		}
		
	}
//	public void me5(long a) {
//		switch (a) {
//		case 10L:
//			
//			break;
//
//		default:
//			break;
//		}
//		
//	}
	public void me6(int month) {
		switch (month) {
		case 1:
						
		case 3:			
			
		case 5:
						
		case 7:			
			
		case 8:
				
		case 10:		
			
		case 12:
			System.out.println("31일까지 있습니다.");
			
			break;
						
		case 2:
			System.out.println("28일까지 있습니다.");
			
			break;
		default:
			System.out.println("30일까지 있습니다.");
			break;
		}
		
		
	}
	public void me7(int score) {
		switch (score/10) {
		case 10:
		case 9:
				 System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		case 6:
			System.out.println("양");
			break;

		default:
			System.out.println("가");
			break;
		}
		
	}
	public void me8(String a , String b) {
		// a변수에 b의 값을 넣고
		// b 변수에는 a의 값을 넣으려고 합니다
		// 치환 알고리즘.
		String c = a;
		a = b;
		b =c;
		
	}
	
	public void me9(int a) {
		sum = sum +a;
		//sum += a;
		System.out.println(sum);
		
		
		
	}


}
