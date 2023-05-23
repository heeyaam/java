package com.minitest;

public class DGBCard extends Card{

	String company = "대구은행";
	String cardStaff;
	public DGBCard(String cardNo, int validDate, int cvc, String cardStaff) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;
	}
	
	
	public void showCardInfo() {
		cardStaff = "신빛용";
		super.showCardInfo();
		System.out.println("담당직원 - " + cardStaff +", " + company);
	}
	
	

}
