package com.naver;

public class Phone {
	private boolean power;
	private int vol;
	
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	

	
	

	public Phone(boolean power, int vol, String call) {
		super();
		this.power = power;
		this.vol = vol;
	
	}
	public void phoneOn() {
		power = true;
		
		
	}
	public void phoneOff() {
		power = false;
		
	}
	public void phoneVolUp() {
		if(!power) {
			return;
		}
		
		
		++ vol;
		if (vol > 100) {
			vol = 0;
		}
		
	}
	public void phoneVolDown() {
		if (!power) {
			return;
		}
		--vol;
		if (vol < 0) {
			vol = 0;
		}
		
	}

}
