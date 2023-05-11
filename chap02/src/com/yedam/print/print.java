package com.yedam.print;

import java.io.IOException;
import java.util.Scanner;




public class print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("입력>");
		
		int keyCode = 0;
		
		try {
			keyCode = System.in.read();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("KeyCode :" + keyCode);
		
		try {
			keyCode = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("KeyCode :" + keyCode);
		
		try {
			keyCode = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("KeyCode :" + keyCode);
		
		//Scanner
		int data = Scanner.nextInt();
		
		//문자열 읽기
		scanner.nextLine();
		
		inputData = scanner.nextLine();
		System.out.println("Scanner 활용");
		
		//데이터 비교 -> 입력한 값 == 저장된 값 비교	
		
		//기본 타입(정수 , 실수 비교 ==)
		//문자열 -> equals
		if(inputData.equals("yedam")) {
			System.out.println("yedam과 일치합니다.");
		}

	}

}
