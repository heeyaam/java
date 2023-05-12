package chap6;

import com.yedam.access.Access;

public class Application07 {

	//필드 선언
	int num = 1;
	
	//a메소드 선언
	void info() {
		System.out.println("info 출력");
	}
	
	
	
	public static void main(String[] args) {
		//이렇게 쓰지 말기
		Application07 app = new Application07();
		int a =app.num+1;

		app.info();
		
		
		
		//클래스에 정의된 정적 맴버 사용
		//클래스명. 필드명| 클래스명.메소드명		
		System.out.println(StaticCal.PI);
		

		
		
		
		
	Person p1 = new Person("11111-11111", "김또치");
	
	System.out.println(p1.nation);
	System.out.println(p1.ssn);
	System.out.println(p1.name);
	
	
	System.out.println("지구의 반지름 : " + StaticCal.EARTH_PADIUS);
	System.out.println("지구의 표면적 : " +StaticCal.EARTH_PADIUS*StaticCal.EARTH_PADIUS);
	
	//다른 패키지에서 가져온 것들 실행
//	Access ac = new Access();
//	ac.free = "public";
//	ac.parent = "protected";
//	ac.basic = "default";
//	ac.private = "privacy";
	
	}


}
