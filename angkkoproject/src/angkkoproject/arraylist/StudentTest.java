package angkkoproject.arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student std1 = new Student(101, "kim");
		std1.addSubject("수학", 99);
		std1.addSubject("국어",88);
		
		Student std2 = new Student(102, "lee");
		std2.addSubject("수학", 97);
		std2.addSubject("국어", 98);
		
		std1.showStudentInfo();
		std2.showStudentInfo();
	}

}
