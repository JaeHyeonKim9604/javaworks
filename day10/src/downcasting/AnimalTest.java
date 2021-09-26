package downcasting;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}

}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 멀리 날아갑니다.");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 걸어갑니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

public class AnimalTest {
	
	public void moveAnimal(Animal animal) {		// 매개변수의 다형성
		animal.move();
	}

	public static void main(String[] args) {
		AnimalTest atest = new AnimalTest();
		//Animal animal = new Human();
		Animal animal = new Eagle();
		
		if(animal instanceof Human) {
			Human human = (Human)animal;
			human.readBook();
		}
		else if (animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.flying();
		}
		
	}

}
