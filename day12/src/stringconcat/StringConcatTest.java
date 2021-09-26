package stringconcat;

public class StringConcatTest {

	public static void main(String[] args) {
		// 객체 지향 방식과 함수형 인터페이스 방식 비교
		String s1 = "Hello~";
		String s2 = "lambda";
		
		// StringConcatImpl의 객체 concat 생성
		StringConcatImpl concat = new StringConcatImpl();
		concat.makeString("Hello~", "lambda");
		
		// lambda로 구현 - StringConcat 인터페이스의 익명 객체 변수 선언
		StringConcat concat2;
		concat2 = (v1, v2) -> System.out.println(v1 + ", " + v2);
		concat2.makeString(s1, s2);
	}

}
