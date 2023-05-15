package com.yedam.inheri;

public class SmartPhone extends CellPhon {

	
		//필드
	String agency;
	
	//생성자
	public SmartPhone(String model, String color, String agency) {
		// 자동 부모 생성자 호출  -> 부모 클레스를 객체롤 생성한뒤 자식 클레스를 생성
		super(); // 부모 생성자 생성 생략가능 가장 위에 와야함 부모객체가 가지고 있는 객체를 사용하기 위함
		System.out.println("자식 객체 생성중");
		this.model = model;
		this.color = color;
		this.agency = agency; 
	
	}
	
	public SmartPhone(String model, String color) {
		super(model);
		this.color = color;
		this.agency = "KT"; 
		
	}
	
	
	void kakaoExe() {
		System.out.println("카카오톡을 시작힙니다");
	}
	
	void Info() {
		System.out.println("통신사:" + agency +"입니다");
	}
	
	void kakaoExit() {
	 System.out.println("카카오톡을 종료합니다");
	}

	

}
