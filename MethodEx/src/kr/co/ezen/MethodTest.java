package kr.co.ezen;

public class MethodTest {
	
	
	
	int a;
	boolean b = true;
	
	public MethodTest() {
		
		
	}
    public void stand() {
    	
    	System.out.println("����ȯ ���Ķ�");
    }
	
	
	public void sleep( ) {
		System.out.println("public: ���������ڷ� ������Ʈ ��ü���� sleep�޼��尡 ȣ�ٵ� �� ������ �ǹ���.");
		System.out.println("void: ��ȯ���̶� �ϰ�, �̴� ��ȯ�Ǵ� �������� �ڷ����� �ǹ��Ѵ�.void�� ��ȯ�Ǵ� �����Ͱ� ���ٴ� ���� �ǹ��Ѵ�.");
		System.out.println("sleep: �޼����� �̸��̰�, ���߿� �޼��带 ȣ���� �� �� �̸��� ���� �����ν� �޼��� ���� �ȿ� �ִ� �ڵ带 �����ϰ� ��.");
		System.out.println("(): �Ķ����, �Ű����� �����ϴ� ������ ��ġ ������ �����ϵ� �ۼ��ϸ� ��. �Ķ���Ͱ� �� �� �̻��� ���� ,�� �����ڷ� �ؼ� ������ ����.");
		System.out.println("{}: �ż����� ����..�ż��� ȣ�� �� �����ϰ� ���� �ڵ带 �ۼ�����");
		System.out.println("�ż��� ȣ��: �ż��带 ����ϴ� ���� �ǹ�. ������ �޼������ ���� �Ұ�ȣ�� Ĩ�ϴ�. �׸��� �� �Ұ�ȣ �ȿ� �Ķ������ �ڷ����� �´� ���� �־��ݴϴ�.");
	}
	
	public void sayHello() {
		System.out.println("hello~");
		
	}
	
	public void sitDown() {
		System.out.println("�� �ڸ��� ��� ����.");
		sayHello();
	}
	
	public void callName(String a) {
		System.out.println("�ȳ��ϼ���"+a);
	}
	
	public void printDan(int dan) {
		System.out.println(dan*1);
		System.out.println(dan*2);
		System.out.println(dan*3);
		
	}
	
	public void printScore(String name,int score) {
		System.out.println(name+score+"��");
		
	}
	
    public void weight(String name , int cm , int weight ) {
    	System.out.println(name +" "+ cm +"cm"+ " " + weight + "kg");
    	
    }
	
	public void printemail(String mail) {
		weight("���Ϲ�", 180, 122);
		System.out.println(mail + "@naver.com");
		
		
		
		}
	
	
	public void printme(String address ,int age , String num) {
		weight("����ȣ", 175, 80);
		System.out.println(age+"��");
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
				printme("��⵵ �����ν�", 24, "010-4050-7520");
				System.out.println(k);
	}
	 
	
	
	
	
	
}
