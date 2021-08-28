package forexample;

public class Gugudan {

	public static void main(String[] args) {
		int i, j;
		// 구구단 전체 출력 
		/*for(int i = 2; i<10; i++) {
			System.out.println("== " + i + "단 ==");
			for(int j = 1; j<10; j++) {
				System.out.println(i + "x" + j + " = " + (i*j));
			}
			System.out.println();
		}*/

		// 짝수단 출력
		for(i=2; i<10; i++) {
			if(i%2==0) {
				System.out.println("== " + i + "단 ==");
				for(j = 1; j<10; j++) {
					System.out.println(i + "x" + j + " = " + (i*j));
				}
				System.out.println();
			}
		}
	}

}
