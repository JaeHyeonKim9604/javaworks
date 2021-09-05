package scoremanage.score;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student(101, "콩쥐");
		
		s1.KoreanSubject("국어", 92);
		s1.mathSubject("수학", 83);
		s1.showInfo();
	}

}
