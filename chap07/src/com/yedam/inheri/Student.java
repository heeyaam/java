package com.yedam.inheri;


public class Student extends Peojple {

	int stdNo;
	public Student(String name, String ssn, int stdNo) {
		super(name, ssn);
		
		this.stdNo = stdNo;
	}

}
