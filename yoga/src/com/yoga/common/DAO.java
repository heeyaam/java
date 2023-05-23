package com.yoga.common;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class DAO {
	//DAO ->  data(DB) access Object     자바와 디비를 연결만 하는 것 
	//JDBC 를 통해서 자바 디비 연결
	
	//자바 디비 연결할 때 쓰는 객체
	protected Connection conn = null;
	// Query문(SQL, 질의)을 가지고 실행하는 객체
	protected PreparedStatement pstmt = null;
	// Query문(SQL, 질의)을 가지고 실행하는 객체
	protected Statement stmt = null;
	// SELECT(조회) 결과 값을 반환받는 객체
	protected ResultSet rs = null;
	
	// DB 접속 정보
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "c##yoga";
	String pw = "1234";
	
	
	// DB 연결 메소드
	public void conn() {
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,id,pw);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	// DB 종료  : 모든 내용 담을 수 있게 모두 if 문으로 작성해 줘야함 if else 사용하지 말기
	
	public void disconn() {
		try {
			if(rs != null) {
				rs.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}if(conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	

}
