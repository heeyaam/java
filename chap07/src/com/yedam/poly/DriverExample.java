package com.yedam.poly;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Driver driver = new Driver();
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		//위에꺼랑 양식이 다름
		driver.drive(new Bus());  
	}

}
