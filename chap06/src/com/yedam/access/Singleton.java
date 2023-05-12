package com.yedam.access;



public class Singleton {
	
	//클래스 내부에서 하나의 갹체를 만든다
	//하나의 객체는외부에서 접근 불가능
//	private static Singleton singleton = new Singleton();
//	
//	//외부에서 객체를 생성하지 못하도록 생성자에 private
//	private Singleton() {
//		
//	}
//	
//	
//	//클래스 내부에서 만든 단 하나의객체를 외부에 전달하기위한 메소드
//	public static Singleton gerInstance() {
//		return singleton;		
//	}
//	
//	public String name;
//	public int age;
//	
//	public void info() {
//		
//	}
	
	private static Singleton singleton = null;
//	
//	//외부에서 객체를 생성하지 못하도록 생성자에 private
	private Singleton() {
		
	}
//	
//	
//	//클래스 내부에서 만든 단 하나의객체를 외부에 전달하기위한 메소드
	public static Singleton gerInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
	
		return singleton;	
		}	
	
	
	public String name;
	public int age;
	
	public void info() {}
	
	}
