package object;

import java.util.ArrayList;

public class IntegerTest {

	public static void main(String[] args) {
		//	Integer num1 = new Integer(100);	: 출력은 되나 이렇게 사용하지 않
		Integer num1 = 100;		// 100은 int형, num1은 Integer형 => 자동 형변환 된것(오토박싱)
		int num2 = 200;
		int sum = num1.intValue() + num2;
		// Integer가 int형으로 변환(언박싱)
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(sum);
		
		// valueOf() 매서드 : 정수나 문자열을 Integer클래스로 변환해줌
		Integer n1 = Integer.valueOf("200");
		System.out.println(n1);
		System.out.println(n1 + 1);
		
		// parseInt() 매서드 : 문자열을 숫자로 변환
		int n2 = Integer.parseInt("300");
		System.out.println(n2);
		System.out.println(n2 + 1);
		
		// ArrayList 에 Integer형 자료를 저장
		ArrayList<Integer> numList = new ArrayList<>();
		
		// 자료 추가
		numList.add(1);
		numList.add(4);
		numList.add(7);
		
		// 출력
		for(Integer num : numList) {
			System.out.println(num);
		}
	}

}
