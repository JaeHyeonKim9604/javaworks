package angkkoproject;

/*
class Person{
	String name;
	int age;
	
	Person(){
		this("이름없음", 1);
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// this를 반환하는 매서드
	Person returnItSelf() {		// 반환형은 클래스 형
		return this;
	}
}
*/

class ThisTest{
	String name;
	int age;
	
	public void testMethod() {
		this.name += " 입니다.";
		this.age -= 1;
	}
}

public class Testtest {

	public static void main(String[] args) {
		/*
		Person noname = new Person();
		System.out.println(noname.name);
		System.out.println(noname.age);
		System.out.println(noname.returnItSelf());
		*/
		
		ThisTest tt2 = new ThisTest();
		ThisTest tt = new ThisTest();
		tt.name = "김재현";
		tt.age = 21;
		
		tt2.name = "김혜빈";
		tt2.age = 26;
		
		tt.testMethod();
		System.out.println("이름은 " + tt.name + " 만 나이는 " + tt.age + "세 입니다.");
		
		tt2.testMethod();
		System.out.println("이름은 " + tt2.name + " 만 나이는 " + tt2.age + "세 입니다.");
		
	}

}
