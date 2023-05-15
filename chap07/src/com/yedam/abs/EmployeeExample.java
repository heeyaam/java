package com.yedam.abs;



public class EmployeeExample {

	public static void main(String[] args) {
		
		//문제1.
		EmpDept empdept = new EmpDept();
		
		empdept.name = "이지나";
		empdept.pay = 3000;
		empdept.dpName = "교육부";
		
		empdept.getInformation();
		
		empdept.print();
	}

}
