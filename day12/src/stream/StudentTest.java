package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("콩쥐", 90),
				new Student("팥쥐", 80),
				new Student("심청", 75)				
		);
		// 클래스로부터 스트림 얻기 - stream 사용하면 소모
		Stream<Student> stream = list.stream();
		stream.forEach(student -> {
			String name = student.getName();
			int score = student.getScore();
			System.out.println(name + ", " + score);
		});
		
		// Map() 함수로 학생의 이름만 출력, 새로 스트림 생성
		stream = list.stream();
		stream.map(s -> s.getName()).forEach(std -> System.out.println(std));
		
		// 점수만 출력
		stream = list.stream();
		stream.map(sc -> sc.getScore()).forEach(std -> System.out.println(std));
		
		// 점수가 80이상인 학생의 이름
		stream = list.stream();
		stream.filter(s -> s.getScore() >= 80.).map(s -> s.getName())
			.forEach(std -> System.out.println(std));
	}

}
