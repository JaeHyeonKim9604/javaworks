package day05test;

public class StudentArray {

	public static void main(String[] args) {
		Student[] st1 = new Student[3];
		Student[] st2 = new Student[3];
		Student[] st3 = new Student[3];
		
		int i = 1;

		st1[0] = new Student(1, "dd");
		
		for(Student student : st1) {
			student = new Student(i, "DD");
			i++;
		}
	}

}
