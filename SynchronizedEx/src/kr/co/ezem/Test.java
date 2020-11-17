package kr.co.ezem;

public class Test extends Thread{
	
	private Sum sum;
	private int start;
	private int end;
	
	public Test() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = start; i <end+1; i++) {
			sum.addNum(i);
		}
		for (int i = start; i < end+1; i++) {
			sum.subTes(i);
		}
	}

	public Test(Sum sum, int start, int end) {
		super();
		this.sum = sum;
		this.start = start;
		this.end = end;
	}

}
