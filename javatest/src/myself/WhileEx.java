package myself;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int num;
		int mon = 0;
		int mm = 0;
		
		while(run) {
			System.out.println("=============================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("=============================");
			System.out.print("선택>");
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("예금액>");
				mon += sc.nextInt();
				System.out.println("입금되었습니다.");
				break;
			case 2:
				while(true) {
					System.out.println(2);
					mm = sc.nextInt();
					if ((mon - mm) >= 0) {
						mon -= mm; 
						System.out.println("출금처리되었습니다.");
						break;
					}
					else {
						System.out.println("잔액이 부족합니다. 다시 입력해주세요.");
					}
				}
				break;
			case 3:
				System.out.println("잔고>" + mon);
				break;
			case 4:
				run = false; break;
			default:
				System.out.println("잘못된 키를 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		sc.close();

	}

}
