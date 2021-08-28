package day04test;

public class Customor {
	private String CusName = " ";
	private int CusAge = 0;
	private String CusAdress = " ";
	private long CusAccount = 0;
	private long CusMoney = 0;
	
	public void setAccount(long CusAccount) {
		this.CusAccount = CusAccount;
	}
	
	public void setName(String CusName) {
		this.CusName = CusName;
	}
	
	public void setAge(int CusAge) {
		this.CusAge = CusAge;
	}
	
	public void setAdress(String CusAdress) {
		this.CusAdress = CusAdress;
	}
	
	public void getInfo() {
		System.out.println();
		System.out.println("성함 : " + CusName);
		System.out.println("나이 : " + CusAge);
		System.out.println("주소 : " + CusAdress);
		System.out.println("계좌번호 : " + CusAccount);
	}
	
	public void showAccount() {
		System.out.println();
		System.out.println("계좌번호 : " + CusAccount);
		System.out.println("잔액 : " + CusMoney + "원");
		System.out.println("1. Deposit");
		System.out.println("2. WithDraw");
		System.out.println("3. Back");
	}
	
	public void setCusMoney(long CusMoney) {
		this.CusMoney = CusMoney;
	}
	
	public long getCusMoney() {
		return CusMoney;
	}

}