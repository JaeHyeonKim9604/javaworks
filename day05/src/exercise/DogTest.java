package exercise;

public class DogTest {

	public static void main(String[] args) {
		// Dog 인스턴스 5개 생성
		Dog[] doglist = new Dog[5];
		
		// dog 인스턴스 생성 -> doglist에 넣어주기
		Dog dog1 = new Dog();
		dog1.setName("백구1");
		dog1.setType("진돗개1");
		
		Dog dog2 = new Dog();
		dog2.setName("백구2");
		dog2.setType("진돗개2");
		
		Dog dog3 = new Dog();
		dog3.setName("백구3");
		dog3.setType("진돗개3");

		Dog dog4 = new Dog();
		dog4.setName("백구4");
		dog4.setType("진돗개4");
		
		Dog dog5 = new Dog();
		dog5.setName("백구5");
		dog5.setType("진돗개5");
		
		doglist[0] = dog1;
		doglist[1] = dog2;
		doglist[2] = dog3;
		doglist[3] = dog4;
		doglist[4] = dog5;
		
		System.out.println("일반 for 문");
		for(int i = 0; i<doglist.length; i++) {
			System.out.println(doglist[i].showDogInfo());
		}
				
		System.out.println("향상 for 문");
		for(Dog dl : doglist) {
			System.out.println(dl.showDogInfo());
		}
	}

}
