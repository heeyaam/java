package chap6;

public class Application01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car Class -> 객체로 바꿈
		Car01 myCar = new Car01();
	//   타입  변수      객체생성 생성자 
		
		//dot,, .
		//배열.length  -> 배열이 가지고 있는 기능을 가져오는것
		//Car01 클레스의 필드를 가져오는것 기능 타입 동일
		
		//데이터 넣지 않았을때
		System.out.println(myCar.company);
		System.out.println(myCar.price);
		System.out.println(myCar.name);
		
		//1.클래스 외부에서 객채를 생성하고 필드를 호출하여 정보를 담아주는 형식
		//데이터 입력
		myCar.company = "현대";
		myCar.price =1234;
		myCar.name ="소나타";
		
		System.out.println("==객체 필드 데이터==");
		System.out.println(myCar.company);
		System.out.println(myCar.price);
		System.out.println(myCar.name);
		
		
		// 같은 클레스를 이용한 새로운 객체 생성
		Car01 yourCar = new Car01();
		
		System.out.println("== 객체 구분 ==");
		System.out.println(myCar.company);
		System.out.println(yourCar.company);
		
		
		
		System.out.println("=o= Korean Calss 할용한 객체 생성===");
		
		Korean k1 = new Korean("박자바", "01125-11111");
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		
		System.out.println("==생성자 오버로딩을 활용한 객체 생성==");
		
		// 매개변수가 하나인 생성자 활용
		Car01 oneCar = new Car01("소나타");
		System.out.println("oneCar의 필드 name:" + oneCar.name);
//		
		oneCar.run();
		System.out.println(oneCar.info());
//		Car01 threeCar01 = new Car01("그랜저", 3000, "현대");
//		System.out.println("ThreeCar의 필드 :" + threeCar01.name);
//		System.out.println("ThreeCar의 필드 :" + threeCar01.price);
//		System.out.println("ThreeCar의 필드 :" + threeCar01.company);
		
		
		
		
		
		
	}

}
