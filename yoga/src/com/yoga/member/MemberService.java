package com.yoga.member;

import java.util.Scanner;

public class MemberService {
	public static Member memberInfo= null;
	Scanner sc = new Scanner(System.in);
	
	/////////////////회원가입 메뉴 -> 회원으로만 가입 가능
	public void joinMember() {
		System.out.println("☆☆☆☆☆ 회원가입 페이지입니다 ☆☆☆☆☆");
		String id = "";
		while(true) {
			System.out.println("ID 입력 >");
			id = sc.nextLine();
			Member member = MemberDAO.getinstance().idCheck(id);
			if(member != null) {
				System.out.println("이미 존재하는 ID 입니다");
			}else if(member == null){
				
				System.out.println("사용가능한 ID 입니다");
				break;
		}
		}
			System.out.println("PW 입력 >");
			String pw = sc.nextLine();
			
			System.out.println("NAME 입력 >");
			String name = sc.nextLine();
			
			System.out.println("TEL 입력 >");
			String tel = sc.nextLine();
			
			Member mem = new Member();
			mem.setMemberId(id);
			mem.setMemberPw(pw);
			mem.setMemberName(name);
			mem.setMemberTel(tel);
			
			int result = MemberDAO.getinstance().joinMember(mem);
			
			if(result >0) {
				System.out.println("♡♡♡♡회원 가입 완료♡♡♡♡");
			}else {
				System.out.println("※※※※회원 가입 실패※※※※");
			}
	}
	
	//회원 로그인 기능
	public void memberlogin() {
		Member member = null;
		System.out.println("ID 입력>");
		String id = sc.nextLine();
		System.out.println("PW 입력>");
		String pw = sc.nextLine();
		
		member = MemberDAO.getinstance().memberlogin(id);
		
		if(member !=null) {
			if(member.getMemberPw().equals(pw)) {
				System.out.println("☆☆☆☆ 로그인 성공 ☆☆☆☆");
				System.out.println(member.getMemberName() + "님 환영합니다~♡");
			}else {
				System.out.println("비밀번호가 틀렸습니다");
			}
		}else {
			System.out.println("ID가 존재하지 않습니다");
		}
		
			
		}
	}
	
