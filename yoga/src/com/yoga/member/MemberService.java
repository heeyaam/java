package com.yoga.member;

import java.util.Scanner;

import com.yoga.exe.Application;

import oracle.net.aso.f;


public class MemberService {
	public static Member memberInfo= null;
	public static Application applicationInfo = null;
	boolean memlo = true;
	boolean psinforma = true;
	boolean lock = true;
	
	Scanner sc = new Scanner(System.in);
	
	
	/////////////////회원가입 메뉴 -> 회원으로만 가입 가능
	public void joinMember() {
		System.out.println("☆☆☆☆☆ 회원가입 페이지입니다 ☆☆☆☆☆");
		String id = "";
		while(true) {
			System.out.println("ID 입력 >");
			id = sc.nextLine();
			Member member = MemberDAO.getinstance().memberlogin(id);
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
				if(member.getMemberMembership().equals("Y")) {
				System.out.println("☆☆☆☆ 로그인 성공 ☆☆☆☆");
				System.out.println(member.getMemberName() + "님 환영합니다~♡");
				memberInfo = member;
				memberMenu();
				
				
			}else {
				System.out.println("회원가입이 승인되지 않았습니다");
				}
			}else {
				System.out.println("비밀번호가 틀렸습니다");
			}
		}else {
			System.out.println("ID가 존재하지 않습니다");
		}
		
			
		}
	
	
	//1-2 회원으로 로그인했을 시 메뉴들
	private void memberMenu() {
		memlo = true;
		while(memlo) {
			System.out.println("1. 개인정보조회   2. 개인정보관리   3. 로그아웃 \n");
			System.out.println("메뉴 입력>");
			String menu3 = sc.nextLine();
			
			switch (menu3) {
			case "1":
				//개인정보조회 부분
				personalInformation();
				break;
			case "2":
				//개인정보 관리 부분
				psInfoMana();
				break;
			case "3":
				memlo = false;
				break;
			default:
				System.out.println("잘못된 메뉴번호를 입력하셨습니다");
				break;
			}
		}
	}

	//개인정보 조회 메뉴 기능
	private void personalInformation() {
		System.out.println();
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆개인 정보 조회☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆\n");
		Member member = MemberDAO.getinstance().memberlogin(memberInfo.getMemberId());
		
		System.out.println("아이디 : " + member.getMemberId());
		System.out.println("비밀번호 : " + member.getMemberPw());
		System.out.println("이름 : " + member.getMemberName() );
		System.out.println("전화번호 : " + member.getMemberTel());
		System.out.println("등록일 : "  + member.getMemberRedate());
		
		if(memberInfo.getMemberClass().equals("개인")) {
			System.out.println("클래스 종류 : 개인 레슨") ;
			System.out.println("개인 레슨 담당선생님 : " + member.getMemberTeacher());
			System.out.println("개인 레슨 남은 횟수 : " + member.getMemberNumber() +"회");
		}else if(memberInfo.getMemberClass().equals("2회") || memberInfo.getMemberClass().equals("3회") ){
			System.out.println("수업 시작일 : " + member.getMemberStdate());
			System.out.println("수업 종료일 : " + member.getMemberEndate());
			System.out.println("클래스 종류 : 주 "+member.getMemberClass());
		}
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println();
		
	}
	
	
	//개인정보 관리 메뉴 기능
	private void psInfoMana() {
		
		psinforma =true;
		
		while(psinforma) {
			System.out.println("1. 비밀번호 수정  2. 락커 관리  3. 수업기간연장관리  4. 뒤로가기 \n");
			System.out.println("메뉴 입력>");
			String menu4 = sc.nextLine();
			switch (menu4) {
			case "1":
				//비밀번호 수정 메뉴
				deletePsPw();
				break;
			case "2":
				//락커 관리 
				psLocker();
				break;
			case "3":
				extension();
				break;
			case "4":
				//뒤로가기 기능 
				psinforma = false;
				break;
			default:
				System.out.println("잘못된 메뉴번호를 입력하셨습니다");
				break;
			}
		}
		
	}
	
	


	//개인정보관리 의 1. 회원이 본인 비밀번호 수정 메뉴 기능
	private void deletePsPw() {
		Member member = new Member();
		member = MemberDAO.getinstance().memberlogin(memberInfo.getMemberId());
		System.out.println("☆☆☆☆☆ 비밀번호 수정 페이지 ☆☆☆☆☆");
		System.out.println("수정할 비밀번호를 입력해주세요");
		System.out.println("입력 >");
		member.setMemberPw(sc.nextLine());
		
		int result = MemberDAO.getinstance().updatePw(member);
		if(result >0) {
			System.out.println("☆☆☆☆☆비밀번호 수정 완료☆☆☆☆☆");
		}else {
			System.out.println("※※※※※비밀번호 수정 실패※※※※※");
		}
	}
	
	
	// 개인정보 관리의  2. 본인 락커 관리
	
	private void psLocker() {
		
		lock =true;
		while(lock) {
		System.out.println("☆☆☆☆☆ 락커 관리 페이지 ☆☆☆☆☆");

		Member member1 = MemberDAO.getinstance().lockerMember(memberInfo.getMemberId());
		Member member2 = MemberDAO.getinstance().psLockerCheck(memberInfo.getMemberId());
		

		if(member1 != null) {
			System.out.println(member2.getLockerNumber()+"번 락커를 대여중입니다");
		}else {
			System.out.println("대여중인 락커가 없습니다");
		}
		
		System.out.println();
		System.out.println("1. 락커대여신청   2. 락커반납신청   3. 뒤로가기");
		String menu8 = sc.nextLine();
		// 락커 대여 여부 보이기
		
		switch (menu8) {
		case "1":
			lockApp();
			break;
		case "2":
			lockLeturn();
			break;
		case "3":
			lock = false;
			break;
		default:
			System.out.println("잘못된 메뉴번호를 입력하셨습니다");
			break;
			}
		}
	}

	

	//회원이 락커 신청하는 메뉴
	
	private void lockApp() {
		Member member1 = MemberDAO.getinstance().lockerMember(memberInfo.getMemberId());
		Member member2 = MemberDAO.getinstance().psLockerCheck(memberInfo.getMemberId());
		if(member1 ==null && member2 == null) {
			int result = MemberDAO.getinstance().lockApp(memberInfo);
			
			if(result >0 ) {
				System.out.println("락커신청이 완료 되었습니다");
			}else {
				System.out.println("락커신청 실패 되었습니다");
			}
		}else if(member1 !=null) {
			System.out.println("이미 대여중인 락커가 존재 합니다");
		}else if(member2 !=null) {
			System.out.println(" 진행중인 락커 대여신청이 있습니다");
		}
		
		
	}
	
	
	//락커 반납하는 기능
	private void lockLeturn() {
		
		
	}

	
	
	//2.회원 정보 관리의 3. 기간 연장관리

	private void extension() {
		
		Member member = new Member();
		member = MemberDAO.getinstance().memberlogin(memberInfo.getMemberId());
		
		if(member.getMemberExdate()>0) {
			System.out.println("수업기간을 "+member.getMemberExdate() +"달 연장가능한 회원입니다 \n");
		}else {
			System.out.println("연장 불가능한 회원입니다 \n");
		}
		

		boolean exen = true;
		while(exen) {
			System.out.println("1. 연장신청   2. 뒤로가기");
			String menu11 = sc.nextLine();
		switch (menu11) {
		case "1":
			extensionEndate();
			break;
		case "2":
			exen = false;
			break;
		default:
			System.out.println("잘못된 메뉴번호를 입력하셨습니다");
			break;
			}
		}
		
	}

	private void extensionEndate() {
		Member member = new Member();
		member = MemberDAO.getinstance().memberlogin(memberInfo.getMemberId());
		
		if(member.getMemberExdate()>0) {
		
		int result = MemberDAO.getinstance().extensionEndate(member);
		if(result >0) {
			System.out.println("수업 만료일"+ member.getMemberExdate() +"달 연장이 되었습니다 \n");
			memberInfo = MemberDAO.getinstance().memberlogin(member.getMemberId());
		}else {
			System.out.println(" 수업 만료일 연장 실패 \n");
			}
		}else {
			System.out.println("연장할 수 있는 회원이 아닙니다");
		}
	}
	

	

	
	}
	
