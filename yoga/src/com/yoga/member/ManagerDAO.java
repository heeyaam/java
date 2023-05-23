package com.yoga.member;

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
}
