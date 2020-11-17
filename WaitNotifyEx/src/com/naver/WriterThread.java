package com.naver;

public class WriterThread extends Thread{
	
	private Board board;
	
	public WriterThread() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("¿À´Ã Áøµµ ³¡");
	}

	public WriterThread(Board board) {
		super();
		this.board = board;
	}
	

}
