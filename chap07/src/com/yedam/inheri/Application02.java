package com.yedam.inheri;

public class Application02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student("또치", "111-111",111);
		
		//부모객체
		System.out.println("name" + std.name);
		System.out.println("ssn " +std.ssn);
		
		System.out.println("stdNo" + std.stdNo);
	}

}
