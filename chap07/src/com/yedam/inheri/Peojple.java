package com.yedam.inheri;

public class Peojple {
	
	// 부모 클래스
	//필드
	String name;
	String ssn;
	
	//생성자 부모 클레스에 기본 생성자 이외의 생성자가 생성되면 자식 클레스에서 부모의 생성자를 호출해야함
	public Peojple(String name, String ssn) {
		this.name= name;
		this.ssn = ssn;
		
	}

}
