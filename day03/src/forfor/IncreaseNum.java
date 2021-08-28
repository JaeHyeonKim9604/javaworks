package forfor;

public class IncreaseNum {

	public static void main(String[] args) {
		// 1씩 증가하는 반복문
		int i, j;
		for(i = 0; i<5; i++) {
			for(j=1; j<=5; j++) {
				int inc = j+(i*5);
				System.out.print("좌석" + inc + " ");
			}
			System.out.println();
		
		}

	}

}
