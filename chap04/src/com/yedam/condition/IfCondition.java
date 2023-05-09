package com.yedam.condition;

import java.io.DataOutput;
import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score =93;
		
		//if문 한개
		if(score >= 90) {
			System.out.println("점수가 90 이상이고 등급 A");
		}
		
		//if 문 실행문 1줄
		if(score >= 90) 
			System.out.println("점수가 90 이상이고 등급 A");
		
		//if-else
		if(score >=90) {
			System.out.println("점수다 90 이상입니다");
		}else {
			System.out.println("점수가 90 미만입니다");
		}
		
		//1번
		if(score >=90) {
			System.out.println("등급A");
		} else if(score >=80) {
			System.out.println("등급B");
		} else if(score >=70) {
			System.out.println("등급C");
		} else {
			System.out.println("등급D");
		}
		
		// 1번이랑 같은 말
		if(score < 70) {
			System.out.println("등급D");
		} else if(score < 80) {
			System.out.println("등급C");
		} else if(score < 90) {
			System.out.println("등급B");
		} else {
			System.out.println("등급A");
		}
		
		//random() 값 출력
		//Random() / Math.random() 두개 있음
		
		//Math.random()  -> 실수
		//0 <= Math.random() <1 범위 0 <= x <1  랜덤값을 가져옴
		System.out.println(Math.random());
		//1부터 10사이의 데이터를 추출
		// 0*10 <= Math.random() * 10 < 1*10
		//0 ~ 9.xxxxx ,,double -> int 소수점 삭제
		//(int) 0 <= (int)Math.random()*10 < (int) 10
		//(int) 0 +1 <= (int) (Math.random()*10)+1 < (int)10 +1
		//(int) 1 ~ (int) 11
		
		//주사위 번호 뽑기
		//0<= x < 1
		//0*6 <=x*6 <1*6
		//(int) 0 <= (int)x*6 <(int)1*6
		//(int) 0+1 <= (int)x*6 +1 <(int)1*6+1
		
		int number = (int)(Math.random() *6)+1;
		if(number ==1) {
			System.out.println("주사위눈 1");
		}else if(number ==2) {
			System.out.println("주사위눈 2");
		}else if(number ==3) {
			System.out.println("주사위눈 3");
		}else if(number ==4) {
			System.out.println("주사위눈 4");
		}else if(number ==5) {
			System.out.println("주사위눈 5");
		}else {
			System.out.println("주사위눈 6");
		}
		
		//중쳡 if 문
		//하나의 데이터를 여러번 조건을 확인할때
//		if(조건식) {
//			if(조건식) {
//				if(조건식) {
//				}
//			}
//		}
		
		int no =10;
		if(no %2 ==0) {
			if(no %5 ==0) {
			if(no%10 ==0){
				System.out.println("2의 배수 5의 배수 10의 배수");
			}
		}}

		Scanner sc = new Scanner(System.in);
		
		System.out.println(sc.nextLine());
		
		String gradeString = "";
		
		if(score >=90) {
			if(score>=95){
				gradeString = "A+";
			}else {
				gradeString = "A";
			}
		}
		
		
		
		
		}

}
