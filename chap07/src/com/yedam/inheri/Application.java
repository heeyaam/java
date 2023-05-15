package com.yedam.inheri;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp= new SmartPhone("아이폰", "스그", "sk");
		
		
		//CellPhone(부모) Class
		System.out.println("모델 : " + sp.model);
		System.out.println("색상 : "+ sp.color);
		
		//SmartPhone(자식) Class
		System.out.println("통신사 : " + sp.agency);
		
		//부모 class
		sp.powerOn();
		sp.bell();
		sp.hangUp();
		sp.powerOff();
		
		//자식 class
		sp.kakaoExe();
		sp.kakaoExit();
		sp.Info();

	}

}
