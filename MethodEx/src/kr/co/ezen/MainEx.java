package kr.co.ezen;

public class MainEx {
	public static void main(String[] args) {
		
		MethodTest mt1 = new MethodTest();
		
		MethodTest mt2 = new MethodTest();
		
		MethodTest mt3 = new MethodTest();
		
		MethodTest mt4 = new MethodTest();
		
		MethodTest mt5 = new MethodTest();
		
		mt1.stand();
		mt1.sleep();
		mt1.sayHello();
		mt1.sitDown();
		
		mt2.sitDown();
		mt2.callName("����ȣ");
		mt2.printDan(3);
		mt2.printScore("ȫ�浿", 100);
		mt2.printScore("����ȣ", 99);
		
		mt3.weight("���Ϲ�", 180, 122);
		mt3.printemail("wnsgh74123");
		
		mt3.printme("��⵵ �����ν�", 24, "010-4050-7520");
		mt3.printa(5);
		
		mt4.printlong(8888888L);
		mt4.printchar('��');
		mt4.ccc('��', '��', 'ȣ');
		
		
		mt4.num(3.14F);
		mt4.qq(789, "��");
		mt4.ttt(true);
		
		mt5.ooo('��');
		
		
	}

}
