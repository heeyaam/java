package com.reference;

import java.io.DataOutput;

public class Raference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//참조 : 배열
		// String 의 == 비교는 주소를 비교하는 것 데이터를 비교하는 것은 .equals 써야함 
		int[] array = {1,2,3,4,5,6};
		int[] array2 = {1,2,3,4,5,6};
		int[] array3 = null; // 참조(객체) -> null 은 참조할 객체가 없다
		
		System.out.println(array); // -> 데이터가 아니라 변수가 있는 주소를 보여줌
		System.out.println(array2);
		
		System.out.println(array == array2); //주소끼리 비교하는 것으로 볼 수 있음
		System.out.println(array[0]); // -> 변수의 데이터 가져오기
		
		// System.out.println(array3[0]);
		System.out.println(array3 ==array ); // 객체의 null을 체크하는 용도 //참조주소가 null은 이거정도 쓸수 있음
//		if(array3 == null) {
//			 //array3이 null인 경우 // 객체 null 제외 용도
//		}else {
//			//array3에 객체가 있는 경우
//		}
		
		
		
		
	}

}
