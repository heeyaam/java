package com.yoga.member;

import java.sql.Date;

public class Member {
	
//	create table member(
//			member_grade char(1),    -> 회원임을 구분 (무조건 'N')
//			member_id VARCHAR2(10) PRIMARY KEY, 
//			member_pw VARCHAR2(10),
//			member_name VARCHAR2(10),
//			member_tel VARCHAR2(13),
//			member_redate DATE,           -> 회원등록일자 (회원등록시 그날 날짜 알아서 기록)
//			member_stdate DATE,           -> 수업 기간 시작일 
//			member_endate DATE,           -> 수업 기간 종료날
//			member_class VARCHAR2(10),	  -> 주2회/ 주3회 / 개인레슨 3개중 구분
//			member_teacher VARCHAR2(10),  -> 개인레슨일 경우 담당 선생님
//			member_exdate Number,			  -> 연장가능한 기간
//			member_exstatus Number);		  -> 연장 했을 시 연장한 기간
	

	//member table
	private String memberGrade;
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberTel;
	private Date memberRedate;
	private Date memberStdate;
	private Date memberEndate;
	private String memberClass;
	private String memberTeacher;
	private int memberExdate;
	private int memberExtatus;
	private int memberNumber;
	
	
	
	public String getMemberGrade() {
		return memberGrade;
	}
	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberTel() {
		return memberTel;
	}
	public void setMemberTel(String memberTel) {
		this.memberTel = memberTel;
	}
	public Date getMemberRedate() {
		return memberRedate;
	}
	public void setMemberRedate(Date memberRedate) {
		this.memberRedate = memberRedate;
	}
	public Date getMemberStdate() {
		return memberStdate;
	}
	public void setMemberStdate(Date memberStdate) {
		this.memberStdate = memberStdate;
	}
	public Date getMemberEndate() {
		return memberEndate;
	}
	public void setMemberEndate(Date memberEndate) {
		this.memberEndate = memberEndate;
	}
	public String getMemberClass() {
		return memberClass;
	}
	public void setMemberClass(String memberClass) {
		this.memberClass = memberClass;
	}
	public String getMemberTeacher() {
		return memberTeacher;
	}
	public void setMemberTeacher(String memberTeacher) {
		this.memberTeacher = memberTeacher;
	}
	public int getMemberExdate() {
		return memberExdate;
	}
	public void setMemberExdate(int memberExdate) {
		this.memberExdate = memberExdate;
	}
	public int getMemberExtatus() {
		return memberExtatus;
	}
	public void setMemberExtatus(int memberExtatus) {
		this.memberExtatus = memberExtatus;
	}
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	
	
	
	

}
