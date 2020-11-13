package com.naver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	public void me8() {
		
		List<Apple> list = new ArrayList<Apple>();
		list.add(new Apple("a001", "�뱸", "���1", 1500));
		list.add(new Apple("a002", "����", "���2", 2000));
		list.add(new Apple("a003", "����", "���3", 3000));
		list.add(new Apple("a004", "�λ�", "���4", 2500));
		list.add(new Apple("a005", "û��", "���5", 1000));
		
		// list�� �ִ� ����� [���� : �̸�]�� ��� ����Ͻÿ�.
		// ��, idx�� 0�� ��쿡�� ��� ����.
		
		for(int i=0; i<list.size();i++) {
			if(i==0) {
				continue;
			}
			Apple apple = list.get(i);
			System.out.println(apple);
		}
		
		
		//list�� �ִ� ��ü �� id��  a003�� a004�� �����͸� �����Ͻÿ�.
		
		list.remove(new Apple("a003", null, null, 0));
		list.remove(new Apple("a004", null, null, 0));
		
		System.out.println(list);
		
		
		list.clear();
		System.out.println(list);
		
		
		
		
	}
	
	public List<MemberDTO> me7() {
		//main()���� me7()ȣ��, �׷� �Ŀ� ��ȯ�Ǵ� ������ �� �� ��° ��ü�� name�� ���
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		
		list.add(new MemberDTO("m001", "kim", 5));
		list.add(new MemberDTO("m002", "lee", 12));
		list.add(new MemberDTO("m003", "park", 53));
		list.add(new MemberDTO("m004", "kang", 55));
		list.add(new MemberDTO("m005", "choi", 11));
		
		return list;
	}
	
	public void me6() {
		//list ��ü�� ����ÿ�. ��, Map<String, Object>�� ���� �� ����.
		
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		
		list.add(new HashMap<String, Object>());
		
		for(int i = 0; i<list.size();i++) {
			Map<String, Object> map = list.get(i);
			System.out.println(map);
		}
		
		
		list.clear();
		
		
		
	}
	
	public void me5() {
		//list ��ü�� ����ÿ�. ��, Thread�� ���� �� ����.
		List<Thread> list = new ArrayList<Thread>();
		
		list.add(new Thread());
		list.add(new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}));
		
		
		// list�� �ִ� ��ü�� ��� ����Ͻÿ�.
		
		
		for(int i=0;i<list.size();i++) {
			Thread t = list.get(i);
			System.out.println(t);
		}
		
		
		
		
	}
	
	public void me4() {
		//list  ��ü�� ����ÿ�. ��, new StringBuffer()�� ���� �� ����.
		List<StringBuffer> list = new ArrayList<StringBuffer>();
		list.add(new StringBuffer());
		
		// list�� ��� �ִ� ��� �����͸� ����Ͻÿ�.
		
		for(int i = 0; i < list.size(); i++) {
			StringBuffer sb = list.get(i);
			System.out.println(sb);
		}
		
		
		// list�� ��� �ִ� ��� �����͸� �ݺ����� �̿��Ͽ� �����Ͻÿ�.
		
		for(int i=list.size()-1; i>=0;i--) {
			list.remove(i);
		}
		
		
	}
	
	
	public void me3() {
		//list ��ü�� ���弼��. ��, 3.5, 4.1, 9.8�� �Է��� �� �ִ� ��ü�Դϴ�.
		List<Double> list = new ArrayList<Double>();
		
		list.add(3.5);
		list.add(4.1);
		list.add(9.8);
		
		double num = list.get(1);
		System.out.println(num);
		
		for(int i =0; i< list.size();i++) {
			num = list.get(i);
			System.out.println(num);
		}
		
		//list�� ��� �ִ� ������ ��ڰ��� 1.1�� �����ϰ� �ͽ��ϴ�.
		//1. ������ ��ڰ��� �ε��� ��� ���ұ�?
		int idx = list.size()-1;
		
		//2. 1.1�� ��� �����ұ�?
		list.set(idx, 1.1);
		
		
		
		// list�� �ִ� �����͸� �ݺ����� �̿��ؼ� ���� �����Ͻÿ�.
		for(int i = list.size()-1; i >= 0; i--) {
			list.remove(i);
		}
		
		
	}
	
	public void me2() {
		//list ��ü�� ����� �ּ���. ��, ���׸� Ÿ���� 3, 4, 5, 6�� �Է��� �� �ְ�
		List<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(5);
		list.add(6);
		
		int num = list.get(2);
		System.out.println(num);
		
		
		for(int i =0 ;i < list.size();i++) {
			num = list.get(i);
			System.out.println(num);
			
		}
		
		list.set(1, 100);
		System.out.println(list);
		
//		list.remove(1);
//		list.remove(2);
		
		list.remove(2);
		list.remove(1);
		
		System.out.println(list);
		
		
	}
	
	public void me1() {
		List<Apple> list = new ArrayList<Apple>();
		list.add(new Apple());
		
		Apple iphone12 = list.get(0);
		// list�� ��� �ִ� ��� ��ڰ��� ����Ͻÿ�.
		for(int i=0; i < list.size(); i++) {
			Apple apple = list.get(i);
			System.out.println(apple);
		}
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
}
