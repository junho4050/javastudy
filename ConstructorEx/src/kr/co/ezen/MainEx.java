package kr.co.ezen;

public class MainEx {

	public static void main(String[] args) {
		
    Test1 t1 = new Test1();
    
    Test1 t2 = new Test1();
    
    t1 = new Test1();
    
    Test1 t3 = new Test1(34L);
    
    Test1 t4 = new Test1(3, 5);
    
    Person kim0 = new Person();
    System.out.println(kim0.getSsn());
    System.out.println(kim0.getName());
    System.out.println(kim0.getAge());
    System.out.println(kim0.getAddress());
    System.out.println(kim0.getJob());
    System.out.println(kim0.getDog());
    System.out.println(kim0.getCar());
    kim0.setSsn("s01");
    kim0.setName("kim");
    kim0.setAge(44);
    kim0.setAddress("seoul");
    kim0.setJob("lec");
    Person kim1 = new Person("s01", "kim", 44, "seoul", "lec",new Dog("장지환","D2", 26), null);
    
    System.out.println(kim1.getSsn());
    System.out.println(kim1.getName());
    System.out.println(kim1.getAge());
    System.out.println(kim1.getAddress());
    System.out.println(kim1.getDog().getName());
    
    MyPhone mp1 = new MyPhone("아이폰x", "01040507520", 1000000, '장', true ,new Dog("장지환","D2", 26),new Cat(24, 3.14F, "박종우","안양"));
    
    System.out.println(mp1.getName());
    System.out.println(mp1.getNumb());
    System.out.println(mp1.getPrice());
    System.out.println(mp1.getCa());
    System.out.println(mp1.getDog().getName());
    System.out.println(mp1.getDog().getA());
    System.out.println(mp1.getDog().getAge());
    System.out.println(mp1.getCat().getName());
    System.out.println(mp1.getCat().getAge());
    System.out.println(mp1.getCat().getAddress());
    
    Drink dr1 = new Drink("소주", 16, "참이슬");
    System.out.println(dr1.getName());
    System.out.println(dr1.getDosu());
    System.out.println(dr1.getName2());
   
    
    
    
   
    
    
	}

}
