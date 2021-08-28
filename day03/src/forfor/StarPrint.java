package forfor;

public class StarPrint {

	public static void main(String[] args) {
		// 별 찍기
		int i, j;
		for(i=1; i<=5; i++) {
			for(j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//삼각형모양 별 찍기
		for(i=1; i<=5; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//역 직각삼각형 모양 별 찍기
		for(i=1; i<=5; i++) {
			for(j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
