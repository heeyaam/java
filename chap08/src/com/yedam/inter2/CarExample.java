package com.yedam.inter2;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frt = new HankookTire();
		System.out.println("============타이어 교체후");
		
		myCar.run();

	}

}
