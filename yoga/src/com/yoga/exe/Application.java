package com.yoga.exe;



import java.util.Scanner;

import com.yoga.member.ManagerService;
import com.yoga.member.MemberService;



public class Application {

	Scanner sc = new Scanner(System.in);
	boolean run = true;
	MemberService memser = new MemberService();
	ManagerService manaser = new ManagerService();
	
	public Application() {
		start();
	}

	private void start() {

		
		while(run) {
			System.out.println();
			System.out.println("1. 로그인    2. 회원가입신청    3. 프로그램 종료");
			System.out.println("메뉴입력 > ");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1":
				System.out.println();
				menuSelect();
				break;
			case "2":
				System.out.println();
				memser.joinMember();
				break;
			case "3":
				System.out.println();
				System.out.println("프로그램이 종료되었습니다");
				run = false;
				break;
			default:
				System.out.println("잘못된 메뉴번호를 입력하셨습니다");
				break;
			}
		}
	}
	
	//1. 로그인 눌렸을 때 회원/관리자로 로그인 구분 하는 부분
	private void menuSelect() {
		System.out.println("1.  회원 로그인  2. 관리자 로그인");
		System.out.println("메뉴 입력>");
		String menu2 = sc.nextLine();
		
		switch (menu2) {
		case "1":
			//회원으로 로그인시 메뉴
			System.out.println();
			System.out.println("회원 로그인 페이지");
			memser.memberlogin();
			break;
		case "2":
			//관리자로 로그인시 메뉴
			System.out.println();
			System.out.println("관리자 로그인 페이지");
			manaser.managerLogin();
			break;
		default:
			System.out.println("잘못된 메뉴번호를 입력하셨습니다");
			System.out.println();
			break;
		}
	}
	

}
