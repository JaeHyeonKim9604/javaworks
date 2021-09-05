package polymorphism;

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
}

class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
}

class Tiger extends Animal{
	
	@Override
	public void move() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

public class AnimalTest {
	
	public void moveAnimal(Animal animal) {		// 매개변수의 다형성
		animal.move();
	}

	public static void main(String[] args) {
		AnimalTest atest = new AnimalTest();
		Animal animal = new Animal();
		Animal human = new Human();
		Animal eagle = new Eagle();
		Animal tiger = new Tiger();
		
		// moveAnimal() 호출
		atest.moveAnimal(animal);
		atest.moveAnimal(human);
		atest.moveAnimal(eagle);
		atest.moveAnimal(tiger);
	}

}
