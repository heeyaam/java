package com.minitest;

public class CardPayment implements Payment{

	double cardRatio;
	
	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
		System.out.println("***카드로 결제시 할인 정보");
	}
	
	
	@Override
	public int online(int price) {
		int result = price- (int)(price*(Payment.ONlINE_PAYMENT_RATIO+ cardRatio));
		return result;
	}

	@Override
	public int offline(int price) {
		int result = price- (int)(price*(Payment.OFFLINE_PAYMENT_RATIO+ cardRatio));
		return result;
	}

	@Override
	public void showInfo() {
		
		System.out.println("온라인 결재시 총 할인율 : " + (Payment.ONlINE_PAYMENT_RATIO + cardRatio));
		System.out.println("오프라인 결재시 총 할인율 : " + (Payment.OFFLINE_PAYMENT_RATIO + cardRatio));
//		double onh = cardRatio+ONlINE_PAYMENT_RATIO;
//		System.out.println("온라인 결재시 총 할인율 : " +onh);
		
//		double offh = cardRatio+OFFLINE_PAYMENT_RATIO;
//		System.out.println("오프라인 결재시 총 할인율 : " +offh);
		
		
	}
	

}
