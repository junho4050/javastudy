package com.naver;

public class ReaderThread extends Thread{
	
	private Board board;
	public ReaderThread() {
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(board.getTodatPost());
	}



	public ReaderThread(Board board) {
		super();
		this.board = board;
	}
	

}
