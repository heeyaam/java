package com.yoga.member;


import java.sql.Date;
import java.util.List;
import java.util.Scanner;




public class ManagerService {
	public static Member memberInfo= null;
	boolean manalog = true;
	boolean mSlect = true;
	boolean upmem = true;
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
				managerMenu();
			}else {
				System.out.println("비밀번호가 틀립니다");
			}
		}else {
			System.out.println("아이디가 존재하지 않습니다");
		}
		
	}

	
	//로그인후 관리 메뉴들
	private void managerMenu() {
		manalog = true;
		while(manalog) {
			System.out.println("1. 회원조회   2. 회원정보 수정관리   3. 회원삭제   4. 회원가입 승인관리   5. 락커관리   6. 연장관리     7. 로그아웃");
			System.out.println("메뉴 입력>");
			String menu4 = sc.nextLine();
			
			switch (menu4) {
			case "1":
				memberSelect();
				break;
			case "2":
				updateMemberInfo();
				break;
			case "3":
				
				break;
			case "4":
				
				break;
			case "5":
				
				break;
			case "6":
				
				break;
			case "7":
				manalog =false;
				break;
			default:
				System.out.println("잘못된 메뉴번호를 입력하셨습니다");
				break;
			}
		}
		
	}


	private void memberSelect() {
		mSlect =true;
		System.out.println("☆☆☆☆☆☆☆회원조회 페이지☆☆☆☆☆☆☆");

		while(mSlect) {
			System.out.println("1. 전체회원조회   2. 개별회원조회   3. 뒤로가기 ");
			String menu5 = sc.nextLine();
			switch (menu5) {
			case "1":
				//전체회원조회
				System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆전체회원 조회☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
				System.out.println("============================================");
				getMemberList();
				System.out.println("============================================");
				break;
			case "2":
				//회원 ID로 회원 단건 조회
				System.out.println("개별 회원 조회");
				getMemberInfo();
				break;
			case "3":
				mSlect = false;
				break;
			default:
				System.out.println("잘못된 메뉴번호를 입력하셨습니다");
				break;
			}
		}
	}


	//전체회원조회
	private void getMemberList() {
		List<Member> list = ManagerDAO.getInstance().getMemberList();

		for(int i=0; i<list.size(); i++) {
			System.out.println("---------------------------------------------------------");
			System.out.println("회원가입 허가 여부 : " + list.get(i).getMemberMembership());
			System.out.println("아이디 : " + list.get(i).getMemberId());
			System.out.println("비밀번호 : " + list.get(i).getMemberPw());
			System.out.println("이름 : " + list.get(i).getMemberName());
			System.out.println("전화번호 : " + list.get(i).getMemberTel());
			System.out.println("등록일자 : " + list.get(i).getMemberRedate());
			System.out.println("클래스 정보 : " + list.get(i).getMemberClass());
			System.out.println("수업시작일 : " + list.get(i).getMemberStdate());
			System.out.println("수업종료일 : " + list.get(i).getMemberEndate());
			System.out.println("개인레슨 선생님 : " + list.get(i).getMemberTeacher());
			System.out.println("개인레슨 남은 횟수 : " + list.get(i).getMemberNumber());
	}
	
	}
	
	//로그인 후 관리메뉴중 회원조회 메뉴
	private void getMemberInfo() {
		
		System.out.println("회원 정보 조회");
		System.out.println("회원 ID 입력 >");
		String memId = sc.nextLine();
		
		Member member = MemberDAO.getinstance().memberlogin(memId);
		System.out.println("===============================================");
		if(member !=null) {
			System.out.println("회원가입 허가 여부 : " + member.getMemberMembership());
			System.out.println("아이디 : " + member.getMemberId());
			System.out.println("비밀번호 : " + member.getMemberPw());
			System.out.println("이름 : " + member.getMemberName());
			System.out.println("전화번호 : " + member.getMemberTel());
			System.out.println("등록일자 : " + member.getMemberRedate());
			System.out.println("클래스 정보 : " + member.getMemberClass());
			System.out.println("수업시작일 : " + member.getMemberStdate());
			System.out.println("수업종료일 : " + member.getMemberEndate());
			System.out.println("개인레슨 선생님 : " + member.getMemberTeacher());
			System.out.println("개인레슨 남은 횟수 : " + member.getMemberNumber());
		}else {
			System.out.println("조회되는 회원이 없습니다");
		}
	}
	
	private void updateMemberInfo() {
		System.out.println("☆☆☆☆☆☆☆회원정보 수정 페이지☆☆☆☆☆☆☆");
		upmem =true;
		while(upmem) {
			System.out.println("1. 비밀번호 수정   2. 회원등급 수정   3. 시작일 수정   4.종료일 수정   5. 남은 연장일수 수정   6. 남은 개인레슨 횟수 수정  7. 개인 레슨 담당 선생님 수정   8. 뒤로가기");
			String menu6 = sc.nextLine();
			
			switch (menu6) {
			case "1":
				//비밀번호 수정
				pwUpdate();
				break;
			case "2":
				classUpdate();
				break;
			case "3":
				stdateUpdate();
				break;
			case "4":
				
				break;
			case "5":
				
				break;
			case "6":
				numberUpdate();
				break;
			case "7":
				
				break;
			case "8":
				upmem= false;
				break;
			default:
				System.out.println("잘못된 메뉴번호를 입력하셨습니다");
				break;
			}
		}
		
	}
		

	//2. 회원정보수정관리에서 1. 회원 비밀번호 수정 부분
	
	private void pwUpdate() {
	Member member = new Member();
	System.out.println("☆☆☆☆☆☆회원 비밀번호 수정☆☆☆☆☆☆");
	
	while(true) {
	System.out.println("회원 아이디 입력>");
	member.setMemberId(sc.nextLine());
	
	System.out.println("바꿀 회원 비밀번호 입력>");
	member.setMemberPw(sc.nextLine());
	
	int result = ManagerDAO.getInstance().pwUpdate(member);
	if(result >0) {
		System.out.println("☆☆☆☆회원 비밀번호 수정 완료☆☆☆☆");
		break;
	}else {
		System.out.println("회원 비밀번호 수정 실패...?");
		break;
	}
	}
	}
	
	//3. 회원 수정 관리에서 회원 믈래스 수정
	
//	private void classUpdate() {
//	Member member = new Member();
//	System.out.println("☆☆☆☆☆☆회원 클래스 수정☆☆☆☆☆☆");
//
//	
//	while(true) {
//	System.out.println("회원 아이디 입력>");
//	member.setMemberId(sc.nextLine());
//	Member memch =  MemberDAO.getinstance().memberlogin(member.getMemberId());
//	if(memch != null) {
//	System.out.println("바꿀 회원 클래스 입력>       ※※ 회원 클래스는   [  개인, 2회, 3회  ] 3개중 하나로 입력 ※※ ");
//	member.setMemberClass(sc.nextLine());
//	
//	int result = ManagerDAO.getInstance().classUpdate(member);
//	if(result >0) {
//		System.out.println("☆☆☆☆회원 클래스 수정 완료☆☆☆☆");
//		break;
//	}else {
//		System.out.println("회원 클래스 수정 실패...?");
//		break;
//	}
//	}else {
//		System.out.println("없는 아이디입니다");
//	}
//	}
//	}
	
	// 회원 수정 관리에서 회원 수업 시작일 수정
	
	private void stdateUpdate() {
		Member member = new Member();
		System.out.println("☆☆☆☆☆☆회원 수업시작일 수정☆☆☆☆☆☆");
		System.out.println("회원 아이디 입력>");
		member.setMemberId(sc.nextLine());
		
		System.out.println("바꿀 수업시작일 입력>");
		Date date =Date.valueOf(sc.nextLine());
		member.setMemberStdate(date);
		
		int result = ManagerDAO.getInstance().stdateUpdate(member);
		if(result >0) {
			System.out.println("☆☆☆☆회원 수업시작일 수정 완료☆☆☆☆");
		}else {
			System.out.println("회원 수업시작일 수정 실패...?");
		}
		 
		}
	
	
	//회원 수정 관리에서 회원 개인레슨 횟수 변경
	private void numberUpdate() {
		Member member = new Member();
		boolean num=true;
		
		System.out.println("☆☆☆☆☆☆회원 개인레슨 횟수 수정☆☆☆☆☆☆");
		System.out.println("회원 아이디 입력>");
		member.setMemberId(sc.nextLine());
		
		while(num){
		System.out.println("바꿀 레슨 횟수 숫자 입력");
		
		String str = String.valueOf(sc.nextLine());
		if(str != null && str.matches("[0-9]+")) {
			member.setMemberNumber(Integer.parseInt(str));
			
			int result = ManagerDAO.getInstance().numberUpdate(member);
			if(result >0) {
				System.out.println("☆☆☆☆회원 클래스 수정 완료☆☆☆☆");
				num =false;
			}else {
				System.out.println("회원 클래스 수정 실패...?");
				num = false;
			}
			
		}else {
			System.out.println("입력한 데이터가 숫자가 아님");
		}
		
		}

		}
	
	
}