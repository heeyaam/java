package array1;


import java.util.Calendar;

public class weekk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//타입  변수    데이터
		//Week 타입의 today 변수
		//today Week가 가지고 있는 데이터만 사용가능
		//today 가질 수 있는 데이터 요일 
		week today = null;
		
		//일요일 =1 월요일 =2 .....
		Calendar calendar = Calendar.getInstance();
		
		
		int Week = calendar.get(Calendar.DAY_OF_WEEK);
		
		switch (Week) {
		case 1:
			today = week.MONDAY;
			break;
		case 2:
			today = week.TUESDAY;
			break;
		case 3:
			today = week.WEDNESDAY;
			break;
		case 4:
			today = week.THURSDAY;
			break;
		case 5:
			today = week.FRIDAY;
			break;
		case 6:
			today = week.SATURDAY;
			break;
		case 7:
			today = week.SUNDAY;
			break;


		}
		
	}

}
