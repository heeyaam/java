package com.yoga.member;

import com.yoga.common.DAO;


public class MemberDAO extends DAO{
	
	private static MemberDAO memberDao = null;
	
	private MemberDAO() {
		
	}
	
	public static MemberDAO getinstance() {
		if(memberDao ==null) {
			memberDao = new MemberDAO();
		}
		return memberDao;
	}
	

	//회원가입 정보 입력 부분
	public int joinMember(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "insert into member(member_grade, member_id, member_pw, member_name, member_tel, member_redate, member_membership) values('N', ?,?,?,?,sysdate,'N')";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getMemberTel());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}

	
	//회원 로그인 기능
	public Member memberlogin(String id) {
		Member member = null;
		try {
			conn();
			String sql= "select * from member where member_id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				member = new Member();
				member.setMemberId(id);
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
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return member;
	}
	
	
	//개인 정보 관리에서 비밀번호 수정 기능
	public int updatePw(Member member) {
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
	
	
	//락커 관리 페이지의 락커 대여현황 파악 기능
	
	public Member psLockerCheck(String memberId) {
		Member member = null;
		try {
			conn();
			String sql = "select * from locker where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				member = new Member();
				member.setMemberId(memberId);
				member.setLockerPermission(rs.getString("locker_permission"));
				member.setLockerRedate(rs.getDate("locker_redate"));
				member.setLockerStdate(rs.getDate("locker_stdate"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return member;
	}
	
	// 락커 신청 하기
	public int lockApp(Member member) {
		int result = 0;
		try {
			conn();
			String sql = " insert into locker(locker_permission, member_id, locker_redate) VALUES('N', ?, sysdate) ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			
			result = pstmt.executeUpdate();
			
			} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	// 락커 반납 신청 하기
	public int lockerReturn(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "delete from locker where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
}
