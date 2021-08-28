package thissample;

// 클래스를 직접 만들때 public을 붙이지 않음(public이 붙은 클래스는 파일 이름임)
class Birthday{
	private int day;
	private int month;
	private int year;
	
	//public Birthday() {}    디폴트 생성자가 항상 있는것을 기억
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisTest {

	public static void main(String[] args) {
		//Birthday 클래스 사용
		Birthday dDay = new Birthday();
		dDay.setYear(2021);
		
		dDay.printThis(); //메모리 주소 출력
		System.out.println(dDay); // 메모리 주소
	}

}
