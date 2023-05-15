package com.homework;


public class StandardWeightInfo extends Human{

	public void getInformation() {
		System.out.println("이름: " +name);
		System.out.println("키: " + height);
		System.out.println("몸무게: " +weight);
		System.out.println(getStandardWeight());
	}
	
	public double getStandardWeight() {
		double standard = (height-100)*0.9;
		return standard;
		
	}
}
