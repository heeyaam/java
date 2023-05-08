package com.yedam.value;

public class variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte value1 = 10;
		int value2 =100;
		long value3 = 1000;
		
		long result = value1 + value2 + value3;
		System.out.println(result);
		
		//실수와 정수 타입
		int iValue1 =10;
		int iValue2 = iValue1/4;
		System.out.println(iValue2);
		
		//2.5를 출력하기
		double dValue = iValue1/4.0;
		System.out.println(dValue);
		
		
		//강제 타입 변환
		int x =1;
		int y =2;
		double result2 = (double)x/y;
		System.out.println(result2);
		
		//문자열 + 연산 
		int vlaue = 10+2+8;
		
		String str1 = 10+2 +"8";
		System.out.println("str1 :" + str1);
		
		String str2 = "10" + (2 + 8);
		System.out.println(str2);
		
		//string <-> 기본 타입(정수 실수 논리 )변환
		int valueStr = Integer.parseInt(str2);
		short shortValue = Short.parseShort(str2);
		double doubleValue = Double.parseDouble(str2);
		System.out.println(doubleValue);
		//boolean bValue = Boolean.parseCoolean(s
		String str3 = String.valueOf(valueStr);
		
		String str4 = String.valueOf(doubleValue);
		System.out.println(str3);
		
		

	}

}
