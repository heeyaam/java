package com.yedam.access;

public class Application03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Singleton s1= Singleton.gerInstance();
		 
		 Singleton s2= Singleton.gerInstance();
		 
		 // 주소가 같은 하나의 객체
		 System.out.println(s1==s2);
		 
		 s1.age =100;
		 s1.name = "고길동";
		 
		 System.out.println(s1.age);
		 System.out.println(s2.name);
		 
		 Member member = new Member();
		 
	
	
	}

}
