package com.homework;



public class ObesityInfo extends StandardWeightInfo {
	
	public void getInformation() {
		System.out.println("이름: " +name);
		System.out.println("키: " + height);
		System.out.println("몸무게: " +weight);
		System.out.println(getObsity());
	}
	public double getObsity() {
		double beman = weight-getStandardWeight()/getStandardWeight()*100;
		return beman;
		
	}

}
