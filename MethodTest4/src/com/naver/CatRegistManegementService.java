package com.naver;

import kr.co.ezen.Cat;

public class CatRegistManegementService {
	private Cat cat;
	
	public CatRegistManegementService( ) {
		
	}

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}
   public Cat makeCat(String name,int age,char aa) {
	   Cat t = new Cat();
	   t.setName(name);
	   t.setAge(age);
	   t.setAa(aa);
	   
	   return t;
	
}
}
