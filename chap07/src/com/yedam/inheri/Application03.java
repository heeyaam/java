package com.yedam.inheri;



public class Application03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r =10;
		
		Computer com = new Computer();
		System.out.println("원면적" + com.areaCircle(r));
	
	Child child = new Child();
	
	// 부모 객체
//	child.getInfo();  //override
//	child.method1();
//	child.method2();
//	
//	// 자식 객체
//	child.method3();
	
	SuperdonicAirplane sa = new SuperdonicAirplane();
	
	sa.takeOff();
	sa.fly();
	sa.flyMode = SuperdonicAirplane.SUPERSONIC;
	sa.fly();
	sa.flyMode = SuperdonicAirplane.NORMAL;
	sa.fly();
	sa.land();
	
	
	
	
	
	}

}
