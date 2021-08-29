package day05test;

public class Student {
	private int classNum;
	private String teacherName;

	public Student(int classNum, String teacherName) {
		this.classNum = classNum;
		this.teacherName = teacherName;
	}
	
	public int getClassNum() {
		return classNum;
	}
	
	public String getTeacherName() {
		return teacherName;
	}
}
