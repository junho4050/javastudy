package com.naver;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public void me1() {
		Set<Integer> set = new HashSet<Integer>();
		
	set.add(1);
	}
	public void me2() {
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add(new String("hello"));
		set.add("hello");
		set.add("Hello");
		set.add(new String("Hello"));
		set.add(new String("HELLO"));
	}
	public void me3() {
		Set<Apple> set = new HashSet<Apple>();
		
		set.add(new Apple("a001", "�뱸", "���1", 1500));
		set.add(new Apple("a002", "����", "���2", 2000));
		set.add(new Apple("a003", "����", "���3", 3000));
		set.add(new Apple("a004", "�뱸", "���4", 500));
		set.add(new Apple("a005", "û��", "���5", 1000));
	}
	public void me4() {
		Set<MemberDTO> set = new HashSet<MemberDTO>();
		set.add(new MemberDTO("m001", "kim", 4));
		set.add(new MemberDTO("m002", "lee", 11));
		set.add(new MemberDTO("m003", "park", 32));
		set.add(new MemberDTO("m004", "kang", 43));
		set.add(new MemberDTO("m005", "choi", 2));
	}

}
