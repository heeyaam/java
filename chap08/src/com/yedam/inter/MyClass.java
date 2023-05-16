package com.yedam.inter;

public class MyClass {
	//인터페이스가 사용할수 있는공간
	//1. 필드
	Remotcontrol rc = new Television();
	
	//2. 생성자에서 가능
	public MyClass() {
		
	}
	
	public MyClass(Remotcontrol rc) {
		this.rc = rc;
		rc.turnOn();
		rc.turnOff();
		
	}
	
	public void methodA() {
		Remotcontrol rc = new Audio(); 
		rc.turnOn();
		rc.turnOff();
	}
	
	public void methodB(Remotcontrol rc) {
		rc.turnOn();
		rc.turnOff();
		
	}
}
