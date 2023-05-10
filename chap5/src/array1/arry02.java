package array1;


import java.util.Scanner;

public class arry02 {
	public static void main(String[] args) {
		
//		int[] intAry = new int[10];
//		
//		System.out.println( "길이" + intAry.length);
//		
//		for(int i=0; i<10; i++) {
//			System.out.println(intAry[i]);
//		}
//		
//		for(int i=0; i<intAry.length; i++) {
//			System.out.println(intAry[i]);
//		}
//		
	Scanner sc = new Scanner(System.in);
//		
//		//배열
//		int[] ary;
//		
//		//배열 크기 결정하는 변수
//		int no;
//		
//		//입력받은 대로 배열 크기 바꿀수 있음
//		
//		System.out.println("배열의 크기>");
//		no = Integer.parseInt(sc.nextLine());
//		
//		ary = new int[no];
//		//데이터 입력
//		for(int i=0; i<ary.length; i++) {
//			System.out.println("입력>");
//			int data = Integer.parseInt(sc.nextLine());
//			ary[i] = data;
//		}
//		//배열의 데이터 출력
//		for(int i=0; i<ary.length; i++) {
//			System.out.println(ary[i]);
//		}
//		
//		//국영수의 데이터를 담는 배열
//		int[] point =new int[3];
//		// 0=국 1=영 2=수
//		
//		System.out.println("국어점수>");
//		point[0] = Integer.parseInt(sc.nextLine());
//		System.out.println("영어점수>");
//		point[1] = Integer.parseInt(sc.nextLine());
//		System.out.println("수학점수>");
//		point[2] = Integer.parseInt(sc.nextLine());
//		
//		//1)점수의 총합계
//		int sum =0;
//		for(int i=0; i<point.length; i++) {
//			sum = sum + point[i];
//		}
//		System.out.println("총합계 :" + sum);
//		
//		//2)평균
//		double avg = (double)sum/point.length; 
//		System.out.println("평균:" + avg);
		
		//입력받은 데이터의 갯수의 총합, 평균, 최대 ,최소
		
		int[] intAry2;
		
		System.out.println("데이터갯수>");
		//배열 크기
		int num = Integer.parseInt(sc.nextLine());
		
		intAry2 = new int[num];
		
		for(int i=0; i<intAry2.length; i++) {
			//index = 0; 첫번째값
			// 0번째 데어터 넣으세요> ???
			//1번째 >
			System.out.println((i+1)+ "번째>");
			
			intAry2[i] = Integer.parseInt(sc.nextLine());
		}
		
		int sum  =0;
		int avg= 0;
		int max =0;
		int min=0;
		
		for(int i= 0; i<intAry2.length; i++) {
			System.out.println(intAry2[i]);
			sum += intAry2[i];
			if(max < intAry2[i]) {
				max = intAry2[i];
			}
			if(min >intAry2[i]) {
				min = intAry2[i];
			}
		}

		
		System.out.println("총합계" +sum);
		System.out.println("최댓값" +max +"최솟값" +min);
		System.out.println("평균" + (double)sum/intAry2.length);
		
		
		
		//문제 6 201
		
		
//		boolean run = true;
//
//		int studentNum =0;
//		int[] scores =null;

		
		
		//책참고
//		while (run) {
//			System.out.println("--------------------------");
//			System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4.분석 | 5. 종료");
//			System.out.println("----------------------------");
//			System.out.print("선택>");
//			int selectNo = Integer.parseInt(sc.nextLine());
//
//
//			if(selectNo == 1) {
//				System.out.print("학생수>");
//				studentNum = Integer.parseInt(sc.nextLine());
//				scores =new int[studentNum];
//			}else if(selectNo == 2) {
//				for(int i=0; i<student.length; i++) {
//					System.out.print("score["+i + "]>");
//					scores[i] = Integer.parseInt(sc.nextLine());
//				}
//				
//			}else if(selectNo == 3) {
//				for(int i=0; i<student.length; i++) {
//					System.out.print("score["+i + "]>" + scores[i]);
//					}
//				
//			}else if(selectNo == 4) {
//				int sum =0;
//			int max =c 
//				
//			}else if(selectNo == 5) {
//				run = false;
//				
//			}
//		}
		//answer 배열에 담긴 데이터를 읽고 각 숫자마다 개수만큼 
		//아래에 빈 영역코드를 입력하여 프로그램완선하라
		
		
		
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		for(int i=0; i<counter.length; i++) {
			counter[answer[i]-1]++;
		}
		for(int i=0; i<counter.length; i++) {
			for(int j=0; j<counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		
	}

}
