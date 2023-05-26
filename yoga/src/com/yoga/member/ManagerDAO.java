package com.yoga.member;

import java.util.ArrayList;
import java.util.List;

import com.yoga.common.DAO;

public class ManagerDAO extends DAO{
	
	private static ManagerDAO managerDao = null;
	
	private ManagerDAO() {
		
	}
	
	public static ManagerDAO getInstance() {
		if(managerDao == null) {
			managerDao = new ManagerDAO();
		}
		return managerDao;
	}
	
	// 매니저 로그인 기능
	public Manager managerLogin(String id) {
		Manager manager = null;
		try {
			conn();
			String sql = "select * from manager where manager_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				manager = new Manager();
				manager.setManagerId(id);
				manager.setManagerPw(rs.getString("manager_pw"));
				manager.setManagerName(rs.getString("manager_name"));
				manager.setManagerGrade(rs.getString("manager_grade"));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return manager;
	}
	
	
	
	// 회원조회 메뉴안에서 전체회원 조회 기능
	public List<Member> getMemberList(){
		List<Member> list = new ArrayList<Member>(); 
		Member member = null;
		try {
			conn();
			String sql = "select * from member";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				member = new Member();
				member.setMemberId(rs.getString("member_id"));
				member.setMemberPw(rs.getString("member_pw"));
				member.setMemberName(rs.getString("member_name"));
				member.setMemberTel(rs.getString("member_tel"));
				member.setMemberRedate(rs.getDate("member_redate"));
				member.setMemberStdate(rs.getDate("member_stdate"));
				member.setMemberEndate(rs.getDate("member_endate"));
				member.setMemberClass(rs.getString("member_class"));
				member.setMemberTeacher(rs.getString("member_teacher"));
				member.setMemberExdate(rs.getInt("member_exdate"));
				member.setMemberExtatus(rs.getInt("member_exstatus"));
				member.setMemberNumber(rs.getInt("member_number"));
				member.setMemberExappDate(rs.getDate("member_exappdate"));
				member.setMemberMembership(rs.getString("member_membership"));
				list.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	
	
	//2. 회원정보수정관리에서 1. 회원 비밀번호 수정 부분
	public int pwUpdate(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "update member set member_pw =? where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberPw());
			pstmt.setString(2, member.getMemberId());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
	//2. 회원 수정 관리에서 3. 수업 시작일 수정
	
	public int stdateUpdate(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "update member set member_stdate =? where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setDate(1, member.getMemberStdate());
			pstmt.setString(2, member.getMemberId());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//남은 연장 기간 수정( 달기준으로 1,2)
	
	public int exdateUpdate(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "update member set member_exdate =? where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, member.getMemberExdate());
			pstmt.setString(2, member.getMemberId());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//2. 회원수정 관리에서 6. 개인레슨 횟수 수정
	
	public int numberUpdate(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "update member set member_number =? where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, member.getMemberNumber());
			pstmt.setString(2, member.getMemberId());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
	
	// 3. 회원가입 승인 관리 페이지
	// 3. 회원가입 승인고나리  1. 회원가입 신청한 전체 인원 조회
	public List<Member> getMembershipList(){
		List<Member> list = new ArrayList<Member>(); 
		Member member = null;
		try {
			conn();
			String sql = "select * from member where member_membership = 'N'";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				member = new Member();
				member.setMemberMembership(rs.getString("member_membership"));
				member.setMemberId(rs.getString("member_id"));
				member.setMemberPw(rs.getString("member_pw"));
				member.setMemberName(rs.getString("member_name"));
				member.setMemberTel(rs.getString("member_tel"));
				member.setMemberRedate(rs.getDate("member_redate"));
				list.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//3. 회원가입 승인페이지 에 개인회원 등록 과정
	public int prMemAdmin(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "update member set member_class = ?, member_teacher = ?, member_number = ?, member_membership = 'Y' where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberClass());
			pstmt.setString(2, member.getMemberTeacher());
			pstmt.setInt(3, member.getMemberNumber());
			pstmt.setString(4, member.getMemberId());
			
			result =pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//3. 회원가입 승인페이지 에 주2회 3회 회원 등록 과정
	public int weekAdmin(Member member) {
		int result =0;
		try {
			conn();
			String sql = "update member set member_class = ?,  member_membership = 'Y', member_stdate = ?,member_endate = ?, member_exdate = ? where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberClass());
			pstmt.setDate(2, member.getMemberStdate());
			pstmt.setDate(3, member.getMemberEndate());
			pstmt.setInt(4, member.getMemberExdate());
			pstmt.setString(5, member.getMemberId());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//락커 전체 사용현황 조회
	public List<Member> lockerPermissionList() {
	List<Member> list = new ArrayList<Member>();
	Member member = null;
	try {
		conn();
		String sql = "select * from locker where member_id is not null";
		
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			member = new Member();
			member.setLockerNumber(rs.getInt("locker_number"));
			member.setMemberId(rs.getString("member_id"));
			member.setLockerStdate(rs.getDate("locker_stdate"));
			list.add(member);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		disconn();
	}
	return list;
	}

	
	// 락커 대여 신청자 전체 조회
	public List<Member> lockerAppList() {
		List<Member> list = new ArrayList<Member>();
		Member member = null;
		try {
			conn();
			String sql = "select * from locapply";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				member = new Member();
				member.setMemberId(rs.getString("member_id"));
				member.setLocapplyRedate(rs.getDate("locapply_redate"));
				list.add(member);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	
	
	//락커 사용 허가 관리
	public int lockeradmin(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "update locker set member_id = ? ,locker_stdate = sysdate where locker_number =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setInt(2, member.getLockerNumber());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	public int deleteLocapp(String memberId) {
		int result = 0;
		try {
			conn();
			String sql = "delete from locapply where member_id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//연장관리에 연장 신청가능한 회원 조회
	public List<Member> exDateMemSelect() {
		List<Member> list = new ArrayList<Member>();
		Member member = null;
		try {
			conn();
			String sql = "select member_id, member_name, member_stdate, member_endate, member_class,member_exdate from member where member_exdate > 0";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				member = new Member();
				member.setMemberId(rs.getString("member_id"));
				member.setMemberName(rs.getString("member_name"));
				member.setMemberStdate(rs.getDate("member_stdate"));
				member.setMemberEndate(rs.getDate("member_endate"));
				member.setMemberClass(rs.getString("member_class"));
				member.setMemberExdate(rs.getInt("member_exdate"));
				list.add(member);
				
		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//락커 번호에 사용인원있는지 확인하기
	public Member checLocNum(int lockerNumber) {
		Member member = null;
		try {
			conn();
			String sql = "select member_id from locker where locker_number = ? AND member_id IS NOT NULL";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, lockerNumber);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				member = new Member();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return member;//반환되는 member가 null이면 안쓰고있음. member가 null아니면 누가 쓰고있음
	}
	

	
	//연장관리의 만료일 연장한 회원 조회 
	public List<Member> exStatuseSelect() {
		List<Member> list = new ArrayList<Member>();
		Member member = null;
		try {
			conn();
			String sql = "select member_id, member_name, member_stdate, member_endate, member_class,member_exstatus,member_exappdate from member where member_exstatus > 0";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				member = new Member();
				member.setMemberId(rs.getString("member_id"));
				member.setMemberName(rs.getString("member_name"));
				member.setMemberStdate(rs.getDate("member_stdate"));
				member.setMemberEndate(rs.getDate("member_endate"));
				member.setMemberClass(rs.getString("member_class"));
				member.setMemberExtatus(rs.getInt("member_exstatus"));
				member.setMemberExappDate(rs.getDate("member_exappdate"));
				list.add(member);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	
	//회원 삭제 하기
	
	public int deleteMember(String memberId) {
		int result = 0; 
		try {
			conn();
			String sql = "delete from member where member_id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
}