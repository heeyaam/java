package com.yedam.condition;

import java.util.Scanner;

public class switchCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = (int) (Math.random()*6)+1;
		
		switch (number) {
		case 1:
			System.out.println("주사위 번호1");
			break;
		case 2:
			System.out.println("주사위 번호2");
			break;
		case 3:
			System.out.println("주사위 번호3");
			break;
		case 4:
			System.out.println("주사위 번호4");
			break;
		case 5:
			System.out.println("주사위 번호5");
			break;
		default:
			System.out.println("주사위 번호3");
			break;
		}
		
		//char   중간에 2개 : 둘중 하나만 되도 진행한다는 것
		char grade = 'B';
		String grade2 = "b";
		
		switch (grade2) {
		case "A":
			System.out.println("우수회원");
			break;
		case "B":
		case "b":
			System.out.println("일반회원");
			break;
		default:
			System.out.println("손님");
			break;
		}
		
		//입력한 성적을 등급으로 표현
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적입력>");
		
		//주 : switch 부 : if
		
		//0~100
		//90이상은 A -> 95 이상이면 A+ 90이하면 A
		//90이상은 B -> 85 이상이면 A+ 90이하면 A
		//90이상은 C -> 75 이상이면 A+ 90이하면 A
		
		int score = Integer.parseInt(sc.nextLine());
		
		switch (score/10) {
		case 9:
			if (score >= 95) {
				System.out.println("A+");
			}else {
				System.out.println("A");
			}
			break;
		case 8:
			if (score >= 85) {
				System.out.println("B+");
			}else {
				System.out.println("B");
			}
			break;
		case 7:
			if (score >= 75) {
				System.out.println("C+");
			}else {
				System.out.println("C");
			}
			break;

		default: System.out.println("D");
			break;
		}
		
		//메뉴선택
		System.out.println("1.글보기 2. 글수정 3. 글 삭제 4. 뒤로가기");
		

		int selectNo = Integer.parseInt(sc.nextLine());
		
		switch (selectNo) {
		case 1:
			System.out.println("글보는 기능");
			break;
		case 2:
			System.out.println("글수정기능");
			break;
		case 3:
			System.out.println("글삭제 기능");
			break;
		case 4:
			System.out.println("뒤로가기 기능");
			break;

		}

	}

}
