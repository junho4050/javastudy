package com.naver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public void me1() {
		//1.Map, Hash
		//2.map ��ü�� ���弼��
		//��, key: string, value: integer
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		//map�� ������ �Է�
		map.put("�߷� ���ӵ�", 9);
		map.put("�츮�� ��й�ȣ", 12345);
		map.put("����� �λ��� �Ÿ�", 300);
		
		System.out.println(map);
		
		int g = map.get("�߷� ���ӵ�");
		System.out.println(g);
		
		int password = map.get("�츮�� ��й�ȣ");
		System.out.println(password);
		
		int leng = map.get("����� �λ��� �Ÿ�");
		System.out.println(leng);
	}
	public void me2() {
		//1. map ��ü�� ����
		//��, k: integer, v: string
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "kim");
		map.put(0, "lee");
		map.put(2, "park");
		map.put(1, "kang");// ���� value�� kim ->kang���� ����
		
		
		
		String a = map.get(0);
		System.out.println(a);
		
		String b = map.get(2);
		System.out.println(b);
		
		String c = map.get(1);
		System.out.println(c);
		
	}
	public void me3() {
		//1. map ��ü�� ����
		// ��, k:string, v: list<string>
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> list1 = new ArrayList<String>();
		
		list1.add("sonata");
		list1.add("exel");
		list1.add("genesis");
		list1.add("grandure");
		
		List<String> list2 = new ArrayList<String>();
		
		list2.add("k7");
		list2.add("k5");
		list2.add("pride");
		list2.add("����");
		
		map.put("������", list1);
		map.put("�����", list2);
		
		List<String> hc = map.get("������");
		System.out.println(hc);
		for (int i = 0; i < hc.size(); i++) {
			System.out.println(hc.get(i));
		}
		
		List<String> kia = map.get("�����");
		System.out.println(kia);
		for (int i = 0; i < kia.size(); i++) {
			System.out.println(kia.get(i));
		}
		
		
	}
	public void me4() {
		Map<String, List<Dog>> map = new HashMap<String, List<Dog>>();
		List<Dog> list1 = new ArrayList<Dog>();
		list1.add(new Dog("d001", "������", "������", 3));
		list1.add(new Dog("d002", "�鱸", "������2", 4));
		
		List<Dog> list2 = new ArrayList<Dog>();
		list2.add(new Dog("d003", "happy", "������1", 3));
		list2.add(new Dog("d003", "Ÿ��", "������2", 2));
		
		map.put("������", list1);
		map.put("���۵�", list2);
		
		List<Dog> jins = map.get("������");
		System.out.println(jins);
		for (int i = 0; i < jins.size(); i++) {
			Dog dog = jins.get(i);
			String id = dog.getId();
		}
		
		List<Dog> ses = map.get("���۵�");
		System.out.println(ses);
		
	}
	public void me5(String filename) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("txt", "��������");
		map.put("png", "�̹�������");
		map.put("gif","�̹�������");
		map.put("jpeg", "�̹�������");
		map.put("jpg", "�̹�������");
		//�׿ܴ� �ý��� ����
		int idx = filename.lastIndexOf(".");
		String key = filename.substring(idx+1);//+1�� .�� �����ϱ� ���ؼ�
		//key.tolowercase:map�� key�� ��� �ҹ��ڷ� �Ǿ� �վ.
		String msg = map.get(key.toLowerCase());
		if (msg == null) {//map�� ���� key�� �Է��ϸ� value�� null�� ��ȯ��. 
			System.out.println("�ý�������");
		}else {
			System.out.println(msg);
		}
	}

}
