package com.yedam.inter;

public class MyClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("필드=======");
		
		MyClass myclass = new MyClass();
		
		myclass.rc.turnOn();
		myclass.rc.setVolume(1);
		
		
		System.out.println("2.생성자 ==========");
		
		MyClass myClass2 = new MyClass(new Audio());
		myClass2.rc.turnOn();
		myClass2.rc.turnOff();
		
		
		System.out.println("3.메소드===============");
		MyClass myclass3 = new MyClass();
		myclass3.methodA();
		
		System.out.println("4. 메소드==========");
		MyClass myclass4 = new MyClass();
		myclass4.methodB(new Television());
		myclass4.methodB(new Audio());
	}

}
