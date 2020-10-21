package kr.co.ezen;

public class MethodTest {
	
	
	
	int a;
	boolean b = true;
	
	public MethodTest() {
		
		
	}
    public void stand() {
    	
    	System.out.println("무반환 무파람");
    }
	
	
	public void sleep( ) {
		System.out.println("public: 접근제한자로 프로젝트 전체에서 sleep메서드가 호줄될 수 있음을 의미함.");
		System.out.println("void: 반환형이라 하고, 이는 반환되는 데이터의 자료형을 의미한다.void는 반환되는 데이터가 없다는 것을 의미한다.");
		System.out.println("sleep: 메서드의 이름이고, 나중에 메서드를 호줄할 때 그 이름을 적어 줌으로써 메서드 본문 안에 있는 코드를 실행하게 함.");
		System.out.println("(): 파라미터, 매개변수 선언하는 곳으로 마치 변수를 선언하듯 작성하면 됨. 파라미터가 두 개 이상일 때는 ,를 구분자로 해서 구분을 해줌.");
		System.out.println("{}: 매서드의 본문..매서드 호출 때 실행하고 싶은 코드를 작성해줌");
		System.out.println("매서드 호출: 매서드를 사용하는 것을 의미. 사용법은 메서드명을 적고 소괄호를 칩니다. 그리고 그 소괄호 안에 파라미터의 자료형에 맞는 값을 넣어줍니다.");
	}
	
	public void sayHello() {
		System.out.println("hello~");
		
	}
	
	public void sitDown() {
		System.out.println("그 자리에 즉시 앉음.");
		sayHello();
	}
	
	public void callName(String a) {
		System.out.println("안녕하세요"+a);
	}
	
	public void printDan(int dan) {
		System.out.println(dan*1);
		System.out.println(dan*2);
		System.out.println(dan*3);
		
	}
	
	public void printScore(String name,int score) {
		System.out.println(name+score+"점");
		
	}
	
    public void weight(String name , int cm , int weight ) {
    	System.out.println(name +" "+ cm +"cm"+ " " + weight + "kg");
    	
    }
	
	public void printemail(String mail) {
		weight("김하민", 180, 122);
		System.out.println(mail + "@naver.com");
		
		
		
		}
	
	
	public void printme(String address ,int age , String num) {
		weight("장준호", 175, 80);
		System.out.println(age+"세");
		System.out.println(num);
		System.out.println(address);
		
		
	}
	
	
	public void printa(int a) {
		System.out.println(100/a);
		System.out.println(90/a);
		System.out.println(80/a);
		System.out.println(70/a);
		System.out.println(60/a);
		System.out.println(50/a);
		System.out.println(40/a);
		System.out.println(30/a);
		
	}
	
	public void printlong(long uu) {
		System.out.println(uu+99999999);
		System.out.println(uu+88888888);
		System.out.println(uu+777777777);
	}
	
	public void printchar(char u) {
		System.out.println(u + u + u);
		
	}
	
	public void ccc(char a , char b , char c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}
	
	public void num(float f) {
		System.out.println(f*8);
		
	}
	
	
	public void qq(int z , String x) {
		System.out.println(z-1+x);
		System.out.println(z-2+x);
		System.out.println(z-3+x);
		System.out.println(z-4+x);
		System.out.println(z-5+x);
		System.out.println(z-6+x);
		System.out.println(z-7+x);
		
		
	}
	
	public void ttt(boolean f ) {
		System.out.println(f);
		
	}
	public void ooo(char k) {
				printme("경기도 의정부시", 24, "010-4050-7520");
				System.out.println(k);
	}
	 
	
	
	
	
	
}
