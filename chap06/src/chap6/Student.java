package chap6;

public class Student {
	String name;
	String grade;
	int ko;
	int en;
	int math;
	
	Student() {
		
	}
	
	void getInfo() {
		
		System.out.println("이름:"+ name);
		System.out.println("학년:"+ grade);
		System.out.println("국어:"+ ko);
		System.out.println("영어:"+ en);
		System.out.println("수학:"+ math);
	}
	

}
