package com.naver;

public class Person {
	private TV tv1;
	private Phone ph1;
	
	public Phone getPh1() {
		return ph1;
	}

	public void setPh1(Phone ph1) {
		this.ph1 = ph1;
	}

	public Person(TV tv1, Phone ph1) {
		super();
		this.tv1 = tv1;
		this.ph1 = ph1;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(TV tv1) {
		super();
		this.tv1 = tv1;
	}

	public TV getTv1() {
		return tv1;
	}

	public void setTv1(TV tv1) {
		this.tv1 = tv1;
	}
	public void tvOn() {
		System.out.println("TV¸¦ Åµ´Ï´Ù");
		tv1.powerOn();
		
	}
	public void tvOff() {
		System.out.println("TV¸¦ ²ü´Ï´Ù");
		tv1.powerOff();
		
	}
	public void PhoneOn() {
		System.out.println("ÆùÀ» ÄÕ´Ï´Ù");
		ph1.phoneOn();
		
	}
	public void PhoneOff() {
		System.out.println("ÆùÀ» ²ü´Ï´Ù");
		ph1.phoneOff();
		
	}
	

}
