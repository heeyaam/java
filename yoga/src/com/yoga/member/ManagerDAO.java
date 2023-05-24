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
	
//	//2. 회원 수정 관리에서  2. 회원 믈래스 수정
//	public int classUpdate(Member member) {
//		int result = 0;
//		try {
//			conn();
//			String sql = "update member set member_class =? where member_id = ?";
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, member.getMemberClass());
//			pstmt.setString(2, member.getMemberId());
//			
//			result = pstmt.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			disconn();
//		}
//		return result;
//	}
	
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
	
}
