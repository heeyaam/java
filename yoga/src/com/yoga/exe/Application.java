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
			System.out.println("1. 로그인    2. 회원가입    3. 프로그램 종료");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1":
				menuSelect();
				break;
			case "2":
				memser.joinMember();
				break;
			case "3":
				System.out.println("프로그램이 종료되었습니다");
				run = false;
				break;
			default:
				System.out.println("잘못된 메뉴번호를 입력하셨습니다");
				break;
			}
		}
	}
	
	//1. 로그인 시 필요 메뉴
	private void menuSelect() {
		System.out.println("1.  회원 로그인  2. 관리자 로그인");
		String menu2 = sc.nextLine();
		
		switch (menu2) {
		case "1":
			//회원으로 로그인시 메뉴
			memser.memberlogin();
			break;
		case "2":
			//관리자로 로그인시 메뉴
			manaser.managerLogin();
			break;
		default:
			System.out.println("잘못된 메뉴번호를 입력하셨습니다");
			break;
		}
	}
}
