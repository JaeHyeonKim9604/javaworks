package day04test;

import java.util.Scanner;

public class CustomSystem {

	CustomSystem(){}
	
	CustomPage pg = new CustomPage();
	Customor cus = new Customor();
	Scanner sc = new Scanner(System.in);
	
	int num1 = 0;
	int num2 = 0;
	int num3 = 0;
	long money = 0;
	long minusmoney = 0;
	String name = " ";
	int age = 0;
	String adress = " ";
	
	public void MyPage() {
		int i = 0;
		do {
			pg.myPage();
			num2 = sc.nextInt();
			switch(num2) {
			case 1:
				cus.getInfo();
				break;
			case 2:
				MyAccount();
				break;
			case 3:
				i += 1;
				break;
			default:
				pg.Error();
				break;
			}
		} while(i == 0);

	}
	
	public void MyAccount() {
		int j = 0;
		do {
			cus.showAccount();
			num3 = sc.nextInt();
			switch(num3) {
			case 1:
				Deposit();
				break;
			case 2:
				WithDraw();
				break;
			case 3:
				j += 1;
				break;
			default:
				pg.Error();
				break;
			}
		} while(j == 0);
		
	}
	
	public void Deposit() {
		System.out.print("입금 금액 입력>>");
		money += sc.nextLong();
		cus.setCusMoney(money);
		}
	
	public void WithDraw() {
		System.out.print("출금 금액 입력>>");
		minusmoney = sc.nextLong();
		if(minusmoney > money) {
			System.out.println();
			System.out.println("잔액이 부족합니다.");
			System.out.println("잔액을 확인해주세요.");
			System.out.println();

		}
		else if(minusmoney <= money) {
			if(minusmoney == 0) {
				System.out.println(minusmoney + "원보다 큰 금액을 출금해주세요.");
			}
			money -= minusmoney;
			cus.setCusMoney(money);
		}
		
	}
	
	public void Setting() {
		int n = 0;
		do {
			pg.Setting();
			num2 = sc.nextInt();
			
			switch(num2) {
			case 1:
				SetName();
				break;
			case 2:
				SetAge();
				break;
			case 3:
				SetAdress();
				break;
			case 4:
				n += 1;
				break;
			default:
				break;
			}
			
		} while(n == 0);
		
	}
	
	public void SetName() {
		sc.nextLine();
		System.out.print("성함을 입력해주세요>>");
		name = sc.nextLine();
		cus.setName(name);
	}
	
	public void SetAge() {
		System.out.print("나이를 입력해주세요>>");
		age = sc.nextInt();
		cus.setAge(age);
	}
	
	public void SetAdress() {
		sc.nextLine();
		System.out.print("주소를 입력해주세요>>");
		adress = sc.nextLine();
		cus.setAdress(adress);
	}

	public void Exit() {
		pg.Logo();
		System.out.print("이용해주셔서 감사합니다.");
		return;
	}
	
	public void MainPage() {
		int n = 0;
		do {
		pg.mainPage();
		num1 = sc.nextInt();
		
			switch(num1) {
			case 1:
				MyPage();
				break;
			case 2:
				Setting();
				break;
			case 3:
				Exit();
				n++;
				break;
			default:
				pg.Error();
				return;
			}			
		} while(n == 0);
	
	}
	
}
