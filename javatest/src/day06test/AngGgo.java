package day06test;

class Ggoong {
	String adress;
	int phoneNum;
}

class Bbang{
	String name;
	int age;
	
	Bbang(){}
	
	Bbang(String name, int age){
		this.name = name;
		this.age = age;
	}
}

public class AngGgo extends Bbang {
	String hidename;
	int hideage;
	int num2;
	
	AngGgo(){}
	
	AngGgo(String name, int age, int num2) {
		super(name, age);
		this.num2 = num2;
	}
	
	public AngGgo getInfo() {
		AngGgo ag = new AngGgo();
		return ag;
	}
	

	public Ggoong Gg() {
		Ggoong g1 = new Ggoong();
		g1.adress = "ABC";
		g1.phoneNum = 1234;
		return g1;
	}
	
	public static void main(String[] args) {
		
		AngGgo ag = new AngGgo("앙꼬", 26, 1);
		
	}

}