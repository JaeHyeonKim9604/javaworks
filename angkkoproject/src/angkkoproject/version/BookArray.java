package angkkoproject.version;

public class BookArray {
	
	public static void main(String[] args) {
		Book[] lib = new Book[5];		// Book 인스턴스 주소값을 담을 공간 5개를 생성함
										// Book 인스턴스를 바로 생성하는것은 아님
		
		lib[0] = new Book("태백산맥", "조정래");
		lib[1] = new Book("데미안", "헤르만 헤세");
		lib[2] = new Book("ddd", "asvb");
		lib[3] = new Book("wer", "zczc");
		lib[4] = new Book("ccc", "cc");
		
		// Book 인스턴스인 lib에 각각 담긴 내용을 출력
		for(Book b : lib) {
			b.showInfo();
		}
		
		// Book 인스턴스인 lib의 각 주솟값을 출력
		for(Book b : lib) {
			System.out.println(b);
		}
		
		// Book2에 String 만 넣었을때
		/*
		Book2[] lib2 = new Book2[2];
		
		lib2[0] = new Book2("ddd");
		lib2[1] = new Book2("aaa");
		
		for(Book2 b2 : lib2) {
			b2.showInfo();
		}
		
		System.out.println(lib2[0]);
		*/
		
		Book2 lib3 = new Book2();
		lib3.setBookname("ddd");
		
		
	}

}
