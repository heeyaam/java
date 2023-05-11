package chap6;

import java.util.Scanner;

public class Application06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//학생의 정보를 관리하는 프로그램
		
		//학생의 정보를 관리하는 객체
		//이름, 학년, 국어, 영어, 수학
		
		//기본생성자
		
		//메소드
		//모든 정보를 출력 getInfo()
		
		//1. 학생수 
		//2. 정보입력 
		//3. 정보확인 
		//4.분석- 전체 학생의 점수를 
		//     - 총합(국,영,수) 총점의 평균
		//		- 개인별 가장 점수가 높은 과목/ 낮은 과목
		//5. 종료
		
		boolean run= true;
		
		Student[] stdAry =null;
		
		Scanner sc= new Scanner(System.in); 
		
		while(run) {
			System.out.println("=================");
			System.out.println("1.학생수 | 2. 정보입력 | 3. 정보확인 | 4. 분석 |5. 종료");
			System.out.println("=================");
			
			int no = Integer.parseInt(sc.nextLine());
			
			
			Student student = new Student();
			int num=0;
			
			
			if(no==1){
				System.out.println("1.학생수>");
				num = Integer.parseInt(sc.nextLine());
				
			}else if(no==2) {
				stdAry = new Student[num];
				
				for(int i=0; i<stdAry.length; i++) {
					//배열에 객체를 바로 만듬
					stdAry[i] = new Student();
					
				System.out.println("이름>");
				stdAry[i].name = sc.nextLine();
				
				System.out.println("학년>");
				stdAry[i].grade = sc.nextLine();
				
				System.out.println("국어점수>");
				stdAry[i].ko = Integer.parseInt(sc.nextLine());
				
				System.out.println("영어점수>");
				stdAry[i].en = Integer.parseInt(sc.nextLine());
				
				System.out.println("수학점수>");
				stdAry[i].math = Integer.parseInt(sc.nextLine());
				}
				
				
			}else if(no==3) {
				for(int i=0; i<stdAry.length; i++) {
				student.getInfo();
				}
			}else if(no==4) {
				
				int total =0;
				double avg =0;
				int max=0;
				int min=0;
				for(int i=0; i<stdAry.length; i++) {
					//반복문 누적 합계
					total = stdAry[i].ko +stdAry[i].en+stdAry[i].math;
					
					max = stdAry[i].ko;
					min = stdAry[i].ko;
					
					if(stdAry[i].en<stdAry[i].math) {
						
						if(max<stdAry[i].math) {
							max = stdAry[i].math;
						}else {
							if(max<stdAry[i].en) {
								max = stdAry[i].en;
							}
						}
					}
				}
				
				System.out.println("총합" +total);
				System.out.println("평균:" +(double)total/stdAry.length);
			}else if(no==5) {
				System.out.println("프로그램 종료");
				break;
			}
			
			
			
			
			
		}
		
	
	}

}
