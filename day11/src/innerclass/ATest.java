package innerclass;

class A {
	A(){
		System.out.println("A 객체 생성");
	}
	
	class B{	// 내부 인스턴스 클래스
		B(){
			System.out.println("B 객체 생성");
		}
	}
	
	static class C{		// 내부 정적 클래스
		C(){
			System.out.println("C 객체 생성");
		}
	}
	
	void mathod() {		// 지역 내부 클래스
		class D{
			D(){
				System.out.println("D 객체 생성");
			}
		}
		
		D d = new D();
	}
}



public class ATest {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();	// 내부 인스턴스 클래스 선언
		A.C c = new A.C();	// 내부 정적 클래스 선언
		a.mathod();
	}

}
