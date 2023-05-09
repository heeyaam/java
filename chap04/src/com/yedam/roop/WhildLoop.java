package com.yedam.roop;

import java.io.DataOutput;
import java.util.Scanner;


public class WhildLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//짝수를 구하기
		int i =1;
		while(i<=100) {
			if(i%2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		//계산기 프로그램
		//무한 루프
		//어떠한 조건 -> 프로그램 종료 -> 두 가지
		// 1)변수 활용
		
		 boolean run = true;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 while(run) {
			 System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 |4. 종료");
			 System.out.println("입력>");
			 
			 int num = Integer.parseInt(sc.nextLine());
			 
			 //if, switch
			 switch (num) {
			case 1:
				System.out.println("더하고 싶은 두수");
				System.out.println("1>");
				int num1 = Integer.parseInt(sc.nextLine());
				System.out.println("2>");
				int num2 = Integer.parseInt(sc.nextLine());
				System.out.println(num1 +"+"+ num2+ "=" + (num1+num2));
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				System.out.println("프로그램 종료");
				run = false;
				break;

			default:
				break;
			}
		 }
		 
		 while(true) {
		 System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 |4. 종료");
		 System.out.println("입력>");
		 
		 int num = Integer.parseInt(sc.nextLine());
		 if(num ==1) {
		 }else if(num ==2) {
			 }else if(num ==4) {
				 break;
			 }
		 }
		 
		 
		 //오랃실 만등기
		 //오락 한번 -> 500뤈
		 //1500뤈 투입 -> 3번

		 System.out.println("======insert coin======");
		 
		 int money = Integer.parseInt(sc.nextLine());
		 
		 while(money >=500) {
			 System.out.println((money/500)+"번 남았습니다");
			 System.out.println("1. 가위바위보 | 2. up &down | 3. 종료");
			 
			 System.out.println("메뉴 입력 >");
			 int gameNo = Integer.parseInt(sc.nextLine());
			 
			switch (gameNo) {
			case 1:
				System.out.println("가위바위보 진행");
				money = money -500;
				break;
			case 2:
				System.out.println(" up &down 진행");
				money = money -500;
				
				break;
			case 3:
				System.out.println("종료");
				money = 0;
			break;
			}
			
		 }
		 
		 
		 int month;
		 
		 do {
			 System.out.println("올바른 월을 입력하세요[1~12]");
			 month = sc.nextInt();
		 }while(month <1 || month >12);
		 System.out.println("상ㅇ자가 입력한 월은" + month);
		 
		 
		 
		 
		 
		 
	}

}
