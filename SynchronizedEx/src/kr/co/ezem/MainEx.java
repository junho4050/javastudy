package kr.co.ezem;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum sum = new Sum();
		
		//Test t1 = new Test(sum, 1, 10000);
		Test t1 = new Test(sum, 1, 5000);
		Test t2 = new Test(sum, 5001, 10000);
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(sum.getNum());
		System.out.println(sum.getTes());

	}

}
