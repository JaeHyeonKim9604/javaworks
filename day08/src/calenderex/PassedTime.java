package calenderex;

import java.util.Calendar;

public class PassedTime {

	public static void main(String[] args) {
		// 시작일 ~ 종료일 계산
		Calendar Day1 = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		
		// 시작일 설정
		Day1.set(2021, 7, 14);
		
		// 날짜 출력
		String startDay = Day1.get(Calendar.YEAR) + "년 " + (Day1.get(Calendar.MONTH)+1) + "월 " + Day1.get(Calendar.DATE) + "일";
		String ToDay = today.get(Calendar.YEAR) + "년 " + (today.get(Calendar.MONTH)+1) + "월 " + today.get(Calendar.DATE) + "일";
		
		System.out.println("개강일 : " + startDay);
		System.out.println("현재 : " + ToDay);
		
		long passedTime = today.getTimeInMillis() - Day1.getTimeInMillis();
		int passedTimeDay = (int)passedTime/(24*60*60*1000);

		System.out.println("개강 후 " + passedTimeDay + "일 지났습니다.");
	}

}
