package chap6;

public class Applicatiion03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer= new Computer();
		
		//1)배열을 활용
		int[] values1 = {1,2,3,};
		int result1 = computer.sum1(values1);
		System.out.println(result1);
		
		result1 =computer.sum1(new int[10]);
		System.out.println(result1);
		
		result1 = computer.sum1(new int[] {1,2,3,4});
		System.out.println(result1);
		
		//2> 목록을 넘겨주는 방식
		
		int result2 = computer.sum2(1,2,3);
		System.out.println(result2);
		
		int result3 = computer.sum2(1,2,3,4,5);
		System.out.println(result3);
		
		
		Calcurator cal = new Calcurator();
		cal.excute();
		
		
		double result4 = cal.areaRectangle(10.5);
		System.out.println(result4);
		
		double result5 = cal.areaRectangle(20.4, 10.2);
		System.out.println(result5);
		
		Book book = new Book("혼자공부하는 자바","학술서","24000", "12345", "한빛미디어");
		book.getInfo();
			
		
		
	}

}
