package com.minitest;

public class SimplePayment implements Payment{
	
	int simplePaymentRatio;
	
	public SimplePayment(int simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}

	@Override
	public int online(int price) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int offline(int price) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		
	}

}
