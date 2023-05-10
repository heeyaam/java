package array1;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//값 목록을 활용해서 배열 만들기
		//총 6개으이 데이터를 담을 수있는 배열 생성fdg dsa
		//각데이터를 배열의 공간에 입력
		
		//배열 생성 동시에 데이터 입력
		int[] intAry = {1,2,3,4,5,6};
		
		//배열 생성만 하는 방법 -> 데이터 입력 되지 않은 방식
		int[] intAry2 = new int[6];
		//배열  데이터입력
//		intAry2[0] = 1;
//		intAry2[1] = 2;
//		intAry2[2] = 3;
//		intAry2[3] = 4;
//		intAry2[4] = 5;
//		intAry2[5] = 6;
		
		//문자열 입력할 수있는 배열 생성
		String[] strAry = new String[10];
		
		System.out.println("intAry2의 첫번째 값 :" + intAry2[0]); //기본값
		System.out.println("strAry의 첫번째 값 :" + strAry[0]); //기본값
		
		System.out.println("intAry의 세번째값 :" +  intAry[2]);
		
		
		//반복문과 배옇
		//반복문의 i, 배열의 index 매칭
		//strAry -> 10개 데이터 담을 수 있는 배열

		int[] score = {83, 90, 87};
		int sum =0;
		for(int i=0; i<3; i++) {
			System.out.println(score[i]);
			sum += score[i];
		}
		System.out.println("score의 합계" +sum);
		
		//new연산자 활용한 배열 생성
		int[] point;
		point = new int[]{1,2,3};
		
		//데이터 입력하지않고 
		int[] arr1 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+i+"] : " +arr1[i]);}
			
			arr1[0] =30;
			arr1[1] =20;
			arr1[2] =10;
			for(int i=0; i<3; i++) {
				System.out.println("arr1["+i+"] : " +arr1[i]);}
		
		//string 을 활용
			String[] arr2 = new String[3];
			for(int i=0; i<3; i++) {
				System.out.println("arr2["+i+"] : " +arr2[i]);}
				
				arr2[0] ="3월";
				arr2[1] ="2월";
				arr2[2] ="1월";
				for(int i=0; i<3; i++) {
					System.out.println("arr2["+i+"] : " +arr2[i]);}

		
		
		
	}

}
