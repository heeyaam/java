package chap6;


public class Book {
	//다음과 같은 출력물이 나오도록 구현
	//객체, 생성할 때, 생성자를 통한 필드 초기화
	//갹체.getInfo()
	//책이름 : 혼자공부하는 자바
	//# 내용
	//1) 종류: 학술서
	//2)가격: 24000
	//3) 출판사 : 한빛 미디어

	
	//Book 이라는 클레스는 아래의 정보를 가진다. --> 필드
	//책이름, 책종류, 가격, 도서번호, 출판사
	//정보는 필드
	String name;
	String kind;
	String price;
	String number;
	String pub;
	
	
	//생성자는 두개
	//기본생성자
	//모든 데이터 받아오는 생성자
	
	Book(){
		
	}
	Book(String name, String kind, String price, String number, String pub){
		this.name = name;
		this.kind = kind;
		this.price = price;
		this.number = number;
		this.pub = pub;
		
	}
	
	//메소드
	//모든정보를 출력할 수 있는 getInfo()
	
	
	void getInfo() {
		System.out.println("책이름:" +name);
		System.out.println("종류:" +kind);
		System.out.println("가격:" +price);
		System.out.println("도서번호:" +number);
		System.out.println("출판사:" +pub);
		
	}
	
	
	

	


	
	
	

}
