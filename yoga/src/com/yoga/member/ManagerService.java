package com.yoga.member;


import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import com.sun.jdi.Value;




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
			System.out.println("1. 회원조회   2. 회원정보 수정관리   3. 회원가입 승인관리   4. 락커관리   5. 연장관리   6. 회원삭제   7. 로그아웃");
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
				mebershipCheak();
				break;
			case "4":
				LockerMana();
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
			System.out.println("1. 비밀번호 수정   2. 시작일 수정   3. 남은 연장일수 수정   4. 남은 개인레슨 횟수 수정   5. 뒤로가기");
			String menu6 = sc.nextLine();
			
			switch (menu6) {
			case "1":
				//비밀번호 수정
				pwUpdate();
				break;
			case "2":
				//수업 시작일 수정
				stdateUpdate();
				break;
			case "3":
				//남은 연장 일수 수정( 연장은 달 기준으로 숫자만 입력하는 형식)
				exdateUpdate();
				break;
			case "4":
				//남은 개인레슨 횟수 수정
				numberUpdate();
				break;
			case "5":
				//뒤로가기
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
	
	Member memch =  MemberDAO.getinstance().memberlogin(member.getMemberId());
	if(memch != null) {
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
	}else {
		System.out.println("없는 회원 아이디입니다");
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
		boolean mc = true;
		System.out.println("☆☆☆☆☆☆회원 수업시작일 수정☆☆☆☆☆☆");
		
		System.out.println("회원 아이디 입력>");
		member.setMemberId(sc.nextLine());
		Member memch =  MemberDAO.getinstance().memberlogin(member.getMemberId());
		if(memch != null) {
			while(mc) {
		System.out.println("바꿀 수업시작일 입력>       ※※ 작성 형식:  YYYY-MM-DD  ※※ ");
		 String date =String.valueOf(sc.nextLine());
		
		if( date!=null && date.matches("\\d{4}-\\d{2}-\\d{2}")) {
			member.setMemberStdate(Date.valueOf(date));
			
			int result = ManagerDAO.getInstance().stdateUpdate(member);
			
			if(result >0) {
				System.out.println("☆☆☆☆회원 수업시작일 수정 완료☆☆☆☆");
				mc = false;
			}else {
				System.out.println("회원 수업시작일 수정 실패...?");
				mc =false;
			}}
		else {
				System.out.println(" 잘못된 형식의 데이터를 입력했습니다");
				}
			}
		}else {
			System.out.println("없는 회원 아이디 입니다");
		}
		
		 
		}
	
	//남은 연장 기간 수정( 달기준으로 1 , 2 등)
	private void exdateUpdate() {
		Member member = new Member();
		boolean exda = true;
		
		System.out.println("☆☆☆☆☆☆회원 연장가능한 기간 수정☆☆☆☆☆☆");
		System.out.println("회원 아이디 입력>");
		member.setMemberId(sc.nextLine());
		Member memchek =  MemberDAO.getinstance().memberlogin(member.getMemberId());
		if(memchek != null) {
			while(exda) {
				System.out.println("수정할 연장 기간 입력>     달 기준으로 숫자만 작성  ex) 1달 -> 1     2달 -> 2 ");
				String data = String.valueOf(sc.nextLine());
				if(data != null && data.matches("[0-9]+")) {
					member.setMemberExdate(Integer.parseInt(data));
					
					int result = ManagerDAO.getInstance().exdateUpdate(member);
					if(result >0) {
						System.out.println("☆☆☆☆회원 연장가능기간 수정 완료☆☆☆☆");
						exda =false;
					}else {
						System.out.println("회원 연장가능기간 수정 실패...?");
						exda = false;
					}
				}else {
					System.out.println("입력한 형식이 숫자가 아님");
				}
			}
		
	}else {
		System.out.println("없는 아이디 입니다");
	}
	}
	
	//회원 수정 관리에서 회원 개인레슨 횟수 변경
	private void numberUpdate() {
		Member member = new Member();
		boolean num=true;
		
		System.out.println("☆☆☆☆☆☆회원 개인레슨 횟수 수정☆☆☆☆☆☆");
		System.out.println("회원 아이디 입력>");
		member.setMemberId(sc.nextLine());
		Member memch =  MemberDAO.getinstance().memberlogin(member.getMemberId());
		if(memch != null) {
		while(num){
		System.out.println("바꿀 레슨 횟수 숫자 입력");
		
		String str = String.valueOf(sc.nextLine());
		if(str != null && str.matches("[0-9]+")) {
			member.setMemberNumber(Integer.parseInt(str));
			
			int result = ManagerDAO.getInstance().numberUpdate(member);
			if(result >0) {
				System.out.println("☆☆☆☆회원 개인레슨 횟수 수정 완료☆☆☆☆");
				num =false;
			}else {
				System.out.println("회원 개인레슨 수정 실패...?");
				num = false;
			}
			
		}else {
			System.out.println("입력한 데이터가 숫자가 아님");
		}
		}
		}else {
			System.out.println("없는 회원 아이디 입니다");
		}
		}
	
	
	
	
	
	// 3. 회원가입 승인 관리 메뉴
	private void mebershipCheak() {
		
		boolean memsh = true;
		System.out.println(" ☆☆☆회원가입 승인 관리 페이지☆☆☆ ");
		while(memsh) {
			System.out.println("1. 회원가입 신청현황   2. 회원가입허가하기   3. 뒤로가기 ");
			String menu7 = sc.nextLine();
			switch (menu7) {
			case "1":
				getMembershipList();
				break;
			case "2":
				membershipAdmin();
				break;
			case "3":
				memsh = false;
				break;
			default:
				System.out.println("없는 메뉴입니다");
				break;
			}
		}
	}
	
	//3. 회원가입 승인 관리 메뉴 1.회원가입 신청회원 조회
	private void getMembershipList() {
		List<Member> list = ManagerDAO.getInstance().getMembershipList();
		System.out.println("=====================================================");
		for(int i=0; i<list.size(); i++) {
			System.out.println("회원가입 허가 여부 : " + list.get(i).getMemberMembership());
			System.out.println("아이디 : " + list.get(i).getMemberId());
			System.out.println("비밀번호 : " + list.get(i).getMemberPw());
			System.out.println("이름 : " + list.get(i).getMemberName());
			System.out.println("전화번호 : " + list.get(i).getMemberTel());
			System.out.println("등록일자 : " + list.get(i).getMemberRedate());
			System.out.println("---------------------------------------------------------");
			System.out.println();
		}
	}
	
	
	//3. 회원가입 승인 관리메뉴  2. 회원가입 허가 하기
	private void membershipAdmin() {
		Member member = new Member();
		boolean admin = true;
		System.out.println("☆☆☆☆☆☆회원 수업시작일 수정☆☆☆☆☆☆");
		
		while(admin) {
			boolean csck = true;
			
			System.out.println("등록허가할 회원 아이디입력>");
			member.setMemberId(sc.nextLine());
			
			Member memck = MemberDAO.getinstance().memberlogin(member.getMemberId());
			if(memck !=null && memck.getMemberMembership().equals("N")) {
				while(csck) {
				System.out.println("등록 클래스 입력>   입력방식: 주2회클래스는 -> 2회    주2회클래스는 -> 3회  개인레슨은 -> 개인");
				String memclass = sc.nextLine();
				
				if(memclass.equals("개인") || memclass.equals("2회")|| memclass.equals("3회")) {
					
				memck.setMemberClass(memclass);
				if(memck.getMemberClass().equals("개인")) {
					System.out.println("개인레슨 선생님 입력>");
					memck.setMemberTeacher(sc.nextLine());
					System.out.println("개인레슨 등록 횟수 입력>");
					memck.setMemberNumber(Integer.parseInt(sc.next()));
					
					int result = ManagerDAO.getInstance().prMemAdmin(memck);
					if(result > 0) {
						System.out.println( memck.getMemberId() + "의 회원가입 허가 완료");
						csck = false;
						admin = false;
					}else {
						System.out.println("※※※회원 가입 허가 실패※※※");
						csck = false;
						admin = false;
					}
					
				}else if(memck.getMemberClass().equals("2회") ||memck.getMemberClass().equals("3회")){
					
					while(true){
					System.out.println("회원 수업 시작일 입력>   ※※ 작성 형식:  YYYY-MM-DD  ※※");
					 String stdate =String.valueOf(sc.nextLine());
					 if( stdate!=null && stdate.matches("\\d{4}-\\d{2}-\\d{2}")) {
							memck.setMemberStdate(Date.valueOf(stdate));
							break;
							}else {
								System.out.println("입력형식이 잘못되었습니다");
							}
					}
					while(true) {
						System.out.println("회원 수업 종료일 입력>  ※※ 작성 형식:  YYYY-MM-DD  ※※");
						 String endate =String.valueOf(sc.nextLine());
						 if( endate !=null && endate.matches("\\d{4}-\\d{2}-\\d{2}")){ 
								memck.setMemberEndate(Date.valueOf(endate));
								break;
								}else {
									System.out.println("입력형식이 잘못되었습니다");
								}
						 }
					while(true) {
						System.out.println("연장 가능한 기간을 입력해 주세요>  달 기준으로 숫자만 작성  ex) 1달 -> 1     2달 -> 2");
						String exdata = String.valueOf(sc.nextLine());
						if(exdata != null && exdata.matches("[0-9]+")) {
							memck.setMemberExdate(Integer.parseInt(exdata));
							break;
					}else {
						System.out.println("입력형식이 잘못되었습니다");
					}
					}
					
					int result2 = ManagerDAO.getInstance().weekAdmin(memck);
					
					if(result2>0) {
						System.out.println(memck.getMemberId() + "의 회원가입 허가 완료");
						csck =false;
						admin = false;
					}else {
						System.out.println("※※※회원 가입 허가 실패※※※");
					}
					 
					
				}
				}else {
					System.out.println("없는 클래스 입니다 다시 입력해 주세요");
				}
				}

				
			}else {
				System.out.println("등록허가할 정보가 없는 아이디입니다");
			}	}
			}
			
	

	private void LockerMana() {
		System.out.println(" ☆☆☆☆☆☆ 락커 관리 ☆☆☆☆☆☆ ");
		boolean locma = true;
		while(locma) {
		System.out.println("1. 락커대여현황   2. 락커대여 신청 허가관리   3. 뒤로가기");
		String menu10 = sc.nextLine();
		switch (menu10) {
		case "1":
			lockerPermissionList();
			break;
		case "2":
			
			break;
		case "3":
			locma =false;
			break;

		default:
			break;
		}
		}
		
	}


	private void lockerPermissionList() {
		List<Member> list = ManagerDAO.getInstance().lockerPermissionList();
		System.out.println("☆☆☆☆☆☆ 락커 신청 및 대여중 현황 ☆☆☆☆☆☆");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("락커사용허가 여부 : " +list.get(i).getLockerPermission());
			System.out.println("사용자 아이디 : " + list.get(i).getMemberId());
			System.out.println("락커 대여 신청일 : " +list.get(i).getLockerRedate());
			System.out.println("락커 사용 시작일 : " +list.get(i).getLockerStdate());
			System.out.println("-------------------------------------?\n");
		}
				
	}
	
	
	
	


}
	

