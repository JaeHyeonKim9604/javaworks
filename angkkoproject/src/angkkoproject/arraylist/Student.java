package angkkoproject.arraylist;

import java.util.ArrayList;

public class Student {
	int studentId;
	String studentName;
	ArrayList<Subject> subjectlist;	// ArrayList 선언

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjectlist = new ArrayList<>();	// ArrayList 생성
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScore(score);
		subjectlist.add(subject);
	}
	
	public void showStudentInfo() {
		for(Subject sj : subjectlist) {
			System.out.println("학생 " + studentName + "의 " + sj.getName()
							+ "과목 성적은 " + sj.getScore() + "점 입니다.");
		}
	}
}
