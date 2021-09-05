package calenderex;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int date = today.get(Calendar.DATE);
		char[] dayofweek = {'일', '월', '화', '수', '목', '금', '토'};
		
		
		System.out.println("=== 날짜 설정하기 ===");
		System.out.println("올해의 연도 : " + year);
		System.out.println("월(0~11) : " + month);		// 월은 0부터 시작(0월~11월)
		System.out.println("일 : " + date);
		System.out.println("요일 : " + dayofweek[today.get(Calendar.DAY_OF_WEEK)-1]);		// 요일 : 1-일요일, 2-월요일, 3-화요일 ... 7-토요일
		
		// 시간 설정하기
		System.out.println("=== 시간 설정하기 ===");
		System.out.println("시간(0~11) : " + today.get(Calendar.HOUR));
		System.out.println("분(0~59) : " + today.get(Calendar.MINUTE));
		System.out.println("초(0~59) : " + today.get(Calendar.SECOND));
		System.out.println("오전(0), 오후(1) : " + today.get(Calendar.AM_PM));
		
		// 지금까지의 시간 - 1970.01.01 자정 이후 밀리초(1/1000)로 환산 - getTimeInMillis()
		System.out.println("=== 현재까지의 시간===");
		System.out.println("초로 환산 : " + today.getTimeInMillis()/1000);
		System.out.println("일로 환산 : " + today.getTimeInMillis()/(24*60*60*1000));
	}

}
