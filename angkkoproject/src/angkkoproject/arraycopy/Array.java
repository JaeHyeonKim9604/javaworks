package angkkoproject.arraycopy;

public class Array {
	public static void main(String[] args) {
		// 정수형 배열 복사하기
		// 정수형 배열 선언
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		
		// array1 의 요소를 array2 로 복사
		System.arraycopy(array1, 0, array2, 1, 4);	// 'array1' 의 '0'번째 요소를 'array2'의 '1'번째 위치부터 '4'개 붙여넣기
		
		for(int a2 : array2) {		// 출력 : 1, 10, 20, 30, 40
			System.out.println(a2);	
		}
		
		
		// 객체 배열 복사하기
		// 객체 배열 선언
		Book[] lib1 = new Book[5];
		Book[] lib2 = new Book[5];
		
		// 객체 배열에 요소 넣기
		lib1[0] = new Book(1, "aaa");
		lib1[1] = new Book(2, "bbb");
		lib1[2] = new Book(3, "ccc");
		lib1[3] = new Book(4, "ddd");
		lib1[4] = new Book(5, "eee");
		
		// lib1의 요소를 lib2 로 복사
		System.arraycopy(lib1, 0, lib2, 0, 5);
		
		// lib1의 요소 출력
		System.out.println("===lib1===");
		for(Book l1 : lib1) {
			l1.showInfo();
		}

		// lib2의 요소 출력
		System.out.println("===lib2===");
		for(Book l2 : lib2) {		// 출력
			l2.showInfo();
		}
		
		// lib1의 요소값 변경
		lib1[0].setBookNum(9);
		lib1[0].setAuthor("xxx");
		
		// lib2의 요소 출력
		System.out.println("===lib2===");
		for(Book l2 : lib2) {		// 출력
			l2.showInfo();
		}
		
		/*
		 * lib1의 요솟값을 변경했는데 이전에 복사받은 lib2의 요솟값 또한 변경되었음
		 * 이는 객체 배열의 요소에 저장된 값이 인스턴스의 주솟값이기 때문이며
		 * 복사시, 인스턴스 생성 -> 요솟값 가져오기  가 아니라
		 * 인스턴스의 주솟값만 복사하는것임.
		 * 즉, 서로 다른 배열 lib1 과 lib2는 각 요소(lib1[0] 와 lib2[0] 등)가 같은 인스턴스를 가리키는것
		 * =>>> 이처럼 주솟값만 복사하는 것을 '얕은 복사' 라 함
		 */
	}
}
