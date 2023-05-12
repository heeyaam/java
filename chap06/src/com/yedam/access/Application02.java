package com.yedam.access;

public class Application02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student std = new Student();
		
		std.setStdName("김또치");
		std.setMajor("컴퓨터공학과");
		std.setStdGrade("2학년");
		std.setPrograming(-5);
		std.setDatabase(50);
		std.setOs(-50);
		
		System.out.println("이름 :" + std.getStdName());
		System.out.println("전공 " + std.getMajor());
		System.out.println("학년 " +std.getStdGrade());
		System.out.println("프로그래밍 " +std.getPrograming());
		System.out.println("데이터베이스 " +std.getDatabase());
		System.out.println("오에스 " +std.getOs());
		
		
		Member mem = new Member();
		
		mem.setId("id");
		mem.setPw("pw");
		mem.setName("김도치");
		mem.setAge(-100);
		
		System.out.println(mem.getId());
		System.out.println(mem.getPw());
		System.out.println(mem.getName());
		System.out.println(mem.getAge());
		
	}

}
