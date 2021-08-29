package staticsample;

public class Student {
	private int id; 		// 학번, 인스턴스 변수
	private String name;    // 이름
	private static int serialNum = 100; // 기준번호, 클래스 변수(클래스 이름으로 접근가능) 
	// static을 붙이면 전역 변수가 됨!
	
	public Student() {
		serialNum++;
		id = serialNum;
	}
	
	// id 를 가져오는 매서드
	public int getId() {
		return id;
	}
	
	// 이름을 입력하는 매서드
	public void setName(String name) {
		this.name = name;
	}
	
	// 이름을 가져오는 매서드
	public String getName() {
		return name;
	}
}
