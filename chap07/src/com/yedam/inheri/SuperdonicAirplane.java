package com.yedam.inheri;

public class SuperdonicAirplane extends AirPlane {
	public static final int NORMAL =1;
	
	public static final int SUPERSONIC =2;
	
	//기본 비행 -> 일반 비행(default)
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행");
		}else {
			super.fly();
		}
		
		super.fly();
		
	}
	
	
	

}
