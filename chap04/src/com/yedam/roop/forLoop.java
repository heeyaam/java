package com.yedam.roop;

import java.util.Scanner;


public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for문
		for(int i=1; i<= 100; i++) {
		System.out.println(i);
		}
		
		int result = 0;
		
		for(int i=1; i<= 100; i++) {
			result = result +i;
		}
		System.out.println("1~100합계"+ result);
		
		//1~100사이 짝 홀 구하기
		//숫자 52 =0 짝수
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				System.out.println(i +"짝수");
			}else if(!(i % 2 ==0)) {
				System.out.println(i +"홀수");
			}
		}
		
		//입력한 숫자애 대한 구구단 출력
		
		Scanner sc = new Scanner(System.in);
		
		int gugu = Integer.parseInt(sc.nextLine());
		
		for(int i=1; i<=9; i++) {
			System.out.println(gugu +"*" + i + "=" + (gugu*i));
		}
		
		//입력한 값애 댜한 총합, 평균, 최댓갑, 최솟값구하기
		//몇번 반복 값을 입력 받는다.
		//예시) 5번 반복 -> 2, 50,20,10,5
		//데이터 횟수 반복 입력
		Scanner sc1 = new Scanner(System.in);
		
		
		int count = Integer.parseInt(sc.nextLine());

		int total =0;
		int avg = 0;
		int max = 0;
		int min=0;
		
		
		for(int i=0; i<count;i++) {
			System.out.println("데이터입력");
			 int data = Integer.parseInt(sc.nextLine());
			 //총합계 -> 데이터를 입력받는대료 누적
			 //평균 -> 총합계 / 반복문 횟수 
			 //촤댓값 -> 반복할때 마다 최댓값, 입력값 비교
			 //촤소값 -> 반복할때 마다 최소값, 입력값 비교
			 total += data; 
			 if(i==0) {
				 max=data;
				 min=data;
			 }else {
				 if(max<data) {
					 min = data;
				 }
				 if(min>data) {
					 min = data;
				 }
			 }
		}
		
		//평균
		System.out.printf("평균 : %5.2f\n", (double)total/count);
		System.out.println(total + "최댓갑"+ max +"최솟값"+ min);
		
		//임의의 랜덤값(1~100)하나 추출
		//5번기회만에 랜덤값 맞추기
		//예시) 랜덤값 :50
		// 입력 -> 30
		//컴퓨터 :up
		// 입력 -> 60
		//컴퓨터 :up
		
		//1)맞춘경우
		//정답입니다. 몇번반에 맞추셨습니다.
		//2) 못맞춘 경우
		// 모든 기회를 소진 하셨습다.
		//반복문 강제 종료 -> break;
		
		int random = (int) (Math.random()*100) +1;
		
		System.out.println("숫자입력");
		
		for(int i=1; i<=5; i++) {
			//데이터입력
			int user = Integer.parseInt(sc.nextLine());
			if(user == random){
				System.out.println("정답입니다." + i +  "번만에 맞추셨습니다");
			}else if(user < random) {
				System.out.println("up");
			}else if(user > random) {
				System.out.println("down");
			}
			if(i==5) {
				System.out.println("모든 기회 소진");
			}		
		}
		
		
		}

}
