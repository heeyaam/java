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
	
	
	
	//회원가입시 id 중복 체크 위한것
	public Member idCheck(String id) {
		Member member =null;
		try {
			conn();
			String sql = "select member_id from member where member_id = ? union select manager_id from manager where manager_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				member = new Member();
				member.setMemberId(rs.getString("member_id"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return member;
	}
	
	
	//회원가입 정보 입력 부분
	public int joinMember(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "insert into member(member_grade, member_id, member_pw, member_name, member_tel, member_redate) values('N', ?,?,?,?,sysdate)";
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
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return member;
	}
	
}
