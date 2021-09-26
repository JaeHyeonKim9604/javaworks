package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// 부모 인터페이스 set에 String 형 자료형 사용
		Set<String> set = new HashSet<>();
		
		// 자료 추가
		set.add("감");
		set.add("귤");
		set.add("사과");
		set.add("귤");		// 중복 불가(중복되는 값은 하나로 합쳐짐)
		set.add("포도");
		
		// 자료의 개수
		System.out.println("총 객체 수 : " + set.size());
		
		// 출력시 순서대로 안나옴(정해진 순서가 없음)
		// 출력 - 리스트 형태
		System.out.println(set);		
		
		// 출력 - 값 형태
		Iterator<String> ir = set.iterator();
		while(ir.hasNext()) {
			String fruit = ir.next();
			System.out.print(fruit + " ");
		}
	}

}
