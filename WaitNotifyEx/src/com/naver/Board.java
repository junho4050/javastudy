package com.naver;

public class Board {
	private String todatPost;
	private boolean isOk;

	public String getTodatPost() {
		if (!isOk) {
			synchronized (this) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return todatPost;
	}

	public void setTodatPost(String todatPost) {
		
		this.todatPost = todatPost;
		isOk = true;
		synchronized (this) {
			notify();
		}
	}

	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}

}
