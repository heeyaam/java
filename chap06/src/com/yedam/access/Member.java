package com.yedam.access;

public class Member {
	//어떠한사이트에 회원 정보를 저장
	// 아이, 비밀번호, 이름 ,나이
	//생성자 기본 생성자
	//getter,setter 활용해서 정보를 읽고 저장
	//1) 나이를 입력받았을 때 0보다 작은 숫자가 들어오면 0으로 바꿔준다
	//2) 나이 정보를 얻어갈때에는 +1해서 얻어간다.
	
	private String id;
	private String pw;
	private String name;
	private int age;
	
	Member() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//2) 나이 정보를 얻어갈때에는 +1해서 얻어간다.
	public int getAge() {
		return ++age;
	}

	//1) 나이를 입력받았을 때 0보다 작은 숫자가 들어오면 0으로 바꿔준다
	public void setAge(int age) {
		this.age = (age <0)? 0 : age;
		
	}
	
	
	
}
