package inherit;

class Person{
	String name;
	int age;
	
	Person(){}
}

class Engineer extends Person{		// Person을 상속한 Engineer 클래스
	int companyId;
}

public class EngineerTest {

	public static void main(String[] args) {
		Engineer eng = new Engineer();
		
		eng.name = "김덕배";		// 부모 맴버에 접근
		eng.age = 38;			// 부모 맴버에 접근
		eng.companyId = 13;		// 자기 맴버에 접근

	}

}
