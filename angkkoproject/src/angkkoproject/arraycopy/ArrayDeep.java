package angkkoproject.arraycopy;

public class ArrayDeep {

	public static void main(String[] args) {
		// 객체 배열 복사하기 - 깊은 복사
		
		// 객체 배열 생성
		Book[] arr1 = new Book[3];	// 원본 객체 배열
		Book[] arr2 = new Book[3];	// 복사 받을 객체 배열
		
		// arr1의 각 요소에 요소 값 입력
		arr1[0] = new Book(111, "aaa");
		arr1[1] = new Book(222, "bbb");
		arr1[2] = new Book(333, "ccc");
		
		// default 생성자를 이용한 arr2의 배열 인스턴스 생성
		arr2[0] = new Book();
		arr2[1] = new Book();
		arr2[2] = new Book();
		
		// arr1을 arr2에 복사
		for(int i = 0; i < arr1.length; i++) {
			arr2[i].setBookNum(arr1[i].getBookNum());	// get, set 메서드를 이용하여 
			arr2[i].setAuthor(arr1[i].getAuthor());		// 요솟값 복사
		}
		
		// arr1 의 요소 값 출력
		System.out.println("변경 전 arr1");
		for(Book arr : arr1) {
			arr.showInfo();
		}
		
		// arr2 의 요소 값 출력
		System.out.println("변경 전 arr2");
		for(Book arr : arr2) {
			arr.showInfo();		// arr1과 같은 요소 값이 나옴
		}
		
		// arr1 의 요소 값 변경
		arr1[0].setBookNum(000);
		arr1[0].setAuthor("xxx");
		
		// arr1 의 요소 값 출력
		System.out.println("변경 후 arr1");
		for(Book arr : arr1) {
			arr.showInfo();
		}
				
		// arr2 의 요소 값 출력
		System.out.println("변경 후 arr2");
		for(Book arr : arr2) {
			arr.showInfo();
		}
		
		/*
		 * 복사 받을 배열인 arr2의 인스턴스를 생성하고
		 * get, set 메서드를 이용해서 복사 해주면
		 * arr1 과 arr2 의 각 요소는 당연히 다른 인스턴스를 가진 상태에서
		 * 값만 입력받는 것이기 때문에
		 * 이후 원본 배열(arr1)의 요소 값이 변경되어도
		 * 복사받은 배열(arr2)의 요소 값에는 영향을 주지 않는다.
		 */
				
	}

}
