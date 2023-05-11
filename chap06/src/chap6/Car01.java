package chap6;


public class Car01 {

	//필드 :객체를 만들었을 떄 정보를 담아주는 역할
	
	//필드 선언
	String name; //자동차 이름
	int price; //자동차 가격
	
	//클렛스 내부에서 필드에 정보를 입력
	String company = "벤틀리"; //브랜드 제조사
	
	//생성자 : 객체로 만들때 내가 하고 싶은 행위를 정의
	//		:클레스 이름과 동일
	Car01(){
		//기본생성자 생성자의 이름은 class 이름과 같아야함.
	}
	Car01(String name, int price){
		
	}
	Car01(int price, String company){
		
	}
	
	Car01(String name){			//this()는 맨앞에 와야함
		this(name, 1000,"현대"); //this() 는 매개변수 3개 생성자를 뜻함
//		this.name =name;
		System.out.println("자동차 이름 입력");
		
	}
	Car01(int price){
		
	}
	Car01(String name, int price, String company){
		this.name =name;
		this.price = price;
		this.company = company;
		System.out.println("모든 필드 초기화");
	}
	
	
	//메소드 : 객체가 사용할 수 있는 기능
	//반환값(리턴값이 없는 메소드
	void run() {
		System.out.println("자동차가 달립니다");
	}

	//문자열을 반환하는 메소드
	String info() {
		String data = company + name + price;
		return data;
	}
}
