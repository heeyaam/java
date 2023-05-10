package com.reference;

public class StringRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVal1= "yedam";
		String strVal2= "yedam";
		
		// 두문자열 주소값비교
		if(strVal1 == strVal2) {
			System.out.println("strVal1과 strVal2 는 메모리 주소같음");
		}else {
			System.out.println("strVal1과 strVal2 는 메모리 주소다름");
		}
		
		//두문자열 데이터 비교
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1과 strVal2 는 데이터 같음");
		}else {
			System.out.println("strVal1과 strVal2 는 데이터 다름");
		}
		
		//new 연산자를 활용해서 String 새로운 객체 생성
		//heap에 객체 생성
		//heap 에 문자열을 넣을 수 있는 공간을 만든다
		String strVal3 = new String("yedam"); //주소 200번지 
		String strVal4 = new String("yedam"); // 주소 300번지
		
		//객체간 주소 비교(==)
		if(strVal3 == strVal4) {
			System.out.println("strVal3과 strVal4 는 메모리 주소같음");
		}else {
			System.out.println("strVal3과 strVal4 는 메모리 주소다름");
		}
		
		//객체간 데이터 비교
		if(strVal3.equals(strVal4)) {
			System.out.println("strVal3과 strVal4 는 데이터 같음");
		}else {
			System.out.println("strVal3과 strVal4 는 데이터 다름");
		}
		
		//주소확인
		if(strVal1 == strVal3) {
			System.out.println("strVal1 과 strVal3 주소 같음");
		}else {
			System.out.println("strVal1 과 strVal3 주소 다름");
		}
		
		
	}

}
