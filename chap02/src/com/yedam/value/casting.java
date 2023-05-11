package com.yedam.value;

public class casting {
	public static void main(String[] args) {
		//자동 변환 타입
		byte bValue = 10;
		int iValue = bValue;
		
		System.out.println("iValue :" + iValue);
		
		char charVal = '가';
		iValue = charVal;
		
		System.out.println("가의 유니코드 :" + iValue);
		
		iValue = 50;
		long lValue = iValue;
		System.out.println("lValue :" + lValue);
		
		double dValue = lValue; 
		System.out.println("dValue :" + bValue);
		
		//강제 타입 변환
		int iVar = 127;
		byte bVar = (byte)iVar;
		
		int iVar2 = 44032;
		char charVar = (char)iVar2;
		System.out.println("charVar :" + charVar);
		
		// 실수 <-> 정수 강제 타입 변황
		//자동타입 변환 int (3) -> double = 3.0
		// 강제 타입 변환 double(3.5) -> int =  소수점 아래 내용 제외후 정수 출력
		double dVar = 3.14;
		iVar2 = (int)dVar;
		System.out.println("iVar2 :" + iVar2);
		
		
	}

}
