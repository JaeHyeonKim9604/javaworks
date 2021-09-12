package angkkoproject;

public class MyDate {

	private int day, month, year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	// 날짜의 유효 여부 판단 매서드
	public boolean isValid() {
		// 1, 3, 5, 7, 8, 10, 12월 = 31일
		// 4, 6, 9, 11월 = 30일
		// 2월 = 기본 : 28일
		// 윤년 : 4로 나누어 떨어지는 해는 윤년
		//		 4로 나누어 떨어지지만 100으로도 나누어 떨어지는 해는 평년
		//		 단, 400으로 나누어 떨어지는 해는 윤년
		boolean valid = true;
		switch(this.month) {
		case 1, 3, 5, 7, 8, 10, 12:
			valid = ((this.day > 0) && (this.day < 32)) ? true : false;
			break;
		case 4, 6, 9, 11:
			valid = ((this.day > 0) && (this.day < 31)) ? true : false;
			break;
		case 2:
			 if(this.year % 4 == 0) {
				 if(this.year % 100 == 0) {
					 if(this.year % 400 == 0) {
						 valid = ((this.day > 0) && (this.day < 30)) ? true : false;
						 break;
					 }
					 valid = ((this.day > 0) && (this.day < 29)) ? true : false;
					 break;
				 }
				 valid = ((this.day > 0) && (this.day < 30)) ? true : false;
				 break;
			 }
			 valid = ((this.day > 0) && (this.day < 29)) ? true : false;
			 break;
		default:
			valid = false;
			break;
		}
		
		if(valid == false) {
			System.out.println("유효하지 않은 날짜입니다.");
		}
		else {
			System.out.println("유효한 날짜입니다.");
		}
		return valid;
	}
	
}
