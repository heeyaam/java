package com.yoga.member;

import java.util.Scanner;

public class ManagerService {
	
	public static Manager managerInfo = null;
	
	Scanner sc = new Scanner(System.in);
	
	//매니저 로그인 메뉴
	public void managerLogin() {
		Manager manager = null;
		System.out.println("ID 입력>");
		String id = sc.nextLine();
		System.out.println("PW 입력>");
		String pw = sc.nextLine();
		
		manager = ManagerDAO.getInstance().managerLogin(id);
		
		if(manager != null) {
			if(manager.getManagerPw().equals(pw)) {
				System.out.println("♡♡♡♡ 로그인 성공 ♡♡♡♡");
				System.out.println(manager.getManagerName() + "님 환영합니다~♡");
			}else {
				System.out.println("비밀번호가 틀립니다");
			}
		}else {
			System.out.println("아이디가 존재하지 않습니다");
		}
		
	}
	
	
	
	//회원등록때 사용
//	public void joinMember() {
//	Member member = new Member();
//	
//	System.out.println("======회원가입 페이지======");
//	System.out.println("ID 입력 >");
//	member.setMemberId(sc.nextLine());
//	System.out.println("PW 입력 >");
//	member.setMemberPw(sc.nextLine());
//	System.out.println("NAME 입력 >");
//	member.setMemberName(sc.nextLine());
//	System.out.println("TEL 입력(13자리이하로 입력) >");
//	member.setMemberTel(sc.nextLine());
//	
//	int result = MemberDAO.getinstance().joinMember(member);
//	
//	if(result >0) {
//		System.out.println("♡♡♡♡회원가입 완료♡♡♡♡");
//	}else {
//		System.out.println("※※※회원가입 실패※※※");
//	}
//}

}
