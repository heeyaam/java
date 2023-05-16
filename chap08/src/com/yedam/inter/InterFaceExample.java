package com.yedam.inter;

public class InterFaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remotcontrol rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.setVolume(12);
		rc.setVolume(-50);
		rc.turnOff();
		
		
		//인터페이스가 상속관계이므로 Television에서 Remotcontrol을 사용하여 Searchable꺼를 사용할수 있다.
		// Searchable 로는 Remotcontrol의 기능 사용못함
		rc.search("www.google.com");
		
		
//		rc = new Audio();
//		rc.turnOn();
//		rc.setVolume(5);
//		rc.setVolume(12);
//		rc.setVolume(-50);
//		rc.turnOff();
		
		//인터페이스 끼리 상속전에는 따로 정의해야함
		Searchable rc2 = new Television();
		rc2.search("www.naver.com");
//		rc2.turnOn(); -> 불가능 앞에 클래스에 따라 결정됨
		
		
		
		
		InterpaceC ic = new ImplimentsC();
		ic.method1();
		ic.method2();
		ic.method3();
		
		

	}

}
