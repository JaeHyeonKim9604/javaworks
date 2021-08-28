package arrays;

public class CharArray {

	public static void main(String[] args) {
		int i;
		// 문자열 배열 선언 및 사용
		String[] cars = {"Morning", "Sonata", "Sportage", "K7"};
		
		// 인덱싱
		System.out.println(cars[3]);

		// "Morning" 을 "BMW"로 변경
		cars[0] = "BMW";
		System.out.println(cars[0]);
		
		// 전체 출력
		for(i=0; i<cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println();
		
		// 향상된 for문
		for(String car : cars) {
			System.out.print(car + " ");
		}
		System.out.println();
		
		// 알파벳 대문자를 배열에 저장
		char j = 65;
		char[] alph = new char[26];
		
		for(i=0; i<alph.length; i++) {
			alph[i] = j;
			j++;
		}
		
		for(i=0; i<alph.length; i++) {
			System.out.println((int)alph[i] + ", " + alph[i] + " ");
		}
	}
}
