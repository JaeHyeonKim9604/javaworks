package forexample;

public class CharsetTest {

	public static void main(String[] args) {
		// 문자 세트 출력
		char ch;
		for(ch=65; ch<123; ch++) { //아스키코드 출력
			System.out.print(ch + " ");
		}
		System.out.println(); // 한줄넣기
		
		for (ch = 12593; ch<12686; ch++) {
			System.out.print(ch + " ");
		}
	}

}
