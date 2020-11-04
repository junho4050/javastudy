package com.naver;

public class Test {
	public void me1() {
		//명시적 객체 생성법
		String msg = new String("hello");
		
	}
	public void me2() {
		//암시적 객체 생성법
		String msg2 = "hello";
	}
	public void me3() {
		String msg1 = new String("a");
		String msg2 = new String("a");
		String msg3 = "a";
		String msg4 = "a";
		
		System.out.println(msg1 == msg2);
		System.out.println(msg1 == msg3);
		System.out.println(msg3 == msg4);
		System.out.println("------------");
		System.out.println(msg1.equals(msg2));
		System.out.println(msg1.equals(msg3));
		
		//String 클래스의 객체 생성 두 가지 방법 학습
		//1. 명시적 객체 생성법
		//2. 암시적 객체 생성법
		//ㅁ 두 방법이 메모리 측면에서 어떻게 다른지도 학습
		//ㅁ 데이터가 같을 경우, 같은객체로 인식하게 하는 방법
		//ㅁ 참조자료형에서는 == 안씀
		//ㅁ 참조자료형에서 비교연산은 무엇을 통해 이뤄지냐? equals()
		//동일성비교 vs 동등성 비교
		// == vs equals()
	}
	public void me4() {
		StringBuffer sb = new StringBuffer();
		//String클래스는 불변적 성격...
		
		
		
		//문자열이 계속해서 누적 되는 경우
		//String클래스를 사용하면
		//성능 저하가 발생한다.
		//StringBuffer를 사용하세요
		
		//msg = "";
		//msg += "안녕하세요";
		//msg += "저는 홍길동입니다";
		//msg += "저는 조선 세종대왕 시대에 살고 있습니다";
		
		sb.append("안녕하세요");
		sb.append("저는 홍길동입니다");
		sb.append("저는 조선 세종대왕 시대에 살고 있습니다");
		sb.toString();
		System.out.println(sb.toString());
				
		
		
		
	}
	public void me41() {
		StringBuffer sb1 = new StringBuffer();
		sb1.append("안녕하세요");
		sb1.append(" "+"저는 장준호입니다");
		sb1.append(" "+"저는 의정부에 살고 있습니다.");
		System.out.println(sb1.toString());
	}
	public void me31() {
		StringBuffer msg1 = new StringBuffer();
		StringBuffer msg2 = new StringBuffer();
		String msg3 = new String("asd");
		String msg4 = new String("asd");
		
		
		msg1.append("asd").toString();
		msg2.append("asd").toString();
		
		
		
		
		System.out.println(msg1.equals(msg2));
		System.out.println(msg2.equals(msg4));
		
		
	}
	
	
	
}
