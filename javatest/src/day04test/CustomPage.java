package day04test;

public class CustomPage {

	public void mainPage() {
		System.out.println();
		System.out.println("=================================");
		System.out.println("| 1.MyPage | 2.Setting | 3.Exit |");
		System.out.println("=================================");
	}
	
	public void myPage() {
		System.out.println();
		System.out.println("==============MyPage=============");
		System.out.println("=================================");
		System.out.println("| 1.MyInfo | 2.MyAcount | 3.Back |");
		System.out.println("=================================");
	}
	
	public void Setting() {
		System.out.println();
		System.out.println("====================Setting=====================");
		System.out.println("================================================");
		System.out.println("| 1.SetName | 2.SetAge | 3.SetAdress | 4. Back |");
		System.out.println("================================================");
	}
	
	public void Logo() {
		System.out.println();
		System.out.println("**************************");
		System.out.println("**************************");
		System.out.println("|      jjaejjaeBank      |");
		System.out.println("**************************");
		System.out.println("**************************");
	}
	
	public void Error() {
		System.out.println("잘못된 키를 입력하셨습니다.");
		System.out.println("다시 입력해주세요.");
	}
}
