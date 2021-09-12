/*
 * 학생이 버스와 지하철을 탑승하고
 * 버스 요금과 지하철 요금이 학생이 가진 돈에서 계산되며
 * 각각의 버스와 지하철에는 수입이 누적되는 프로그램
 */
package angkkoproject;

class Bus{
	private int passengerNum = 0;
	private String busNum;
	private int money = 0;
	
	public Bus(String busNum) {
		this.busNum = busNum;
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerNum++;
	}
	
	public void showInfo() {
		System.out.println(this.busNum + "번 지하철의 승객은 " + this.passengerNum + "명이고, 수입은 "
				 + this.money + "원 입니다.");
	}
}

class SubWay{
	private String subwayNum;
	private int passengerNum;
	private int money = 0;
	
	public SubWay(String subwayNum) {
		this.subwayNum = subwayNum;
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerNum++;
	}
	
	public void showInfo() {
		System.out.println(this.subwayNum + "번 지하철의 승객은 " + this.passengerNum + "명이고, 수입은 "
				 + this.money + "원 입니다.");
	}
}

public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// 버스를 탈거다.
	// 버스를 타면 1000원이 사라지고
	// 버스는 1000원을 받게 하자.

	// 버스가 1000원을 받게 하려면 Bus 클래스를 만들어야하고,
	// 그 Bus 클래스에는 take 라는 매서드를 만들어서 버스가 돈을 받을 수 있게 하자.
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubWay(SubWay subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + this.money + "원 입니다.");
	}
	
	// main method
	public static void main(String[] args) {
		Student st1 = new Student("김재현", 100000);
		Student st2 = new Student("김혜빈", 100000);
		
		Bus bus72_1 = new Bus("72-1");
		st1.takeBus(bus72_1);
		
		SubWay line7 = new SubWay("line7");
		st2.takeSubWay(line7);
		
		st1.showInfo();
		bus72_1.showInfo();
		st2.showInfo();
		line7.showInfo();
	}
}
