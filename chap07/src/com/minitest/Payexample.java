package com.minitest;

public class Payexample {

	public static void main(String[] args) {
		int price = 10000;
		
		Payment card = new CardPayment(0.08);
		card.showInfo();
		
		System.out.println("온라인 결제 금액" + card.online(price));
		System.out.println("오프라인 결제 금액" +card.offline(price));

	}

}
