package com.naver;

public class Test {
	public void me1() {
		//����� ��ü ������
		String msg = new String("hello");
		
	}
	public void me2() {
		//�Ͻ��� ��ü ������
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
		
		//String Ŭ������ ��ü ���� �� ���� ��� �н�
		//1. ����� ��ü ������
		//2. �Ͻ��� ��ü ������
		//�� �� ����� �޸� ���鿡�� ��� �ٸ����� �н�
		//�� �����Ͱ� ���� ���, ������ü�� �ν��ϰ� �ϴ� ���
		//�� �����ڷ��������� == �Ⱦ�
		//�� �����ڷ������� �񱳿����� ������ ���� �̷�����? equals()
		//���ϼ��� vs ��� ��
		// == vs equals()
	}
	public void me4() {
		StringBuffer sb = new StringBuffer();
		//StringŬ������ �Һ��� ����...
		
		
		
		//���ڿ��� ����ؼ� ���� �Ǵ� ���
		//StringŬ������ ����ϸ�
		//���� ���ϰ� �߻��Ѵ�.
		//StringBuffer�� ����ϼ���
		
		//msg = "";
		//msg += "�ȳ��ϼ���";
		//msg += "���� ȫ�浿�Դϴ�";
		//msg += "���� ���� ������� �ô뿡 ��� �ֽ��ϴ�";
		
		sb.append("�ȳ��ϼ���");
		sb.append("���� ȫ�浿�Դϴ�");
		sb.append("���� ���� ������� �ô뿡 ��� �ֽ��ϴ�");
		sb.toString();
		System.out.println(sb.toString());
				
		
		
		
	}
	public void me41() {
		StringBuffer sb1 = new StringBuffer();
		sb1.append("�ȳ��ϼ���");
		sb1.append(" "+"���� ����ȣ�Դϴ�");
		sb1.append(" "+"���� �����ο� ��� �ֽ��ϴ�.");
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
