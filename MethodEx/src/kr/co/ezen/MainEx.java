package kr.co.ezen;

import com.naver.Dog;
import com.naver.MethodTest2;
import com.naver.MethodTest3;

public class MainEx {
	public static void main(String[] args) {
		
		MethodTest mt1 = new MethodTest();
		
		MethodTest mt2 = new MethodTest();
		
		MethodTest mt3 = new MethodTest();
		
		MethodTest mt4 = new MethodTest();
		
		MethodTest mt5 = new MethodTest();
		
		Test12 mt6 = new Test12();
		
		MethodTest2 mt7 = new MethodTest2();
		
		MethodTest3 th1 = new MethodTest3();

		
		
		mt1.stand();
		mt1.sleep();
		mt1.sayHello();
		mt1.sitDown();
		
		mt2.sitDown();
		mt2.callName("장준호");
		mt2.printDan(3);
		mt2.printScore("홍길동", 100);
		mt2.printScore("장준호", 99);
		
		mt3.weight("김하민", 180, 122);
		mt3.printemail("wnsgh74123");
		
		mt3.printme("경기도 의정부시", 24, "010-4050-7520");
		mt3.printa(5);
		
		mt4.printlong(8888888L);
		mt4.printchar('장');
		mt4.ccc('장', '준', '호');
		
		
		mt4.num(3.14F);
		mt4.qq(789, "개");
		mt4.ttt(true);
		
		mt5.ooo('남');
		
		mt6.sayHello();
		mt6.printScore("장준호", 100);
		
		int re1 = mt7.giveMeTheMoney();
		
		MethodTest2 mt8 = new MethodTest2();
		
		int re2 = mt8.giveMeTheMoney();	
		
		int re3 = mt7.giveMeTheMoney();
		
        System.out.println(mt7.giveMeTheMoney());		
		
        int zx = th1.getTest13();
        System.out.println(th1.getTest13());
        
        MethodTest3 th2 = new MethodTest3();
        
         char aa = th2.getAsd();
         System.out.println(th2.getAsd());
         
         MethodTest3 th3 = new MethodTest3();
         
         double yy = th3.getQwe();
         System.out.println(th3.getQwe());
         
         
         
         
         MethodTest3 th4 = new MethodTest3();
         boolean oo = th4.getBl();
         System.out.println(th4.getBl());
         
         MethodTest3 th5 = new MethodTest3();
         char tt = th5.getCa();
         System.out.println(th5.getCa());
         
         MethodTest3 th6 = new MethodTest3();
         byte mm = th6.getBt();
         System.out.println(th6.getBt());
         
         MethodTest3 th7 = new MethodTest3();
         int ll = th7.getIt();
         System.out.println(th7.getIt());
         
         MethodTest3 th8 = new MethodTest3();
         long cc = th8.getLg();
         System.out.println(th8.getLg());
         
         MethodTest3 th9 = new MethodTest3();
         float ee = th9.getFa();
         System.out.println(th9.getFa());
         
         MethodTest3 th10 = new MethodTest3();
         double jj = th10.getDb();
         System.out.println(th10.getDb());
         
         MethodTest3 th11 = new MethodTest3();
         Dog zz = th11.getDg();
         
         
        
         
        
		
	}

}
