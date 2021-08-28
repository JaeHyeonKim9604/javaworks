package arrays;


public class NumberArray {

	public static void main(String[] args) {
		// 배열 선언
		// 정수형 numbers 이름의 배열 공간(크기) 3개 생성 
		int[] numbers = new int[3];
		
		System.out.println("배열의 개수 : " + numbers.length);
		
		// 값을 접근 - 인덱싱 객체가 값이 없을때
		// 자료형의 초기값 - 객체(null), 정수(0), 문자("")
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		
		for(int i = 0; i<numbers.length; i++) {
			System.out.println("numbers["+i+"] = "+numbers[i]);	
		}
		
	}

}
