package classinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		
		System.out.println("=== 클래스 이름 가져오기 ===");
		// 방법 1
		Class pclass = person.getClass();
		System.out.println(pclass.getName());
		
		// 방법 2
		Class pclass2 = Class.forName("java.lang.String");
		System.out.println(pclass2.getName());
		
		// Person 클래스의 생성자 정보
		System.out.println("==== 생성자 정보 ====");
		Constructor[] cons = pclass.getConstructors();
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println("=== 맴버변수 정보 ===");
		Field[] fields = pclass.getDeclaredFields();
		//Field[] fields = pclass.getFields();  안됨..
		for(Field field : fields) {
			System.out.println(field);
		}
		
		System.out.println("=== 매서드 정보 ===");
		Method[] methods = pclass.getMethods();
		for(Method method : methods) {
			System.out.println(method);
		}
		
	}

}
