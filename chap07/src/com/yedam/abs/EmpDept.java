package com.yedam.abs;

public class EmpDept extends Employee{
	String dpName;
	
	EmpDept() {
	this.dpName=dpName;	
	}

	public String getDpName() {
		return dpName;
	}
	
	@Override
	public void getInformation() {
		System.out.print("이름: " + name);
		System.out.print(" 연봉: " + pay);
		System.out.println(" 부서: " + dpName);
		
	}
	
	public void print() {
		super.print();
		System.out.println("서브 클래스");
		
	}

}
