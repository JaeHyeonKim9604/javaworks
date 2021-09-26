package innerclass;

public class Student2 {
	private String name;
	private Score score;
	
	public Student2(String name) {
		this.name = name;
		score = new Score();
	}
	
	class Score{	// 내부 인스턴스 클래스
		int eng;
		int math;
		
		public void showInfo() {
			System.out.println("이름 : " + name);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + math);
		}
	}
	
	void usingClass() {
		score.eng = 90;
		score.math = 88;
		score.showInfo();
	}
}
