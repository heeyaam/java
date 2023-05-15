package com.yedam.abs;

public class Employee {
	String name;
	int pay;
	
	Employee() {
		this.name = name;
		this.pay = pay;
	}

	public String getName() {
		return name;
	}

	public int getPay() {
		return pay;
	}
	
	public void getInformation() {
		//이름 연봉 출력
		System.out.println("이름" + name);
		System.out.println("연봉" + pay);
	}
	
	public void print() {
		System.out.println("슈퍼클래스");
	}


	

}
