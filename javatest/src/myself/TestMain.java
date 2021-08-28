package myself;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		int selcal = 0;
		int x = 0;
		int y = 0;
		int result = 0;
		boolean run = true;
		Scanner num = new Scanner(System.in);
		Calc rsult = new Calc();
		
		while(run) {
			// 첫숫자 입력
			System.out.print("처음 숫자입력 : ");
			x = num.nextInt();
			
			// 부호 입력
			System.out.println("===========================");
			System.out.println("|| 1.+ | 2.- | 3.* | 4./ ||");
			System.out.println("===========================");
			System.out.print("부호입력 : ");
			selcal = num.nextInt();
			
			// 두번째 숫자 입력
			System.out.print("두번째 숫자입력 : ");
			y = num.nextInt();
			
			switch(selcal) {
			case 1:
				result = rsult.SUM(x, y);
				break;
			case 2:
				result = rsult.MIN(x, y);
				break;
			case 3:
				result = rsult.MUL(x, y);
				break;
			case 4:
				result = rsult.DEV(x, y);
				break;
			default:
				run = false;
				break;
			}
				
		System.out.println(result);
		
		}
		num.close();
	}
	
}
