package exercise;

import java.util.ArrayList;

public class DogList {

	public static void main(String[] args) {

		ArrayList<Dog> dogList = new ArrayList<>();
		
		// 강아지 3마리 생성
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		
		dog1.setName("백구");
		dog1.setType("진돗개");
		dog2.setName("황구");
		dog2.setType("똥개");
		dog3.setName("검둥이");
		dog3.setType("꺼멍개");
		
		/*
		Dog dog1 = new Dog("백구", "진돗개");
		Dog dog2 = new Dog("황구", "똥개");
		Dog dog3 = new Dog("검둥이", "꺼멍개");
		*/
		
		// 저장
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		
		// 출력
		for(int i = 0; i < dogList.size(); i++) {
			Dog d = dogList.get(i);
			System.out.println(d.showDogInfo());
		}
		
	}

}
