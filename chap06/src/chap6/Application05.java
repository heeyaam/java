package chap6;

import java.util.Scanner;


public class Application05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 배열
		//Book Class
		Book[] bookAry = new Book[10];
		
		//객체를 생성해서 저장
		Book b1 = new Book("혼자공부하는 자바","학술서","24000", "12345", "한빛미디어");
		bookAry[0] = b1;
		
		System.out.println(b1);
		System.out.println(bookAry[0]);
		//b1.getInfo()
		//bookAry[0].getInfo()
		
		//배열의 공간에 바로 객체 생성
		bookAry[1] = new Book();
				
		//객체배열
		// 책들의 정보를 저장한 프로글램
		
		
		//책정보 보관하는 프로그램
		Book[] bookAry2 = null;
		
		int bookNum =0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=================");
			System.out.println("1.책수 | 2. 책입력 | 3. 정보확인 | 4. 종료");
			
			String selectNo = sc.nextLine();
			
			if(selectNo.equals("1")) {
				System.out.println("책수>");
				bookNum = Integer.parseInt(sc.nextLine());
			}else if(selectNo.equals("2")) {
				
			}
			bookAry2 = new Book[bookNum];
			Book book = new Book();
			for(int i=0; i<bookAry2.length; i++) {
			System.out.println("책제목>");
			book.name =sc.nextLine();
			
			System.out.println("책 종류>");
			book.kind =sc.nextLine();
			
			System.out.println("책 가격>");
			book.price =sc.nextLine();
			System.out.println("도서번호>");
			book.number =sc.nextLine();
			System.out.println("출판사>");
			
			//bookAry2 각위치마다 생성한 객체 저장
			
			
		}else if(selectNo.equals("3")) {
			for(int i=0; i<bookAry.length; i++) {
			System.out.println((i+1)+"번쨰 정보");
			bookAry[i].getInfo();
			System.out.println();}
			
		}
			
		}else if(selectNo.equals("4")) {
		}
		

	}

}
