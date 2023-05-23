package com.minitest;

public interface Payment {
	
	//상수값 static final
	
	public static final double ONlINE_PAYMENT_RATIO = 0.05;
	public static final double OFFLINE_PAYMENT_RATIO= 0.03;
	
	public int online(int price);
	public int offline(int price);
	public void showInfo();
	
	

}
