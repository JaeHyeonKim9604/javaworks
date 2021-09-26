package innerclass;

public class StudentTest {

	public static void main(String[] args) {
		Student std1 = new Student("김철수");
		
		Student.Score score = std1.new Score();
		
		score.eng = 90;
		score.math = 94;
		score.showInfo();
	}

}
